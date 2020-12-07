grammar g;

tokens {INDENT, DEDENT}

    /*
    added some custom lexing because lexing indents is a mess
    should work with file
    */
@lexer::members {
    private final java.util.Queue<Token> pendingTokens = new java.util.LinkedList<>();
    private Token prev = null;
    private int cur_tabs = 0;
    @Override
    public Token nextToken() {
        if(!pendingTokens.isEmpty()) {
            prev = pendingTokens.poll();
            return prev;
        }

        Token token = super.nextToken();
        pendingTokens.add(token);

        if(token.getType() != gParser.EOL || prev == null) {
            prev = token;
            return pendingTokens.poll();
        }

        if(prev.getType() == COLON) {
            cur_tabs++;
            pendingTokens.add(new CommonToken(gParser.INDENT));
        }

        String expected_tabs = "";
        for(int i=0; i<cur_tabs; i++)
            expected_tabs += "    ";

        Token next = super.nextToken();

        if(next.getType() != TABS) {
            for(int i=0; i<cur_tabs; i++) {
                pendingTokens.add(new CommonToken(gParser.DEDENT));
            }
            cur_tabs = 0;
            pendingTokens.add(next);
            return pendingTokens.poll();
        }
        if(next.getText().length() != expected_tabs.length()) {
            int loop = (expected_tabs.length() - next.getText().length()) / 4;
            for(int i=0; i<loop; i++) {
                cur_tabs--;
                pendingTokens.add(new CommonToken(gParser.DEDENT));
            }
        }

        return pendingTokens.poll();
    }

}

start: (statement | EOL)*;

statement: exp=expr                             #exprStatement
         | 'print(' exp=expr ')'                #printStatement
         | 'while' exp=expr COLON EOL block=statement_block     #whileStatement
         | 'for' var=VARIABLE ' in range(' begin=expr ',' end=expr ')' COLON EOL block=statement_block #forStatement
         | COMMENT                              #commentStatement
         | var=VARIABLE asgn=ASSIGNMENT exp=expr                #assignmentStatements
         | var=VARIABLE '=' exp=expr            #assignmentStatement
         ;

statement_block: INDENT (stat=statement EOL*)+ DEDENT;

expr: atom=INT                                  #atomIntExpr
    | atom=FLOAT                                #atomFloatExpr
    | atom=STRING                               #atomStringExpr
    | var=VARIABLE                              #atomVarExpr
    | 'break'                                   #breakExpr
    | '(' exp=expr ')'                          #parnExpr
    | left=expr cndl=CNDL right=expr            #conditionalExpr
    | l=expr arth=ARTH r=expr                   #arithmeticExpr
    ;

ARTH: '+'|'-'|'*'|'/'|'%'|'^'; // arithmetic operators
CNDL: '=='|'!='|'<'|'<='|'>'|'>='; // conditional operators
INT: '-'?[0-9]+;
FLOAT: '-'?([0-9]*[.])?[0-9]+;
STRING: '"' (~["\r\n] | '""')* '"' | '\'' (~['\r\n] | '""')* '\'';
COMMENT: '#'(~[\r\n])*;
VARIABLE: [a-zA-Z][a-zA-Z0-9]*;
TABS: '    '+;
COLON: ':';
EOL: '\n' | '\r\n' | '\r';
WS: [ \t]+ -> skip;
ASSIGNMENT: '+='|'-='|'*='|'/='|'^='|'%=';
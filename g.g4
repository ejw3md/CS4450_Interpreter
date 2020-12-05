grammar g;

start: (statement EOL*)*;

statement:  var=VARIABLE '=' exp=expr           #assignmentStatement
         |  exp=expr                            #exprStatement
         | 'print(' exp=expr ')'                #printStatement
         | 'while ' exp=expr ':' EOL block=statement_block     #whileStatement
         | 'for ' var=VARIABLE ' in range(' begin=expr ',' end=expr ')' ':' EOL block=statement_block #forStatement
         | COMMENT                              #commentStatement
         ;

// kinda jank. Will (probably) work for test file
statement_block: (('\t\t\t' | '            ' | '\t\t' | '        ' | '\t' | '    ') stat=statement EOL)+;

expr: atom=INT                                  #atomIntExpr
    | atom=FLOAT                                #atomFloatExpr
    | atom=STRING                               #atomStringExpr
    | var=VARIABLE                              #atomVarExpr
    | 'break'                                   #breakExpr
    | '(' exp=expr ')'                          #parnExpr
    | left=expr op=('*'|'/') right=expr         #opExpr //TODO
    | left=expr op=('+'|'-') right=expr         #opExpr //TODO
    | op=('+'|'-') exp=expr                     #unaryOpExpr //TODO
    | left=expr cndl=CNDL right=expr            #conditionalExpr
    ;

CNDL: '=='|'!='|'<'|'<='|'>'|'>='; // conditional operators
INT: [0-9]+;
FLOAT: ([0-9]*[.])?[0-9]+;
STRING: '"' (~["\r\n] | '""')* '"' | '\'' (~['\r\n] | '""')* '\'';
COMMENT: '#'(~[\r\n])*;
VARIABLE: [a-zA-Z][a-zA-Z0-9]*;
WS: [ \t]+ -> skip;
EOL: '\n' | '\r\n' | '\r';
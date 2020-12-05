grammar g;

start: (statement EOL*)*;

statement:  var=VARIABLE '=' exp=expr           #assignmentStatement
         |  exp=expr                            #exprStatement
         | 'print(' exp=expr ')'                #printExpr
         | COMMENT                              #commentExpr
         ;


expr: atom=INT                                  #atomIntExpr
    | atom=FLOAT                                #atomFloatExpr
    | atom=STRING                               #atomStringExpr
    | var=VARIABLE                              #atomVarExpr
    | '(' exp=expr ')'                          #parnExpr
    | left=expr op=('*'|'/') right=expr         #opExpr //TODO
    | left=expr op=('+'|'-') right=expr         #opExpr //TODO
    | op=('+'|'-') exp=expr                     #unaryOpExpr //TODO
    ;

INT: [0-9]+;
FLOAT: ([0-9]*[.])?[0-9]+;
STRING: '"' (~["\r\n] | '""')* '"' | '\'' (~['\r\n] | '""')* '\'';
COMMENT: '#'(~[\r\n])*;
VARIABLE: [a-zA-Z][a-zA-Z0-9]*;
WS: [ \t]+ -> skip;
EOL: '\n' | '\r\n' | '\r';
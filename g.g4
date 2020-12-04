grammar g;

start: (expr EOL+)*;

expr: atom=INT                                  #atomIntExpr
    | atom=FLOAT                                #atomFloatExpr
    | atom=STRING                               #atomStringExpr
    | var=VARIABLE                              #atomVarExpr
    | '(' exp=expr ')'                          #parnExpr
    | left=expr op=('*'|'/') right=expr         #opExpr
    | left=expr op=('+'|'-') right=expr         #opExpr
    | var=VARIABLE '=' exp=expr                 #assignmentExpr
    | op=('+'|'-') exp=expr                     #unaryOpExpr
    | 'print(' exp=expr ')'                     #printExpr
    ;

INT: [0-9]+;
FLOAT: [0-9]*[.][0-9]+;
VARIABLE: [a-zA-Z][a-zA-Z0-9]*;
WS: [ \t]+ -> skip;
EOL: '\n' | '\r\n' | '\r';

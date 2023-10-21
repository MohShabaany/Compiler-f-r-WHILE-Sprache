grammar Whilelang;

program: statement (';' statement)* ';'?;

statement: assignment | loop | whileDoLoop | print;

assignment: VARIABLE ':=' expression;

loop: 'loop' term 'do' '{' program '}';

whileDoLoop: 'while' '(' condition ')' 'do' '{' program '}';

condition: VARIABLE comparisonOperator CONSTANT;

comparisonOperator: '==' | '!=' | '<' | '>' | '<=' | '>=';

expression: term | term ('+' | '-') term;

print: 'print' '(' expression ')';

term: VARIABLE | CONSTANT;

VARIABLE: [a-zA-Z_][a-zA-Z0-9_]*;
CONSTANT: [0-9]+;

Comment: '//' ~[\r\n]* -> skip;
Space: [ \t\r\n]+ -> skip;


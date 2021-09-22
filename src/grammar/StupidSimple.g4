grammar StupidSimple;

file: statement+  | EOF;

statement: declare | assign | print | loop |expression;

declare: 'this is' ID;

assign: ID 'has' expression;

expression: unaryExpression | addExpression;

print: 'print' ID;

addExpression: unaryExpression 'plus' expression;

unaryExpression: INT | ID;

INT: ('0'..'9')+;
ID: ('a'..'z')+;
WS: [ \t\r\n]+ -> skip;

OPEN_PAREN: '(';
CLOSE_PAREN: ')';
LE: 'is less than';
EQUAL: 'equals';

loop: startloop loopbody endloop;
cond: unaryExpression LE unaryExpression;

startloop: 'loop while ' OPEN_PAREN cond CLOSE_PAREN;
loopbody: statement+;
endloop: 'end while';

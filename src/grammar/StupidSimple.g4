grammar StupidSimple;

file: code;

code: statement ';'+;

statement: declare | print | assign; //ordna som enligt Johan

declare: 'this is' ID;

print: 'print' ID;

assign: ID 'has ' expression;

expression: unaryExpression | addExpression;

addExpression: unaryExpression 'plus' unaryExpression;

unaryExpression: INTEGER | ID;

INTEGER: [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9]+;
WS: [ \t\r\n];

OPEN_PAREN: '(';
CLOSE_PAREN: ')';
ADD: 'plus';
SUB: 'minus';
ADD_ASSIGNMENT: 'increase with';
LE: 'is less than';
EQUAL: 'equals';

loop: startloop loopbody endloop;
cond: unaryExpression LE unaryExpression;

startloop: 'loop while' OPEN_PAREN cond CLOSE_PAREN;
loopbody: statement | expression;
endloop: 'end while';

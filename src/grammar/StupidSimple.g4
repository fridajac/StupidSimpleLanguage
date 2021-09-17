grammar StupidSimple;

file: code;

code: statement ';'+;

statement: declare | print | assign; //ordna som enligt Johan

declare: 'this is ' ID;

print: 'print this ' unaryExpression;

assign: unaryExpression 'has ' unaryExpression;

expression: unaryExpression | addExpression;

addExpression: unaryExpression 'plus' unaryExpression;

unaryExpression: INTEGER | ID;

INTEGER: [0-9]+;
ID: [a-zA-Z_] [a-zA-Z_0-9]+;
WS: [ \t\r\n];

open_paren: '(';
close_paren: ')';
rcurl: 'curlyb';
add: 'plus';
sub: 'minus';
add_assignment: 'increase with';
le: 'less than';
equal: 'equals';
loop: startloop loopbody endloop;

startloop: 'while';
loopbody: code;
endloop: 'end while';

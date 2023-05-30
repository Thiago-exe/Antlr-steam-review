grammar Hello;

// Lexer rules
JSON_START : '{';
JSON_END : '}';
COLON : ':';
COMMA : ',';
STRING : '"' (~["\r\n] | '\\"' | '\\\\' | '\\/' | '\\b' | '\\f' | '\\n' | '\\r' | '\\t' | '\\u' HEX)* '"';
NUMBER : '-'? INT ('.' [0-9]+)? EXP?;
HEX : [0-9a-fA-F];
fragment INT : '0' | [1-9] [0-9]*;
fragment EXP : [eE] [+-]? INT;

WHITESPACE : [ \t\r\n] -> skip;

// Parser rules
json : JSON_START json* JSON_END | data;
data : STRING COLON value next?;
next : COMMA;
value : STRING
      | NUMBER
      | json
      | array
      | 'true'
      | 'false'
      | 'null';

array : '[' (value (COMMA value)*)? ']';

// Ignoring line and block comments
COMMENT : '//' ~[\r\n]* -> skip;
COMMENT_BLOCK : '/*' .*? '*/' -> skip;

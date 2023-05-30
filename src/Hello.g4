grammar Hello;

// Lexer rules
JSON_START : '{';
JSON_END : '}';
COLON : ':';
COMMA : ',';
STRING : '"' (~["\r\n] | '\\"' | '\\\\' | '\\/' | '\\b' | '\\f' | '\\n' | '\\r' | '\\t' | '\\u' HEX HEX HEX HEX)* '"';
NUMBER : '-'? INT ('.' [0-9]+)? EXP?;
HEX : [0-9a-fA-F];
fragment INT : '0' | [1-9] [0-9]*;
fragment EXP : [eE] [+-]? INT;

WHITESPACE : [ \t\r\n] -> skip;

// Parser rules
json : JSON_START info* JSON_END;
info : STRING COLON value;
value : STRING
      | NUMBER
      | json
      | reviews
      | 'true'
      | 'false'
      | 'null';

reviews : '[' (value (COMMA value)*)? ']';

// Ignoring line and block comments
COMMENT : '//' ~[\r\n]* -> skip;
COMMENT_BLOCK : '/*' .*? '*/' -> skip;

grammar Hello;

JSON_INICIO : '{';
JSON_FIM : '}';
DOISPONTOS : ':';
VIRGULA : ',';
TEXTO : '"' (~["\r\n] | '\\"' | '\\\\' | '\\/' | '\\b' | '\\f' | '\\n' | '\\r' | '\\t' | '\\u' CARACTERES)* '"';
NUMERO : '-'? INT ('.' [0-9]+)? EXP?;
CARACTERES : [0-9a-zA-Z\u00C0-\u017F];

fragment INT : '0' | [1-9] [0-9]*;
fragment EXP : [eE] [+-]? INT;

WHITESPACE : [ \t\r\n] -> skip;

json : JSON_INICIO json* JSON_FIM | tipo_informacao;
tipo_informacao : TEXTO DOISPONTOS valor separador?;
separador : VIRGULA;
valor : TEXTO
      | NUMERO
      | json
      | array
      | 'true'
      | 'false'
      | 'null';

array : '[' (valor (VIRGULA valor)*)? ']';

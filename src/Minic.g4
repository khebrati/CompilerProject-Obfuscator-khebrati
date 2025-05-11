grammar Minic;

program
    : statement* EOF
    ;

statement
    : block                                                                 # blockStatement
    | SEMI                                                                  # emptyStatement
    | Identifier assignBodyOrArgsList                                       # assignmentOrFunCall
    | type Identifier decOrFunBody                                          # decOrFunDefinition
    | 'if' parExpression ifBody=statement ('else' elseBody=statement)?      # ifStatement
    | 'while' parExpression statement                                       # whileStatement
    | 'break' SEMI                                                          # breakStatement
    | 'exit' '(' ')' SEMI                                                   # exitStatement
    | 'print' parExpression SEMI                                            # printStatement
    | 'println' parExpression SEMI                                          # printlnStatement
    | RETURN_KEYWORD (expression)? SEMI                                     # returnStatement
    ;

assignBodyOrArgsList: assignBody | callArgsList SEMI;

assignBody : assignmentOp expression SEMI;

assignmentOp : '=';

callArgsList:
LPAR (expression(COMMA expression)*)? RPAR;

arg: Identifier;

decOrFunBody:
    declarationBody | paramListBlock;

paramListBlock:
    paramList block;

paramList:
    LPAR (param(COMMA param)*)? RPAR;

declarationBody : (assignmentOp expression)? SEMI;

param:
    type Identifier;
block
    : '{' statement* '}'
    ;

expression
    : literal                                                           # literalExpression
    | Identifier argsListOrNothing                                      # variableOrFunctionCall
    | op=('!' | '-') expression                                         # unaryOperation
    | left=expression op=('*' | '/' | '%') right=expression             # binaryOperation
    | left=expression op=('+' | '-') right=expression                   # binaryOperation
    | left=expression op=('<' | '>' | '<=' | '>=') right=expression     # binaryOperation
    | left=expression op=('==' | '!=') right=expression                 # binaryOperation
    | left=expression op='&&' right=expression                          # binaryOperation
    | left=expression op='||' right=expression                          # binaryOperation
    | parExpression                                                     # parenthesesExpression
    | 'readInt' '(' ')'                                                 # readInt
    | 'readDouble' '(' ')'                                              # readDouble
    | 'readLine' '(' ')'                                                # readLine
    | 'toString' parExpression                                          # toString
    ;

argsListOrNothing:
    (paramList)?;


parExpression : '(' expression ')';


type : INT_TYPE     # intType
     | DOUBLE_TYPE  # doubleType
     | BOOL_TYPE    # booleanType
     | STRING_TYPE  # stringType
     ;

literal : IntegerLiteral        # int
        | FloatingPointLiteral  # float
        | StringLiteral         # string
        | BooleanLiteral        # boolean
        ;

// lexer rules (starting with uppercase)

IntegerLiteral : DIGIT+;
FloatingPointLiteral : DIGIT+ '.' DIGIT+;
StringLiteral : '"' (ESC | ~["\\])* '"' ;
BooleanLiteral : 'true' | 'false';

SEMI : ';';

fragment
DIGIT : '0'..'9';

fragment
LETTER : ('a'..'z' | 'A'..'Z');

fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;


WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

BLOCK_COMMENT : '/*' .*? '*/' -> skip
              ;

LINE_COMMENT : '//' ~[\r\n]* -> skip
             ;

// tokens, needed to be able to be able to reference them via constants

IF_KEYWORD: 'if';
ELSE_KEYWORD: 'else';
WHILE_KEYWORD: 'while';
BREAK_KEYWORD: 'break';
CONTINUE_KEYWORD: 'continue';
RETURN_KEYWORD: 'return';

EXIT_KEYWORD: 'exit';
READ_INT_KEYWORD: 'readInt';
READ_DOUBLE_KEYWORD: 'readDouble';
READ_LINE_KEYWORD: 'readLine';
TO_STRING_KEYWORD: 'toString';
PRINT_KEYWORD: 'print';
PRINTLN_KEYWORD: 'println';

INT_TYPE: 'int';
DOUBLE_TYPE: 'double';
STRING_TYPE: 'string';
BOOL_TYPE: 'bool';

MUL : '*';
DIV : '/';
PLUS : '+';
MINUS : '-';
MOD : '%';
LT : '<';
GT : '>';
LTEQ : '<=';
GTEQ : '>=';
ASSIGN : '=';
EQ : '==';
NOTEQ : '!=';
NOT : '!';
AND : '&&';
OR : '||';
LPAR: '(';
RPAR: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';

// must be last, otherwise some tokens like types, keywords may be incorrectly recognized as identifiers
Identifier : (LETTER | '_') (LETTER | DIGIT | '_')* ;
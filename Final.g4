/**Assignment 2 CS320 Jonida Durbaku */
/**Grammar using Antlr4 for parsing kangarooCode.txt and its tokens */

grammar Final;
/** Parser Rules */
//The start rule: begin parsing here
program: declaration+statement+clazz+; 
declaration: IDENTIFIER  IDENTIFIER ';' ;
statement: assigstmt|ifstmt|printstmt|returnstmt;

//different types of statements listed
assigstmt: (IDENTIFIER '=' expression ';') | (IDENTIFIER assigstmt)  ;
ifstmt: IDENTIFIER '(' identifier '==' expression ')' statement+ IDENTIFIER;  
returnstmt: IDENTIFIER expression ';';
printstmt: IDENTIFIER term ';';

expression: (term ('+'|'*') term) | term;
term: integer| identifier;
integer: NUMBER;
identifier: IDENTIFIER;

clazz: IDENTIFIER identifier '{' body '}';
body: statement*clazz*block*method*;
block: '{' (block|statement) '}';
method: IDENTIFIER identifier '()' block;

/** Tokens/Lexer Rules */
//match strings with at least one lowercase or uppercase letter 
//the second part match the string "Last Block" in the .txt file
IDENTIFIER: ([A-Za-z]+)|('"' [A-Za-z ]+ '"'); 
//match integers
NUMBER: [0-9]+;
//skip whitespaces, tabs, and new lines
WS : [ \t\r\n]+ -> skip;
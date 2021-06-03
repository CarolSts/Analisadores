class Sintatico extends Parser;
{
	//Codigo Java
}

regra	: expr T_EOF
		;

expr	: termo ( ( T_mais | T_menos ) termo )*
		;

termo	: fator ( ( T_vezes | T_divisao ) fator)*
		;

fator	: T_num | T_id
		;


class Lexico extends Lexer;

T_EOF	: ';'
		;

T_mais	: '+'
		;

T_menos	: '-'
		;

T_vezes	: '*'
		;

T_divi	: '/'
		;

T_num	: ('0'..'9')+
		;

T_id 	: (('a'..'z') | ('A'..'Z')) (('a'..'z') | ('A'..'Z') | ('0'..'9'))*
		;

T_space	: ' ' | '\t' | '\n' | '\r' { _ttype = Token.SKIP; }
		;
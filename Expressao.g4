grammar Expressao;
//Gramatica

//Declaração de regras lexicas são definidas com os caracteres iniciando em maiusculo

T_eof   : '='
        ;

T_mais  : '+'
        ;

T_menos : '-'
        ;

T_vezes : '*'
        ;

T_divisao  : '/'
        ;

T_num   : ('0'..'9')+
        ;

T_ID    : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

Espaco  : ( ' ' |'\t' | '\r' | '\n') -> skip
        ;

//Fim da declaração



//Declaração de regras sintaticas são definidas com os caracteres iniciando em minusculo


regra   : expr T_eof
        ;

expr    : termo ( ( T_mais { System.out.println("->Soma");} | T_menos { System.out.println("->Subtracao");} ) termo )*
        ;

termo   : fator ( ( T_vezes { System.out.println("->Multiplicacao");} | T_divisao { System.out.println("->Divisao");} ) fator)*
        ;

fator   : (T_num { System.out.println("Numero->"+LT(0).getText());} )
        ;

//Fim da declaração
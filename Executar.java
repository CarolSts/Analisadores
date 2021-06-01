public class Executar{
	public static void main(String args[]){
		try{
			System.out.println("--Analidor Lexico/Sintatico/Semantico--");
			ExpressaoLexer lexico = new ExpressaoLexer(System.in);
			ExpressaoParser sintatico = new ExpressaoParser(lexico);
			ExpressaoSemantic semantico = new ExpressaoSemantic(sintatico);
			//sintatico.regra();//regra
			//double resultado = sintatico.regra();
			//System.out.printf( “%s = %.2f\n”, regra, resultado );
			//int val = parser.programa().val;
        	//System.out.println("Resultado = " + val);			
			System.out.println("--------------Sucesso!----------------");
		}
		catch(Exception ex){
			System.out.println("-----------------Erro!----------------");
			ex.printStackTrace();
		}
	}
}
//analise semantica implementada na gramatica (gramatica.g)
//este arquivo trabalha com a gramatica e com o Listener da arvore sintatica, retornando os tokens e erros de analise
public class ExpressaoSemantic extends ExpressaoListener{
	public static void main(String args[]){
		try{
			System.out.println("--Analidor Lexico/Sintatico/Semantico--");
			ExpressaoLexer lexico = new ExpressaoLexer(System.in);
			ExpressaoParser sintatico = new ExpressaoParser(lexico);
			sintatico.regra();
			System.out.println("--------------Sucesso!----------------");
		}
		catch(Exception ex){
			System.out.println("-----------------Erro!----------------");
			ex.printStackTrace();
		}
	}
}
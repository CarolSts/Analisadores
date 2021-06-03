public class Executar{
	public static void main(String args[]){
            String dados = "a = 1; b = 1 + a; Executar (b);";
		try{
			System.out.println("--Analisador Lexico/Sintatico/Semantico--");
			Lexico lexico = new Lexico(dados);//System.in | dados
			Sintatico sintatico = new Sintatico();
			Semantico semantico = new Semantico();
			sintatico.parse(lexico, semantico);
		}
		catch(LexicalError | SyntaticError | SemanticError e){
			System.out.println("\n ------Erro ao tentar converter o resultado!------");
		}
	}
}
public class Executar{
	public static void main(String args[]){
		try{
			System.out.println("--Analidor Lexico/Sintatico--");
			Lexico lexico = new Lexico(System.in);
			Sintatico sintatico = new Sintatico(lexico);
			sintatico.regra();	
			System.out.println("-----------Compilado com sucesso!----------------");
		}
		catch(Exception ex){
			System.out.println("---------Erro de ao tentar compilar!-------------");
			ex.printStackTrace();
		}
	}
}
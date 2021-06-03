import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Semantico implements Constants
{
    Stack<Integer> stack = new Stack<>();
    Map<String, Integer> vars = new HashMap<String, Integer>();
    String varAtual;
    
    public void executeAction(int action, Token token)  throws SemanticError
    {
        Integer a,b;
        switch (action){
            case 1: //Montar a pilha
                stack.push(Integer.parseInt(token.getLexeme(),2));
                break;
            case 2: //Realizar adi��o
                b = stack.pop();
                a = stack.pop();
                
                stack.push(a.intValue() + b.intValue());
                System.out.println(varAtual);
                break;
                
            case 3: //Realizar multipli��o
                b = stack.pop();
                a = stack.pop();
                
                stack.push(a.intValue() + b.intValue());
                break;
                
            case 4: //Montar a pilha
                stack.push(vars.get(token.getLexeme()));
                break;
                
            case 5://Realizar subtra��o
                b = stack.pop();
                a = stack.pop();
                
                stack.push(a.intValue() - b.intValue());
                break;
                
            case 6://Realizar divis�o
                b = stack.pop();
                a = stack.pop();
                
                stack.push(a.intValue() / b.intValue());
                break;
                
            case 7://Realizar exponencia��o
                b = stack.pop();
                a = stack.pop();
                Double A = Math.pow(a, b);
                stack.push(A.intValue());
                break;
                
            case 8: //Executar
                System.out.println("O resultado �: " + Integer.toBinaryString(vars.get(varAtual)) + "/n");
                break;
                
            case 9: // Salvar a vari�vel e o valor
                vars.put(varAtual, stack.pop());
                break;
                
            case 10: // Receber a vari�vel atual
                varAtual = token.getLexeme();
                break;
                
            default:
                System.out.println("Erro no empilhamento!");
        }
        System.out.println("\n A��o #"+action+", Token: "+token);
        System.out.println("Empilhamento executado com sucesso!");
    }   
}

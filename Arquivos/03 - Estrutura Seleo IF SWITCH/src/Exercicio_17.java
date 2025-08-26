import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        /*
        Implemente um algoritmo em JAVA que escreva a seguinte mensagem na tela,
        substituindo a profissão pela informada pelo usuário:
        "Tibúrcio é <profissão>"
        Solicite ao usuário que informe a profissão do Tibúrcio, apresente as seguintes
        opções:
         e engenheiro
         p programador
         m médico
         a advogado
         d designer
         Se informada opção diferente das apresentadas a profissão é DESEMPREGADO.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("informe a profissão de Tibúrcio com: \n" +
                "(e) engenheiro\n" +
                "(p) programador\n" +
                "(m) médico\n" +
                "(a) advogado\n" +
                "(d) designer");
        String profissao = sc.nextLine();

        /*
        if(profissao.equalsIgnoreCase("e")){
            System.out.println("Tibúrcio é engenheiro");
        } else if (profissao.equalsIgnoreCase("p")){
            System.out.println("Tibúrcio é programador");
        }  else if (profissao.equalsIgnoreCase("m")){
            System.out.println("Tibúrcio é médico");
        }  else if (profissao.equalsIgnoreCase("a")){
            System.out.println("Tibúrcio é advogado");
        }  else if (profissao.equalsIgnoreCase("d")){
            System.out.println("Tibúrcio é designer");
        } else {
            System.out.println("Tibúrcio está DESEMPREGADO");
        }
         */

        switch (profissao){
            case "e", "E":
                System.out.println("Tibúrcio é engenheiro");
                break;
            case "p", "P":
                System.out.println("Tibúrcio é programador");
                break;
            case "m", "M":
                System.out.println("Tibúrcio é médico");
                break;
            case "a", "A":
                System.out.println("Tibúrcio é advogado");
                break;
            case "d", "D":
                System.out.println("Tibúrcio é designer");
                break;
            default:
                System.out.println("Tibúrcio está DESEMPREGADO");
                break;

        }

        sc.close();
    }
}

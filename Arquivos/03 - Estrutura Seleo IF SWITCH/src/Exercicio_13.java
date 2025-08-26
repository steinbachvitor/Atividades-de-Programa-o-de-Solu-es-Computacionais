import java.util.Locale;
import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        /*
         A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
        estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
        salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o
        valor da prestação e informar se o empréstimo pode ou não ser concedido.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario Bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Digite o valor da prestacao: ");
        double prestacao = sc.nextDouble();

        double salarioBruto_30 = salarioBruto * 0.3;

        if(prestacao > salarioBruto_30){
            System.out.println("O emprestimo não pode ser concedido");
        } else {
            System.out.println("O emprestimo pode ser concedido");
        }
        sc.close();
    }
}

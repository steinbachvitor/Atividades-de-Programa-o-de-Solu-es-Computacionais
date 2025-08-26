import java.util.Scanner;

public class Exercicio_23 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo usando while que solicite ao usuário um número inteiro
        inicial e um número inteiro final. Calcule a soma de todos os números dentro da
        faixa de valor informada INCLUINDO o número inicial e final.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero inicial: ");
        int numInicial = sc.nextInt();

        System.out.print("Digite o numero final: ");
        int numFinal = sc.nextInt();

        int soma = 0;

        int cont = numInicial;
        while(cont <= numFinal){
            soma += cont;
            cont++;
        }

        System.out.println(soma);

        sc.close();
    }
}

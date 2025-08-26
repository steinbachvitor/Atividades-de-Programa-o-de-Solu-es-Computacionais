import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        /*
        Escreva um programa em JAVA que solicite ao usuário 2 números inteiros
        (um de cada vez), armazene os valores em variáveis e depois mostre a soma
        dos dois em uma mensagem.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int segundoNumero = sc.nextInt();
        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma do primeiro numero digitado: " +primeiroNumero + ", com o segundo numero: " + segundoNumero+ ", resulta em: " + soma);

        sc.close();
    }
}

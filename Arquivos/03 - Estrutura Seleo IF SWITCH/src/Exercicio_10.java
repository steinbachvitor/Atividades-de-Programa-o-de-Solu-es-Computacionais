import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        /*
         Faça um programa em JAVA que solicite 2 números inteiros e efetue
         a adição; caso o resultado seja maior que 10, apresentá-lo:
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int segundoNumero = sc.nextInt();
        int soma = primeiroNumero + segundoNumero;

        if(soma > 10){
            System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma);
        }
        sc.close();
    }
}

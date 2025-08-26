import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        /*
        Faça um programa em JAVA que solicite 2 números inteiros, verificar qual é
        o número maior e mostrar na tela, ou se forem iguais, mostrar uma
        mensagem indicando esta informação
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int primeroNum = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int segundoNum = sc.nextInt();

        if(primeroNum > segundoNum){
            System.out.println("O numero: " + primeroNum + " é maior!");
        } else if (primeroNum < segundoNum){
            System.out.println("O numero: " + segundoNum + " é maior!");
        } else {
            System.out.println("Os numeros digitados são iguais!");
        }
        sc.close();
    }
}

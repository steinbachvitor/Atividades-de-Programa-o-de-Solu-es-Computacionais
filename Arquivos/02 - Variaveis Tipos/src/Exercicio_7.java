import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        /*
        Escreva um programa em JAVA que solicite ao usuário um nome, armazene em
        uma variável e depois mostre o nome digitado em uma mensagem.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", é um prazer conhece-lo!");
        sc.close();
    }
}

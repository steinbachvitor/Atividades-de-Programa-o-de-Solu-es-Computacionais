import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        /*
        Faça um programa em JAVA que solicite 1 número inteiro, verificar
        se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que
        negativa:
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        int verificaMultiplicidade = num % 2;

        if (verificaMultiplicidade == 0){
            System.out.println( num + " é multiplo de 2");
        } else {
            System.out.println( num + " NÃO é multiplo de 2");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio_25 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que faça a leitura de 20 números inteiros quaisquer e
        armazene em um vetor. Após a leitura mostre a soma e a média aritmética dos
        números lidos.
         */
        Scanner sc = new Scanner(System.in);

        int total = 20;
        int[] vet = new int[total];
        int soma = 0;
        double media = 0;

        for(int i = 0; i < total; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < total; i++){
            soma += vet[i];
        }

        media = ((double) soma) / total;

        System.out.println("Soma: " + soma);
        System.out.println("Média aritmética: " + media);

        sc.close();
    }
}
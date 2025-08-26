import java.util.Scanner;

public class Exercicio_26 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que faça a leitura de 20 números inteiros quaisquer e
        armazene em um vetor. Após a leitura mostre todos os números ordenados
        crescentemente.
         */
        Scanner sc = new Scanner(System.in);
        int total = 20;
        int[] vet = new int[total];

        for(int i = 0; i < total; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        int aux = 0;
        for(int i = 0; i < total; i++){
            for(int j = 0; j < total; j++){
                if(vet[i] < vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        for(int i = 0; i < total; i++){
            if(i == 0){
                System.out.print(vet[i]);
            } else {
                System.out.print(", " + vet[i]);
            }
        }

    }
}

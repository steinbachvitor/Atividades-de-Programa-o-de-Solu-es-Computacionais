import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        /*
        Solicite ao usuário que escreva uma frase e o número de vezes que a mesma
        deve ser mostrada. Implemente o algoritmo usando for.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.print("Digite a quantidade de vezes que deseja que ela se repita: ");
        int repeticoes = sc.nextInt();

        for(int i = 0; i < repeticoes; i++ ){
            System.out.println(frase);
        }

        sc.close();
    }
}

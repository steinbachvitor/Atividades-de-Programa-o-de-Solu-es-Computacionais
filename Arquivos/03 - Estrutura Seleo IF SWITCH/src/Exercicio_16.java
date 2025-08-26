import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        /*
         Implemente uma calculadora,
         primeiro peça 2 números ao usuário (um de cada vez)
         e apresente as seguintes opções:
         adição
         subtração
         multiplicação
         divisão
         Mostre o resultado após a operação.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int primeiroNum = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int segundoNum = sc.nextInt();
        System.out.println("Digite a operação que deseja fazer: adição(1), subtração(2), multiplicação(3), divisão(4)");
        int opcao = sc.nextInt();
        /*
        if(opcao == 1){
            System.out.println("Resultado da soma: " + (primeiroNum + segundoNum));
        } else if (opcao == 2) {
            System.out.println("Resultado da subtração: " + (primeiroNum - segundoNum));
        } else if(opcao == 3){
            System.out.println("Resultado da multiplicação: " + (primeiroNum * segundoNum));
        } else if(opcao == 4){
            System.out.println("Resultado da divisão: " + (primeiroNum / segundoNum));
        } else {
            System.out.println("Digite uma opção valida");
        } */

        switch(opcao){
            case 1:
                System.out.println("Resultado da soma: " + (primeiroNum + segundoNum));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (primeiroNum - segundoNum));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (primeiroNum * segundoNum));
                break;
            case 4:
                System.out.println("Resultado da divisão: " + (primeiroNum / segundoNum));
                break;
            default:
                System.out.println("Digite uma opção valida");
                break;
        }

        sc.close();
    }
}

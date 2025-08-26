import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        /*
        Solicitar o ano de nascimento de uma pessoa e o ano atual. Verifique
        se o ano de nascimento é válido, ou seja, se o ano de nascimento é
        menor que o ano atual, então mostre a idade desta pessoa.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        int idade =  anoAtual - anoNascimento;

        if(anoAtual < anoNascimento){
            System.out.println("Insira uma data valida");
        } else {
            System.out.println("Sua idade: " + idade);
        }
        sc.close();
    }
}

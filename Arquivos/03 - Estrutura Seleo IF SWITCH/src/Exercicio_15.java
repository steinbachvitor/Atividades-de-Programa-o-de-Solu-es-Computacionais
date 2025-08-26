import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        /*
        Solicitar nome e idade de uma pessoa.
        Se a pessoa possuir idade entre 15 e 25 anos, imprimir o nome e a
        mensagem: “ACEITA”.
        Caso contrário, imprimir o nome e a mensagem: “NÃO ACEITA”.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 15 && idade <= 25){
            System.out.println(nome + " ACEITA");
        } else {
            System.out.println(nome + " NÃO ACEITA");
        }
        sc.close();
    }
}

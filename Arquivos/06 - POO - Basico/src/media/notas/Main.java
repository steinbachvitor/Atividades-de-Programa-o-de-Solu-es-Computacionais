package media.notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        while(cont == 0){
            System.out.print("Qual o nome do aluno que deseja calcular a media? ");
            String nome = sc.nextLine();
            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();
            System.out.print("Digite a primeira nota: ");
            double nota2 = sc.nextDouble();
            System.out.print("Digite a primeira nota: ");
            double nota3 = sc.nextDouble();

            Media media = new Media(nome, nota1, nota2, nota3);
            System.out.println(media);

            System.out.print("Deseja calcular a media de outro aluno?(S/N) ");
            sc.nextLine();
            String continuar = sc.nextLine();
            if(continuar.equalsIgnoreCase("N")){
                System.out.println("Encerrando programa");
                cont++;
            }
            System.out.println(" ");
        }


        sc.close();
    }
}

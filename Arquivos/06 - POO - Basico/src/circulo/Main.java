package circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        while(cont == 0){
            System.out.print("Digite o valor que deseja atribuir ao Raio: ");
            double raio = sc.nextDouble();

            Circulo c1 = new Circulo(raio);

            System.out.print("Deseja calcular a area desse Cirulo: (S/N) ");
            sc.nextLine();
            String calculaSN = sc.nextLine();

            if(calculaSN.equalsIgnoreCase("s")){
                System.out.println("A area do Circulo com raio de " + c1.getRaio() + ", é: " + c1.getArea());
            } else {
                System.out.println("Tenha um bom dia!");
            }

            System.out.print("Deseja atribuir um novo valor ao raio? (S/N) ");
            String continuar = sc.nextLine();

            if(continuar.equalsIgnoreCase("N")){
                System.out.println("Encerrando programa!");
                cont++;
            }
            System.out.println("");
        }

        sc.close();
    }
}

package exercicio39;

import java.util.Scanner;

public class Exercicio_39 {
    public static void main(String[] args) {
        /*
         Use o código abaixo e faça o tratamento de erro adequado para divisões por zero (try,
         catch, finally):
         public class Principal {
         public static void main(String[] args) {
         int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
         int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
         int n = 0;
         n = n1 / n2; // se for uma divisão por zero vai dar erro
        }
         }
         */
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            System.out.print("Digite um número: ");
            int n1 = sc.nextInt();
            System.out.print("Digite outro número: ");
            int n2 = sc.nextInt();
            int n = 0;
            n = n1 / n2;
            System.out.print("Resultado da divisão: " + n);
        } catch (Exception e) {
            i++;
            System.out.println(e);
        } finally {
            if(i == 0){
                System.out.println("!!");
            } else {
                System.out.println("Digite apenas numeros validos!");
            }
        }
        sc.close();
    }
}

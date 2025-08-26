import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        /*
        Uma loja dará um desconto em seus produtos de acordo com a
        categoria de cada produto.
        As categorias e os descontos são mostrados abaixo:
         A 10%
         B 15%
         C 20%
         D 25%
         E 50%
        Faça um algoritmo para ler o nome do cliente, o preço e a categoria do produto que o
        cliente está comprando. Após a leitura mostrar na tela o preço final que o cliente
        deverá pagar após ter sido dado o desconto no preço da mercadoria.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nomeCli = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        int preco = sc.nextInt();
        System.out.print("Digite a categoria do produto(A, B, C, D, E): ");
        sc.nextLine();
        String categoria = sc.nextLine();

        /*
        if(categoria.equalsIgnoreCase("A")){
            System.out.println("Preço final: " + (preco * 0.90));
        } else if(categoria.equalsIgnoreCase("B")){
            System.out.println("Preço final: " + (preco * 0.85));
        } else if(categoria.equalsIgnoreCase("C")){
            System.out.println("Preço final: " + (preco * 0.80));
        } else if(categoria.equalsIgnoreCase("D")){
            System.out.println("Preço final: " + (preco * 0.75));
        } else if(categoria.equalsIgnoreCase("E")){
            System.out.println("Preço final: " + (preco * 0.50));
        } else {
            System.out.println("Digite uma categoria valida!");
        } */

        switch (categoria){
            case "a", "A":
                System.out.println("Preço final: " + (preco * 0.90));
                break;
            case "b", "B":
                System.out.println("Preço final: " + (preco * 0.85));
                break;
            case "c", "C":
                System.out.println("Preço final: " + (preco * 0.80));
                break;
            case "d", "D":
                System.out.println("Preço final: " + (preco * 0.75));
                break;
            case "e", "E":
                System.out.println("Preço final: " + (preco * 0.50));
                break;
            default:
                System.out.println("Digite uma categoria valida!");
                break;

        }

        sc.close();
    }
}

public class Exercicio_22 {
    public static void main(String[] args) {
         /*
        Escreva um algoritmo para calcular e mostrar a média aritmética dos números
        inteiros entre 1 e 1000 usando while.
         */

        int cont = 0;
        int total = 1000;
        while (cont < total){
            double media = ((double) cont) /2;
            System.out.println(cont+ " media aritmética:" + media);
            cont++;
        }
    }
}

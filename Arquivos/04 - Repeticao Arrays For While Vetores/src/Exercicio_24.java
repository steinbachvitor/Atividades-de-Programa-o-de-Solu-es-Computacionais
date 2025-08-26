public class Exercicio_24 {
    public static void main(String[] args) {
        /*
         Escreva um algoritmo que mostre todos os números pares entre 13 e 23
         usando do..while.
         */

        int numInicial = 13;
        int numFinal = 23;
        int cont = numInicial;

        do {
            if(cont % 2 == 0){
                System.out.println(cont);
            }
            cont++;
        } while(cont < numFinal);

    }
}

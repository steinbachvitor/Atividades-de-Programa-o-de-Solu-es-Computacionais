public class Exercicio_21 {
    public static void main(String[] args) {
       /*
        Escreva um algoritmo que mostre todos os números pares entre 33 e 57 usando
        for.
        */
        for(int i = 33; i < 57;i++){
            int par = i % 2;
            if(par == 0){
                System.out.println(i);
            }
        }
    }
}

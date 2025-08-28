package exercicio40;

public class Exercicio_40 {
    public static void main(String[] args) {
        /*
        Use o código abaixo e faça o tratamento de erro adequado para
        acesso a índice inexistente (try, catch, finally):
        EXERCÍCIO 40
         public class Principal {
            public static void main(String[] args) {
                 int numeros[] = new int[10];
                 numeros[0] = 0;
                 numeros[1] = 1;
                 numeros[2] = 2;
                 numeros[3] = 3;
                 numeros[4] = 4;
                 numeros[5] = 5;
                 numeros[6] = 6;
                 numeros[7] = 7;
                 numeros[8] = 8;
                 numeros[9] = 9;
                 System.out.println("tentando mostrar índice 10:" + numeros[10]); //vai dar erro, não existe índice 10.
            }
         }
         */

        int numeros[] = new int[10];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;
        int i = 0;
        try{
            System.out.println("Mostrando o indice 2: " + numeros[2]);
            System.out.println("tentando mostrar índice 10:" + numeros[10]);
        } catch(Exception e){
            i++;
            System.out.println(e);
        } finally {
            if(i == 0){
                System.out.println(";)");
            } else {
                System.out.println("Digite um indice valido! (0 - 9)");
            }
        }

    }
}

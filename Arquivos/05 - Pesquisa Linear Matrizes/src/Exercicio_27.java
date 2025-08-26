import java.util.Scanner;

public class Exercicio_27 {
    public static void main(String[] args) {
        /*
        Implemente e execute o código de pesquisa linear dado em aula, incluindo códigos
        para INTERROMPER a varredura completa do vetor, quando o elemento procurado
        é encontrado.
         */
        Scanner sc = new Scanner(System.in);
        int linhas = 3;
        int colunas = 2;
        int matriz[][] = new int[linhas][colunas];
        int valorProcurado = 0;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print("Digite um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }

        int verifica = 0;
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(matriz[i][j] == valorProcurado){
                    System.out.println("Valor encontrado na posição: matriz[" + i+"][" + j+"]");
                    verifica++;
                    break;
                }
            }
            if(verifica != 0){
                break;
            }
        }
        if(verifica == 0){
            System.out.println("Valor não encontrado!");
        }
        sc.close();
    }
}

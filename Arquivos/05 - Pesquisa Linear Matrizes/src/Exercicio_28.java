import java.util.Scanner;

public class Exercicio_28 {
    public static void main(String[] args) {
        /*
         Faça um algoritmo que leia uma matriz de ordem 3x3 de
         números inteiros. Após a leitura faça:
            A Calcule e mostre a soma dos elementos da primeira coluna;
            B Calcule e mostre a soma dos elementos de cada coluna;
            C Calcule e mostre o produto dos elementos da primeira linha;
            D Calcule e mostre a soma de todos os elementos da matriz;
            E Calcule e mostre a média dos elementos da matriz;
            F Calcule e mostre os elementos que são maiores que a média;
            G Calcule e mostre o maior elemento da matriz e sua posição;
            H Calcule e mostre o menor elemento da matriz e sua posição;
            I Calcule e mostre a soma dos elementos da diagonal principal da matriz;
            J Calcule e mostre a soma dos elementos da diagonal secundária da matriz;

            0 | 0 | 0
            0 | 0 | 0
            0 | 0 | 0
         */
        Scanner sc = new Scanner(System.in);
        int linhas = 3;
        int colunas = 3;
        int matriz[][] = new int[linhas][colunas];

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
        
        // A
        int somaPrimeiraCol = (matriz[0][0]) + (matriz[1][0]) + (matriz[2][0]);
        System.out.println("A) Soma dos elementos da primeira coluna: " + somaPrimeiraCol);

        // B
        int somaSegundaCol = (matriz[0][1]) + (matriz[1][1]) + (matriz[2][1]);
        int somaTerceiraCol = (matriz[0][2]) + (matriz[1][2]) + (matriz[2][2]);
        System.out.println("B) Soma dos elementos da primeira coluna: " + somaPrimeiraCol + ", segunda coluna: "
                + somaSegundaCol + ", terceira coluna: " + somaTerceiraCol);

        // C
        int produtoPrimeiraCol = (matriz[0][0]) * (matriz[0][1]) * (matriz[0][2]);
        System.out.println("C) Produto dos elementos da primeira linha: " + produtoPrimeiraCol);

        // D
        int somaColunas = somaPrimeiraCol + somaSegundaCol + somaTerceiraCol;
        System.out.println("D) Soma de todos os elementos da matriz: " + somaColunas);

        // E
        int media = somaColunas / (linhas * colunas);
        System.out.println("E) Media dos elementos da matriz: " + media);

        // F
        System.out.println("F) Elementos acima da media: ");
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(matriz[i][j] > media){
                    System.out.print("|" + matriz[i][j]+"|");
                }
            }
        }

        // G
        int maiorElemento = 0;
        int posicaoLinMai = 0;
        int posicaoColMai = 0;

        // H
        int menorElemento = 0;
        int posicaoLinMen = 0;
        int posicaoColMen = 0;

        // I
        //int somaEleDiaPrin =  (matriz[0][0]) + (matriz[1][1]) + (matriz[2][2]);
        int somaEleDiaPrin = 0;

        // J
        //int somaEleDiaSec = (matriz[0][2]) + (matriz[1][1]) + (matriz[2][0]);
        int somaEleDiaSec = 0;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(matriz[i][j] > maiorElemento){
                    maiorElemento = matriz[i][j];
                    posicaoLinMai = i;
                    posicaoColMai = j;
                }
                if(matriz[i][j] <= menorElemento){
                    menorElemento = matriz[i][j];
                    posicaoLinMen = i;
                    posicaoColMen = j;
                }
                if(i == j){
                    somaEleDiaPrin+= matriz[i][j];
                }
            }
            int cont = linhas - 1;
            while(cont > 0){
                cont--;
                somaEleDiaSec += matriz[i][cont];

                break;
            }
        }

        System.out.println("");
        // G
        System.out.println("G) Maior elemento: " + maiorElemento + ", matriz[" +posicaoLinMai + "][" + posicaoColMai + "]");
        // H
        System.out.println("H) Menor elemento: " + menorElemento + ", matriz[" +posicaoLinMen + "][" + posicaoColMen + "]");
        // I
        System.out.println("I) Soma da diagonal principal: " + somaEleDiaPrin);
        // J
        System.out.println("J) Soma da diagonal secundaria: " + somaEleDiaSec);

        sc.close();
    }
}

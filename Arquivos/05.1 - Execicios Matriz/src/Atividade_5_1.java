import java.util.Scanner;

public class Atividade_5_1 {
    public static void main(String[] args) {
        /*
        Faça um programa JAVA que leia 3 pares de valores, sendo o primeiro valor o
        número do atleta e o segundo a altura (em cm) do atleta. Escreva:
         a. o número e a altura do atleta mais alto.
         b. a altura média do grupo de atletas.
         c. o número de atletas com altura menor que 178 cm.
        */
        Scanner sc = new Scanner(System.in);
        int qtdAtletas = 3;
        int caracteristicas = 2;
        int atleta[][] = new int[qtdAtletas][caracteristicas];

        for(int i = 0; i < qtdAtletas; i++){
            System.out.print("Digite o numero do atleta: ");
            atleta[i][0] = sc.nextInt();
            System.out.print("Digite a altura do atleta: ");
            atleta[i][1] = sc.nextInt();

        }
        System.out.println("|numero||altura|");
        for(int i = 0; i < qtdAtletas; i++){
            for(int j = 0; j < caracteristicas; j++){
                System.out.print("|" + atleta[i][j] + "|");
            }
            System.out.println("");
        }

        //A
        int maiorAltura = 0;
        int numMaiorAltura = 0;

        for(int i = 0; i < qtdAtletas; i++){
            if(maiorAltura < atleta[i][1]){
                numMaiorAltura = atleta[i][0];
                maiorAltura = atleta[i][1];
            }
        }
        System.out.println("Numero do maior atleta: " + numMaiorAltura + ", Altura: " + maiorAltura + "cm");

        //B
        int somaAlturas = 0;
        for(int i = 0; i < qtdAtletas; i++){
            somaAlturas += atleta[i][1];
        }
        double mediaAltura = ((double) somaAlturas) / qtdAtletas;
        String mediaFormatada = String.format("%.2f",mediaAltura);
        System.out.println("A media das alturas dos atletas é: " + mediaFormatada);

        //C

        int alturaDesejada = 178;
        int totalAtletasBaixos = 0;
        for(int i = 0; i < qtdAtletas; i++){
            if(atleta[i][1] < alturaDesejada){
                totalAtletasBaixos++;
            }
        }
        System.out.println("Total de Atletas menores que 178cm: " + totalAtletasBaixos);

        sc.close();
    }
}

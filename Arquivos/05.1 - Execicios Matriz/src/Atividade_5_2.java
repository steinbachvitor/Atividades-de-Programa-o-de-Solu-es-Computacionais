import java.util.Scanner;

public class Atividade_5_2 {
    public static void main(String[] args) {
        /*
        O preço final ao consumidor de um computador é o resultante da soma do
        custo da fábrica acrescido do percentual referente aos impostos, mais a
        comissão do vendedor, mais o percentual de lucro da revenda. Ainda é
        possível, no momento da venda oferecer um desconto ao cliente, entretanto o
        percentual do desconto não incide sobre os impostos. Elabore um sistema que
        mantenha uma tabela com a descrição e os preços de 5 computadores e receba
        as demais informações, calculando o preço final a ser pago pelo cliente.

        custo de fabrica | % impostos | comissao vendedor | % lucro | total
         */

        Scanner sc = new Scanner(System.in);

        int totalComputadores = 2;
        int totalCustos = 5;

        double custoTotalComputadores[][] = new double[totalComputadores][totalCustos];

        for(int i = 0; i < totalComputadores; i++){
            System.out.print("Digite o custo de fabrica: ");
            custoTotalComputadores[i][0] = sc.nextInt();

            System.out.print("Digite o percentual de impostos: ");
            custoTotalComputadores[i][1] = sc.nextInt();

            System.out.print("Digite a comissão do vendedor: ");
            custoTotalComputadores[i][2] = sc.nextInt();

            System.out.print("Digite o percentual de lucro: ");
            custoTotalComputadores[i][3] = sc.nextInt();


            double custoFabrica = custoTotalComputadores[i][0];
            double total = custoFabrica;
            double percentualImp = (custoTotalComputadores[i][1]) / 100;
            total += custoFabrica * percentualImp;
            double porComissao = (custoTotalComputadores[i][2]) / 100;
            total += total * porComissao;
            double porLucro = (custoTotalComputadores[i][3]) / 100;
            total += total * porLucro;
            //total = custoFabrica + (custoFabrica * percentualImp) + (custoFabrica * porComissao) + (custoFabrica * porLucro);

            custoTotalComputadores[i][4] = total;
        }

        for(int i = 0; i < totalComputadores; i++){
            for (int j = 0; j < totalCustos; j++){
                System.out.print("|" + custoTotalComputadores[i][j] + "|");
            }
            System.out.println("");
        }

        for(int i = 0; i < totalComputadores; i++){
            System.out.println("Preço final ao consumidor: " + custoTotalComputadores[i][4]);
        }

        sc.close();
    }
}

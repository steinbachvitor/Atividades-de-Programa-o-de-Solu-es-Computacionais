package exercicio_32_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
     A. Escreva a classe Veiculo contendo Peso em quilos(int), VelocMax em Km/h(int) e Preco em R$ (float).
     • Crie um construtor que inicialize os dados com zero e “”.
     • Crie um construtor que inicialize os dados com valores passados por parâmetro.
     • Crie métodos set’s para alterar os dados.
     • Crie métodos get’s para retornar os dados.
     • Crie um método para solicitar os dados para o usuário.
     • Crie um métodopara imprimir os dados para o usuário.
     • Construa um programa para testar a classe Veiculo.

     B. Crie a classe CarroPasseio usando a classe Veiculo como base. Inclua Cor(Literal) e Modelo(Literal).
     • Crie um construtor que inicialize os dados com zero e “”..
     • Crie um construtor que inicialize os dados com valores passados por parâmetro.
     • Crie métodos set’s para alterar os dados.
     • Crie métodos get’s para retornar os dados.
     • Crie um métodopara solicitar os dados para o usuário.
     • Crie um métodopara imprimir os dados para o usuário.
     • Construa um programa para testar a classe CarroPasseio.

     C. Crie a classe Caminhao derivada da classe Veiculo. Inclua Toneladas( carga máxima), AlturaMax(int) e Comprimento(int).
     • Crie um construtor que inicialize os dados com zero e “”.
     • Crie um construtor que inicialize os dados com valores passados por parâmetro.
     • Crie métodos set’s para alterar os dados.
     • Crie métodos get’s para retornar os dados.
     • Crie um métodopara solicitar os dados para o usuário.
     • Crie um métodopara imprimir os dados para o usuário.
     • Construa um programa para testar a classe Caminhao
    */
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc.useLocale(new Locale("us", "US"));
        Veiculo veiculo = new Veiculo();
        veiculo.solicitarDados(sc);
        System.out.println(veiculo);

        CarroPasseio celta = new CarroPasseio();
        celta.solicitarDados(sc);
        System.out.println(celta);

        Caminhao caminhao = new Caminhao();
        caminhao.solicitarDados(sc);
        System.out.println(caminhao);

        sc.close();
    }
}

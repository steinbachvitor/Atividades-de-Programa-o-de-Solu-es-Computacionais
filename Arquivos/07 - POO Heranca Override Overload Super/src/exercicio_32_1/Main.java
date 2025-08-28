package exercicio_32_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
     A. Crie uma classe Empresa capaz de armazenar os dados de uma empresa (Nome,
    Endereço, Cidade, Estado, CEP e Fone). Para esta classe implemente os seguintes métodos.
     • Crie um construtor que inicialize os dados com zero e “”
     • Crie um construtor que inicialize os dados com valores passados por parâmetro.
     • Crie métodos set’s para alterar os dados.
     • Crie métodos get’s para retornar os dados.
     • Crie um método para solicitar os dados para o usuário.
     • Crie um método para imprimir os dados para o usuário.
     • Construa um programa para testar a classe Empresa.

     B. Use a classe Empresa como base para criar a classe Restaurante. Inclua o tipo de comida,
     o preço médio de um prato.
     • Crie um construtor que inicialize os dados com zero e “”.
     • Crie um construtor que inicialize os dados com valores passados por parâmetro.
     • Crie métodos set’s para alterar os dados.
     • Crie métodos get’s para retornar os dados.
     • Crie um método para solicitar os dados para o usuário.
     • Crie um método para imprimir os dados para o usuário.
     • Construa um programa para testar a classe Restaurante.
     */

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc.useLocale(new Locale("us", "US"));
        Empresa unisul = new Empresa();
        unisul.solicitarDados(sc);
        System.out.println(unisul);

        Restaurante bocas = new Restaurante();
        bocas.solicitarDados(sc);
        System.out.println(bocas);

       sc.close();
    }
}

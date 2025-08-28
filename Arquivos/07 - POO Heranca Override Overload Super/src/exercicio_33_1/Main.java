package exercicio_33_1;

import java.util.ArrayList;

public class Main {
    /*
     A empresa de Contabilidade XYZ precisa fazer um levantamento do faturamento de seus
    clientes. A empresa XYZ trabalha tanto com pessoas jurídicas como físicas. Para os clientes
    que são pessoas jurídicas tem-se, o nome, endereço, telefone, C.N.P.J., I.E. e faturamento
    como atributos. Paras as pessoas físicas tem-se, nome, endereço, telefone, CPF, RG e
    Salário. Também deseja-se saber quem é o cliente de ambos os tipos que possuem o maior
    rendimento.
     */
    public static void main(String[] args) {
        PessoaFisica joao = new PessoaFisica("João", "Palhoça", "(48) 3232-4343", "100.000.000-10", "1234567", 5200);
        PessoaFisica julia = new PessoaFisica("Julia", "Palhoça", "(48) 3232-4343", "100.000.000-10", "1234567", 2200);
        ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();
        pessoasFisicas.add(joao);
        pessoasFisicas.add(julia);
        System.out.println(PessoaFisica.comparador(pessoasFisicas));

        PessoaJuridica alberta = new PessoaJuridica("Alberta","Palhoça", "(48) 3232-4343", "000000000", "ie", 40000 );
        PessoaJuridica roberto = new PessoaJuridica("roberto","Palhoça", "(48) 3232-4343", "000000000", "ie", 4500 );
        ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
        pessoasJuridicas.add(alberta);
        pessoasJuridicas.add(roberto);
        System.out.println(PessoaJuridica.comparador(pessoasJuridicas));

    }
}

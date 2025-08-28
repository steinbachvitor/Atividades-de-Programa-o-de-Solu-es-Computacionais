package exercicio42;


import exercicio42.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Elaborar um programa que tenha uma inteface chamada IConta os métodos
        getNome que retorna uma string, getSaldo que retorna um double é o
        método setDeposito que não retorna nada e recebe um double como
        parâmetro. Depois crie duas classes ContaCorrente e ContaPoupanca que
        implementar a interface IConta. A classe ContaCorrente possui nome do tipo
        String, saldo e taxaServico do tipo double. A classe ContaPoupanca possui o
        atributo nome do tipo String, saldo e juros do tipo double. O método getSaldo na
        classe da ContaPoupanca é acrescido de juros (rendimentos) e na ContaCorrente é
        decrementado da taxa de serviço. O método setDeposito incrementa o saldo da
        contas com o valor passado por parâmetro. Todas as classes devem ter o construtor
        sem e com parâmetros, além dos get's e set's. O primeiro parâmetro do construtor
        da classe ContaCorrente é o nome da conta que deve ser passado para a
        superclasse, o segundo o saldo e o terceiro a taxa de serviço. O primeiro parâmetro
        do construtor da classe ContaPoupanca é o nome do conta que deve ser passado
        para a superclasse, o segundo o saldo e o teceiro o juros. Os construtores sem
        parâmetros inicializam com 0(zero) os atributos numéricos e aspas vazias("") os
        atributos String.
        Faça o programa principal para que seja possível:
         1 - Criar contas (O usuário deve escolher entre Poupança ou Corrente).
         2 - Consulta o saldo da conta
         3 - Depositar na conta.
         */

        Scanner sc = new Scanner(System.in);

        ArrayList<IConta> contas= new ArrayList<>();

        // Menu inicial
        int fim = 0;
        while(fim == 0){
            int cont = 0;
            while (cont == 0){
                System.out.println("Selecione uma opção: ");
                System.out.println("1 - Criar Conta");
                System.out.println("2 - Consultar o saldo da conta");
                System.out.println("3 - Depositar na conta");
                System.out.println("4 - Sair");
                int tipo = sc.nextInt();
                if(tipo == 1){
                    cont = 1;
                }else if(tipo == 2){
                    cont = 2;
                }else if(tipo == 3){
                    cont = 3;
                }else if(tipo == 4){
                    System.out.println("Encerrando programa");
                    fim++;
                    break;
                } else {
                    System.out.println("Digite uma opção valida!");
                }
            }

            // Menu de criação
            while(cont == 1){
                System.out.println("Deseja criar qual tipo de conta?");
                System.out.println("1 - Conta Poupança");
                System.out.println("2 - Conta Corrente");
                System.out.println("3 - Sair");
                int tipo = sc.nextInt();

                if(tipo == 1){
                    System.out.println("informe os dados para criação da conta:");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextInt();
                    System.out.print("Digite seu id: ");
                    int id = sc.nextInt();
                    ContaPoupanca cp1 = new ContaPoupanca(nome, saldo, 1, id);
                    contas.add(cp1);
                    System.out.println("Conta Criada com sucesso!");
                    cont = 0;

                } else if( tipo == 2){
                    System.out.println("informe os dados para criação da conta:");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextInt();
                    System.out.println("Digite seu id: ");
                    int id = sc.nextInt();
                    ContaCorrente cc1 = new ContaCorrente(nome, saldo, 5, id);
                    contas.add(cc1);
                    System.out.println("Conta Criada com sucesso!");
                    cont = 0;

                } else if (tipo == 3){
                    System.out.println("Encerrando programa");
                    fim++;
                    break;
                }else {
                    System.out.println("Digite uma opção valida!");
                    cont = 0;
                }
            }

            // Menu consultar saldo
            while (cont == 2){
                System.out.print("Informe seu ID: ");
                int id = sc.nextInt();
                boolean encontrada = false;

                for(int i = 0; i < contas.size(); i++){
                    if(contas.get(i).getId() == id){
                        System.out.println("Olá " +  contas.get(i).getNome());
                        System.out.println("Informações da conta: ");
                        System.out.println("ID: " + contas.get(i).getId());
                        System.out.println("Saldo: " +  contas.get(i).getSaldo());
                        encontrada = true;
                        break;
                    }
                }

                if(!encontrada){
                    System.out.println("Não foi possivel encontrar sua conta!");
                }

                System.out.println("Deseja:");
                System.out.println("1 - Tentar novamente");
                System.out.println("2 - Voltar");
                System.out.println("3 - Encerrar");
                int tipo = sc.nextInt();

                if(tipo == 1){
                    cont = 2;
                }else if(tipo == 2){
                    cont = 0;
                }else if(tipo == 3){
                    System.out.println("Encerrando programa");
                    fim++;
                    break;
                } else {
                    System.out.println("Digite uma opção valida!");
                }
            }

            // Menu Deposito
            while (cont == 3){
                System.out.print("Informe seu ID: ");
                int id = sc.nextInt();
                boolean encontrada = false;

                for(int i = 0; i < contas.size(); i++){
                    if(contas.get(i).getId() == id){
                        System.out.println("Olá " +  contas.get(i).getNome());
                        System.out.println("Informações da conta: ");
                        System.out.println("ID: " + contas.get(i).getId());
                        System.out.println("Saldo: " +  contas.get(i).getSaldo());
                        System.out.print("Quanto gostaria de depositar?");
                        double dep = sc.nextDouble();
                        contas.get(i).setDeposito(dep);
                        System.out.println("Saldo atualizado: " + contas.get(i).getSaldo());
                        encontrada = true;
                        break;
                    }
                }
                if(!encontrada){
                    System.out.println("Não foi possivel encontrar sua conta!");
                }

                System.out.println("Deseja:");
                System.out.println("1 - Tentar novamente");
                System.out.println("2 - Realizar um novo deposito");
                System.out.println("3 - Voltar");
                System.out.println("4 - Encerrar");
                int tipo = sc.nextInt();

                if(tipo == 1 || tipo == 2){
                    cont = 3;
                }else if(tipo == 3){
                    cont = 0;
                }else if(tipo == 4){
                    System.out.println("Encerrando programa");
                    fim++;
                    break;
                } else {
                    System.out.println("Digite uma opção valida!");
                }
            }
        }
        sc.close();
    }
}

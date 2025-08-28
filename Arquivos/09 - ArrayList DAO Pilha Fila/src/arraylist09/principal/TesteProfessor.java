package arraylist09.principal;

import arraylist09.model.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TesteProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*
        EXERCÍCIO 38
        Criar um exemplo em JAVA usando ArrayList para uma lista de professores, use as
        classes das aulas
         */

        int cont = 0;
        while(cont == 0){
            System.out.print("Digite o Id do professor: ");
            int id = sc.nextInt();

            System.out.print("Digite  o nome do professor: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Digite  a idade do professor: ");
            int idade = sc.nextInt();

            System.out.print("Digite  o salario do professor: ");
            int salario = sc.nextInt();

            System.out.print("Digite o titulo do professor: ");
            sc.nextLine();
            String titulo = sc.nextLine();

            //Insere um objeto completo de Professor em listProfessor
            Professor.insertProfessorBD(new Professor(id, nome, idade, salario, titulo));

            System.out.print("Deseja adicionar um nuvo Professor? (S/N)");
            //sc.nextLine();
            String continuar = sc.nextLine();

            if(continuar.equalsIgnoreCase("N")){
                cont++;
            }
        }

        Professor.insertProfessorBD(new Professor(1111, "João", 49, 12000, "Doutor"));
        System.out.println("\n ##########----------TESTE 1--------####### \n ");
        System.out.println("Tamanho da lista: " + Professor.getListaProfessor().size());
        System.out.println(Professor.getListaProfessor().toString());

        Professor.insertProfessorBD(new Professor(2222, "Maria", 24, 5000, "Graduada"));
        System.out.println("\n ##########----------TESTE 2--------####### \n ");
        System.out.println("Tamanho da lista: " + Professor.getListaProfessor().size());
        System.out.println(Professor.getListaProfessor().toString());

        // APAGA um objeto de Aluno em MinhaLista Utilizando o campo ID como referência.
        Professor.deleteProfessorBD(1111);
        System.out.println("\n ##########----------TESTE 3--------####### \n ");
        System.out.println("Tamanho da lista: " + Professor.getListaProfessor().size());
        System.out.println(Professor.getListaProfessor().toString());

        // EDITA um objeto de Aluno dentro de MinhaLista Utilizando o campo ID como referência e mandando outro objeto como modelo.
        Professor objProf = new Professor(2222, "Maria da Silva", 30, 7000, "Mestre");
        Professor.updateProfessorBD(2222, objProf);
        System.out.println("\n ##########----------TESTE 4--------####### \n ");
        System.out.println("Tamanho da lista: " + Professor.getListaProfessor().size());
        System.out.println(Professor.getListaProfessor().toString());

    }
}

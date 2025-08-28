package arraylist09.principal;

import arraylist09.model.*;
import arraylist09.dao.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> listasimples = new ArrayList<>();

        // Criando objetos para inserir
        Aluno aluno1 = new Aluno(1111, "João", 95, "Sistemas", 7);
        Aluno aluno2 = new Aluno(2222, "Maria", 21, "Computação", 2);
        listasimples.add(aluno1);
        listasimples.add(aluno2);
        System.out.println("\n ##########----------TESTE 1--------####### \n ");
        System.out.println(listasimples.toString());

        //apagando aluno1 da lista.
        listasimples.remove(0);
        System.out.println("\n ##########----------TESTE 2--------####### \n ");
        System.out.println(listasimples.toString());

        //alterando aluno2 da lista.
        Aluno aluno2alterado = new Aluno(2222, "Maria da Silva", 25, "Computação Plus", 3);
        listasimples.set(0, aluno2alterado);
        System.out.println("\n ##########----------TESTE 3--------####### \n ");
        System.out.println(listasimples.toString());

        // varredura da nossa listasimples listando só os nomes.
        Aluno aluno3 = new Aluno(3333, "Rita", 46, "Sistema", 4);
        Aluno aluno4 = new Aluno(4444, "Cláudio", 64, "Computação", 8);
        listasimples.add(aluno3);
        listasimples.add(aluno4);
        System.out.println("\n ##########----------TESTE 4--------####### \n ");
        int tamanholista = listasimples.size();
        for (int i = 0; i < tamanholista; i++) {
            System.out.println("Nome: " + listasimples.get(i).getNome());
        }

        // Usando Collections para ordenar
        Collections.sort(listasimples, new Comparator() {
            public int compare(Object o1, Object o2) {
                Aluno a1 = (Aluno) o1;
                Aluno a2 = (Aluno) o2;
                return a1.getNome().compareToIgnoreCase(a2.getNome());
                // retorna -1 se for menor e +1 se for maior.
            }
        });

        System.out.println("\n ##########----------TESTE 5--------####### \n ");
        int tamanholista2 = listasimples.size();
        for (int i = 0; i < tamanholista2; i++) {
            System.out.println("Nome: " + listasimples.get(i).getNome());
        }

        // Cria objeto vazio de aluno apenas para manipular o métodos relacionados a MinhaLista
        Aluno objetoaluno = new Aluno();

        //Insere um objeto completo de Aluno em MinhaLista
        objetoaluno.insertAlunoBD(new Aluno(1111, "João", 95, "Sistemas", 7));
        System.out.println("\n ##########----------TESTE 1--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());

        // Insere um SEGUNDO objeto completo de Aluno em MinhaLista
        objetoaluno.insertAlunoBD(new Aluno(2222, "Maria", 21, "Computação", 2));
        System.out.println("\n ##########----------TESTE 2--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());

        // APAGA um objeto de Aluno em MinhaLista Utilizando o campo ID como referência.
        objetoaluno.deleteAlunoBD(1111);
        System.out.println("\n ##########----------TESTE 3--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());

        // EDITA um objeto de Aluno dentro de MinhaLista Utilizando o campo ID como referência e mandando outro objeto como modelo.
        Aluno objetoaluno2 = new Aluno(2222, "Maria da Silva", 25, "Computação Plus", 3);
        objetoaluno.updateAlunoBD(2222, objetoaluno2);
        System.out.println("\n ##########----------TESTE 4--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
    }
}
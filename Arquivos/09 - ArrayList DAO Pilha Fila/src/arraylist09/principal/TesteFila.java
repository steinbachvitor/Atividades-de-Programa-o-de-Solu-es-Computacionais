package arraylist09.principal;

import arraylist09.model.*;
import java.util.*;

public class TesteFila {
    public static void main(String[] args) {
        /* EXERCÍCIO 37
        Modifique o exemplo de FILA, agora peça os dados para o usuário.
        Experimente os outros métodos disponíveis.
         */
        Scanner sc = new Scanner(System.in);

        Queue<Aluno> fila = new LinkedList();

        int cont = 0;
        while(cont == 0){
            System.out.print("Digite o Id do aluno: ");
            int id = sc.nextInt();

            System.out.print("Digite o nome do aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Digite a idade do aluno: ");
            int idade = sc.nextInt();

            System.out.print("Digite o curso do aluno: ");
            sc.nextLine();
            String curso = sc.nextLine();

            System.out.print("Digite a fase que o aluno está: ");
            int fase = sc.nextInt();

            fila.offer(new Aluno(id, nome, idade, curso, fase));

            System.out.print("Deseja adicionar um nuvo aluno? (S/N)");
            sc.nextLine();
            String continuar = sc.nextLine();

            if(continuar.equalsIgnoreCase("N")){
                cont++;
            }
        }

        fila.offer(new Aluno(1111, "Tiburcio", 95, "Sistemas", 7));
        fila.offer(new Aluno(2222, "Marilene", 21, "Massagem", 2));
        fila.offer(new Aluno(3333,"Rita Lobo",  46, "Culinaria", 4));
        fila.offer(new Aluno(4444,"Claude Troisgros", 64, "Culinaria",8 ));
        System.out.println("Inicio da Fila:" + fila.peek().getId() + " - " + fila.peek().getNome());
        // Interator utilizado para correr a fila, veja mais na documentação JAVA
        for (Iterator it = fila.iterator(); it.hasNext();) {
            Aluno c = (Aluno) it.next();
            System.out.println(c.getId() + " - " + c.getNome());
        }
        System.out.println("Removendo:" + fila.peek().getNome());
        fila.poll();
        System.out.println("Topo:" + fila.peek().getNome());
    }
}

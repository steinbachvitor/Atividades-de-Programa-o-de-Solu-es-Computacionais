package arraylist09.principal;

import arraylist09.model.*;
import java.util.*;

public class TestesPilha {
    public static void main(String[] args) {
        Stack<Aluno> pilha = new Stack<Aluno>();
        Scanner sc = new Scanner(System.in);

        /* EXERCÍCIO 36
         Modifique o exemplo de PILHA, agora peça os dados para o usuario.
         Experimente os outros métodos disponíveis.
         */

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

            pilha.push(new Aluno(id, nome, idade, curso, fase));

            System.out.print("Deseja adicionar um nuvo aluno? (S/N)");
            sc.nextLine();
            String continuar = sc.nextLine();
            if(continuar.equalsIgnoreCase("N")){
                cont++;
            }
        }


        pilha.push(new Aluno(1111, "João", 95, "Sistemas", 7));
        pilha.push(new Aluno(2222, "Maria", 21, "Computação", 2));
        pilha.push(new Aluno(3333, "Rita", 46, "Computação", 4));
        pilha.push(new Aluno(4444, "Claúdio", 64, "Sistema", 8));
        System.out.println("Topo:" + pilha.peek().getId() + " - " + pilha.peek().getNome());
        // Interator utilizado para correr a pilha, veja mais na documentação JAVA
        for (Iterator it = pilha.iterator(); it.hasNext(); ) {
            Aluno c = (Aluno) it.next();
            System.out.println(c.getId() + " - " + c.getNome());
        }
        System.out.println("Removendo:" + pilha.peek().getNome());
        pilha.pop();
        System.out.println("Topo:" + pilha.peek().getNome());
    }
}

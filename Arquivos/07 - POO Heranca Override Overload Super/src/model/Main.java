package model;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Aluno marcos = new Aluno(12222, "Marcos,", 20, "Ciência da Computação", 4);
        marcos.mostrarDados();
        System.out.println("Está se formando? " + marcos.verificarFormando());
        System.out.println("Está se formando? (testando sobrecarga)" + marcos.verificarFormando(4));
        System.out.println();

        Professor julio = new Professor(11111, "Julio", 43,15775,"Doutor");
        julio.mostrarDados();
        System.out.println("Quantidade de impostos pagos: " + julio.calcularImposto());
        System.out.println("Quantidade de impostos pagos caso seja um imposto de 20%: " + julio.calcularImposto(20));
        System.out.println();

        Funcionario joao = new Funcionario(33333, "João", 32, 2200, 9, "Assistente administrativo");
        joao.mostrarDados();
        System.out.println(joao.getNome() + " recebeu um aumento de 10% " + joao.receberAumento());
        System.out.println(joao.getNome() + " recebeu um aumento de 20% " + joao.receberAumento(20));
    }
}
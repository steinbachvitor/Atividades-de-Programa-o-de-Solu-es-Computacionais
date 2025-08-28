package exercicio_34;

import exercicio_34.modelo.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /*
        Crie um novo projeto na IDE com a classe Pessoa e seus atributos nome do tipo String e
        idade inteiro. Crie os construtores com e sem parâmetros, get's e set's. Os métodos de leitura
        e imprimir os dados devem usar JOptionPane para exibir os dados. Crie as subclasses de
        pessoa chamada Aluno e Professor. A classe Aluno deve possui o atributo curso do tipo
        String e a classe Professor os atributos salario do tipo double e título do tipo String.
        Sobrescreva e reaproveite os métodos de leitura e imprimir nas classes Aluno e Professor.
        Crie o método abstrato getNomeFormatado() em Pessoa que retorna String. Na classe
        professor retorna uma concatenação do título com o nome. Na classe aluno retorna o nome
        em maiúsculo.
        Crie uma constante estática(static final) para armazenar um valor default para o título de
        professor ("Doutor") e uma outra constante em Aluno para armazenar o curso ("Sistema de
        Informação"). Estes valores default serão utilizados no preenchimento dos dados no método
        leitura.
        Crie o programa principal para testar as classe Aluno e Professor. Lembre-se de organizar as
        classe em pacotes.
         */

        Aluno aluno1 = new Aluno();
        aluno1.lerDados();
        aluno1.imprimir();
        aluno1.getNomeFormatado();
        JOptionPane.showMessageDialog(null,aluno1.getNomeFormatado());

        Professor professor1 = new Professor();
        professor1.lerDados();
        professor1.imprimir();
        JOptionPane.showMessageDialog(null,professor1.getNomeFormatado());

    }
}
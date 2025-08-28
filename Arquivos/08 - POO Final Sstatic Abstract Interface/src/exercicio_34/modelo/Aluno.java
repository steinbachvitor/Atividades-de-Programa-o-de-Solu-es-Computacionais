package exercicio_34.modelo;

import javax.swing.*;

public class Aluno extends Pessoa{
    private String curso;

    public static final String DEFAULT_CURSO = "Sistema de informação";

    public Aluno(){
        super();
        this.curso = DEFAULT_CURSO;
    }

    public Aluno(String nome, int idade, String curso){
        super(nome,idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void lerDados(){
        super.lerDados();
        setCurso(JOptionPane.showInputDialog(null,"Digite seu curso: "));
    }

    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"Nome: " + getNome() +
                ", idade: " + getIdade() + ", Curso: " + getCurso());
    }

    @Override
    public String getNomeFormatado(){
        return getNome().toUpperCase();
    }
}

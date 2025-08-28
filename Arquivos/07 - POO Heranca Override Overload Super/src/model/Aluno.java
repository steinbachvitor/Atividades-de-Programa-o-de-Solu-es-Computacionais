package model;

import java.util.Locale;

public class Aluno extends Pessoa{
    private String curso;
    private int fase;

    public Aluno(){
        this(0,"",0,"",0);
    }

    public Aluno(int id, String nome, int idade,String curso, int fase){
        super(id, nome,idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public boolean verificarFormando(){
        if(getFase() == 8){
            return true;
        } else {
            return false;
        }
    }
    //Overloading
    public boolean verificarFormando(int totalFases){
        if(getFase() == totalFases){
            return true;
        } else {
            return false;
        }
    }

    //Override
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Curo: " + curso);
        System.out.println("Fase: " + fase);
    }
}

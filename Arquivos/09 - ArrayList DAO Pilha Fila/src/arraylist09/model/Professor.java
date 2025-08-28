package arraylist09.model;

import java.util.ArrayList;
import arraylist09.dao.*;

public class Professor extends  Pessoa{
    private double salario;
    private String titulo;

    public Professor(){
        this(0, "", 0, 0, " ");

    }

    public Professor(int id, String nome, int idade, double salario, String titulo) {
        super(id,nome,idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.paraString()
                + "Salario: " + this.getSalario()
                + "\nTitulo: " + this.getTitulo()
                + "\n-----------\n";
    }

    public static ArrayList<Professor> getListaProfessor(){
        return ProfessorDAO.getListaProfessor();
    }

    // Cadastra novo professor
    public static void insertProfessorBD(Professor obj){
        ProfessorDAO.getListaProfessor().add(obj);
    }

    // Deleta um professor pelo ID
    public static void deleteProfessorBD(int id){
        int indice = procuraIndice(id);
        if(indice >= 0){
            ProfessorDAO.getListaProfessor().remove(indice);
        }
    }

    // Edita um professor pelo ID
    public static void updateProfessorBD(int id, Professor prof){
        int indice = procuraIndice(id);
        if(indice >= 0){
            ProfessorDAO.getListaProfessor().set(indice, prof);
        }
    }

    // Procura o índice do professor na lista pelo ID
    private static int procuraIndice(int id){
        for(int i = 0; i < ProfessorDAO.getListaProfessor().size(); i++){
            if(ProfessorDAO.getListaProfessor().get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}

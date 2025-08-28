package exercicio_34.modelo;

import javax.swing.*;

public class Professor extends Pessoa{
    private double salario;
    private String titulo;

    public static final String DEFAULT_TITULO = "Doutor";

    public Professor(){
        super();
        this.titulo = DEFAULT_TITULO;
    }

    public Professor(String nome, int idade, double salario, String titulo){
        super(nome, idade);
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
    public void lerDados(){
        super.lerDados();
        setTitulo(JOptionPane.showInputDialog(null,"Digite o titulo do professor: "));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salario do professor: ")));
    }

    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"Nome: " + getNome() +
                ", idade: " + getIdade() +", Salario: "+ getSalario() + ", Titulo: " + getTitulo());
    }

    @Override
    public String getNomeFormatado(){
        return "Nome: " + getNome()+ ", Titulo: " + getTitulo();
    }
}

package model;

public class Professor extends Pessoa{
    private double salario;
    private String titulo;

    public Professor(){
        this(0,"",0,0.0,"");
    }

    public Professor(int id, String nome, int idade, double salario, String titulo){
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

    public double calcularImposto(){
        double cal = getSalario() * 0.10;
        return Math.round(cal * 100.0) / 100.0;
    }
    //Overloading
    public double calcularImposto(double imposto){
        double cal = getSalario() * (imposto/100);
        return Math.round(cal * 100.0) / 100.0;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Salario: " + getSalario());
        System.out.println("Titulo: " + getTitulo());
    }
}

package model;

public class Funcionario extends Pessoa{
    private double salario;
    private int cargaHoraria;
    private String funcao;

    public Funcionario(){
       this(0,"",0,0,0,"");
    }

    public Funcionario(int id, String nome, int idade, double salario, int cargaHoraria, String funcao){
        super(id, nome, idade);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    //Overloading
    public double receberAumento(){
        double novoSalario = getSalario() + (getSalario() * (10 / 100.0));
        setSalario(novoSalario);
        return novoSalario;
    }

    public double receberAumento(int porcentagem) {
        double novoSalario = getSalario() + (getSalario() * (porcentagem / 100.0));
        setSalario(novoSalario);
        return novoSalario;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Salario: " + getSalario());
        System.out.println("Carga horaria: " + getCargaHoraria() + " horas");
        System.out.println("Função: " + getFuncao());
    }
}

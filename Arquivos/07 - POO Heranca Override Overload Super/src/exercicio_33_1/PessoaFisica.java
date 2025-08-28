package exercicio_33_1;

import java.util.ArrayList;

public class PessoaFisica extends Pessoa{
    private String  CPF, RG;
    private double salario;

    public PessoaFisica(String nome, String endereco, String telefone, String CPF, String RG, double salario) {
        super(nome, endereco, telefone);
        this.CPF = CPF;
        this.RG = RG;
        this.salario = salario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalário(double salario) {
        salario = salario;
    }

    public static PessoaFisica comparador(ArrayList<PessoaFisica> pessoasFisicas){
        PessoaFisica p = pessoasFisicas.get(0);
        for(int i = 0; i < pessoasFisicas.size(); i++){
            if(p.getSalario() < pessoasFisicas.get(i).getSalario()){
                p = pessoasFisicas.get(i);
            }
        }
        return p;
    }

    @Override
    public String toString(){
        return "----------------------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Endereco: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "CPF: " + getCPF() + "\n" +
                "RG: " + getRG() + "\n" +
                "Salario: " + getSalario() + "\n" +
                "----------------------------------------------\n";
    }
}

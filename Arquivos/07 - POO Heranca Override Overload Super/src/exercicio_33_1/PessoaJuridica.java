package exercicio_33_1;

import java.util.ArrayList;

public class PessoaJuridica extends Pessoa{
    private String  cnpj, ie;
    private double faturamento;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String ie, double faturamento) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
        this.faturamento = faturamento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public static PessoaJuridica comparador(ArrayList<PessoaJuridica> pessoasJuridias){
        PessoaJuridica p = pessoasJuridias.get(0);
        for(int i = 0; i < pessoasJuridias.size(); i++){
            if( p.getFaturamento() < pessoasJuridias.get(i).getFaturamento()){
                p = pessoasJuridias.get(i);
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
                "Cnpj: " + getCnpj() + "\n" +
                "Ie: " + getIe() + "\n" +
                "Faturamento: " + getFaturamento() + "\n" +
                "----------------------------------------------\n";
    }
}

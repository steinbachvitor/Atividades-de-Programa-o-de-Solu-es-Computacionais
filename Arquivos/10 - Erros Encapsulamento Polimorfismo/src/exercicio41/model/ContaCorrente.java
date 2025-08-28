package exercicio41.model;

public class ContaCorrente extends Conta{
    private double saldo;
    private double taxaServico;

    public ContaCorrente(){
        this(" ", 0,0,0);
    }

    public ContaCorrente(String nome,int id, double saldo, double taxaServico){
        super(nome,id);
        this.saldo = saldo;
        this.taxaServico = taxaServico;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    @Override
    public double getSaldo() {
        setSaldo(saldo - (saldo * (getTaxaServico()/100)));
        return this.saldo;
    }

    @Override
    public void setDeposito(double deposito) {
        saldo += deposito;
    }
}

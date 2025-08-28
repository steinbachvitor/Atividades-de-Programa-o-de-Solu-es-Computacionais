package exercicio41.model;

public class ContaPoupanca extends Conta {
    private double saldo;
    private double juros;

    public ContaPoupanca(){
        this(" ", 0,0,0);
    }

    public ContaPoupanca(String nome,int id ,double saldo, double juros){
        super(nome,id);
        this.saldo = saldo;
        this.juros = juros;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public double getSaldo() {
        setSaldo(saldo + (saldo * (getJuros() / 100)));
        return this.saldo;
    }

    @Override
    public void setDeposito(double deposito) {
        saldo += deposito;
    }
}

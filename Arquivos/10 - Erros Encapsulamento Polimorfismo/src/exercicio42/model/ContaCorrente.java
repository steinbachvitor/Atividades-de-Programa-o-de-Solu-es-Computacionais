package exercicio42.model;

public class ContaCorrente implements IConta {
    private String nome;
    private double saldo;
    private double taxaServico;
    private int id;

    public ContaCorrente(){
        this("",0,0,0);
    }

    public ContaCorrente(String nome, double saldo, double taxaServico, int id){
        this.nome = nome;
        this.saldo = saldo;
        this.taxaServico = taxaServico;
        this.id = id;
    }

    @Override
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public double getSaldo(){
        saldo = (saldo - (saldo *(taxaServico/100)));
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaJuros) {
        this.taxaServico = taxaJuros;
    }

    @Override
    public void setDeposito(double dep){
        setSaldo(getSaldo() + dep);
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

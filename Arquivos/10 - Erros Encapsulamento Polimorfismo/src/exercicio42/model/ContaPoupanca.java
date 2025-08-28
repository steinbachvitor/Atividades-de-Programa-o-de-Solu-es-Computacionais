package exercicio42.model;

public class ContaPoupanca implements IConta {

    private String nome;
    private double saldo;
    private double juros;
    private int id;

    public ContaPoupanca(){
        this("",0,0,0);
    }

    public ContaPoupanca(String nome, double saldo, double juros,int id){
        this.nome = nome;
        this.saldo = saldo;
        this.juros = juros;
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
        saldo = (saldo + (saldo * (juros/100)));
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
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

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "ID: " + getId() + "\n";
    }
}

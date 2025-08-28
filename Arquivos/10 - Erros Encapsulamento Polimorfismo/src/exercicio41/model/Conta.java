package exercicio41.model;

public abstract class Conta {
    private String nome;
    private int id;

    public Conta(){
        this(" ", 0);
    }

    public Conta(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getSaldo();
    public abstract void setDeposito(double deposito);
}

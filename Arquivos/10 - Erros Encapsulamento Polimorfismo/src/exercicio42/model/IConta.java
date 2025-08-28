package exercicio42.model;

public interface IConta {
    public abstract String getNome();
    public abstract double getSaldo();
    public abstract  void setDeposito(double dep);
    public int getId();
}

package exercicio_33_2;

public class ClientesABC extends  Clientes{
    public ClientesABC(String codigo, String nome, String grupo, double precoVenda, String unidade, int quantidadeEstoque) {
        super(codigo, nome, grupo, precoVenda, unidade, quantidadeEstoque);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

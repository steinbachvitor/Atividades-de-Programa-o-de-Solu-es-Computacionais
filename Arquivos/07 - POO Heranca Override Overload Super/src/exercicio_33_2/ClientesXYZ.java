package exercicio_33_2;

public class ClientesXYZ extends  Clientes{
    private double precoCusto;

    public ClientesXYZ(String codigo, String nome, String grupo, double precoVenda, String unidade, int quantidadeEstoque, double precoCusto) {
        super(codigo, nome, grupo, precoVenda, unidade, quantidadeEstoque);
        this.precoCusto = precoCusto;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "-------------------------------------------\n" +
                "Código: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Grupo: " + getGrupo() + "\n" +
                "Preço de custo: " + getPrecoCusto() + "\n" +
                "Preço de venda: " + getPrecoVenda() + "\n" +
                "Unidade: " + getUnidade() + "\n" +
                "Quantidade em estoque: " + getQuantidadeEstoque() + "\n" +
                "-------------------------------------------\n";
    }
}

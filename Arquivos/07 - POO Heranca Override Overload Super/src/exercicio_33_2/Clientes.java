package exercicio_33_2;

public class Clientes {
    private String codigo, nome, grupo, unidade;
    private double precoVenda;
    private int quantidadeEstoque;

    public Clientes(String codigo, String nome, String grupo, double precoVenda, String unidade, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.precoVenda = precoVenda;
        this.unidade = unidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString(){
        return "-------------------------------------------\n" +
                "Código: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Grupo: " + getGrupo() + "\n" +
                "Preco de venda: " + getPrecoVenda() + "\n" +
                "Unidade: " + getUnidade() + "\n" +
                "Quantidade em estoque: " + getQuantidadeEstoque() + "\n" +
                "-------------------------------------------\n";
    }
}

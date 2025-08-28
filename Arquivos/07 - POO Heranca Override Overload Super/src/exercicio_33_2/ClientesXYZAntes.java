package exercicio_33_2;

public class ClientesXYZAntes {
    private String codigo, nome, endereco, bairro, CPF, fone;

    public ClientesXYZAntes(String codigo, String nome, String endereco, String bairro, String CPF, String fone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.CPF = CPF;
        this.fone = fone;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String toString(){
        return "-------------------------------------------\n" +
                "Código: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Bairro: " + getBairro() + "\n" +
                "CPF: " + getCPF() + "\n" +
                "Fone: " + getFone() + "\n" +
                "-------------------------------------------\n";
    }
}

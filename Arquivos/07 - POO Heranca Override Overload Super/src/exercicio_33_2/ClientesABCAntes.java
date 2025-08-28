package exercicio_33_2;

public class ClientesABCAntes {
    private String codigo, nome, endereco, telefone, bairro, CPF , RG;

    public ClientesABCAntes(String codigo, String nome, String endereco, String telefone, String bairro, String CPF, String RG) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.bairro = bairro;
        this.CPF = CPF;
        this.RG = RG;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String código) {
        this.codigo = código;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String toString(){
        return "-------------------------------------------\n" +
                "Código: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Bairro: " + getBairro() + "\n" +
                "CPF: " + getCPF() + "\n" +
                "RG: " + getRG() + "\n" +
                "-------------------------------------------\n";
    }
}

package exercicio_32_1;

import java.util.Scanner;

public class Empresa {
    private String nome, endereco, cidade, estado, cep, telefone;


    public Empresa(){
        this("","","","","", "");
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void solicitarDados(Scanner sc){
        System.out.print("Digite o nome: ");
        setNome(sc.nextLine());
        System.out.print("Digite o Endereço: ");
        setEndereco(sc.nextLine());
        System.out.print("Digite a Cidade: ");
        setCidade(sc.nextLine());
        System.out.print("Digite o Estado: ");
        setEstado(sc.nextLine());
        System.out.print("Digite o CEP: ");
        setCep(sc.nextLine());
        System.out.print("Digite o Telefone: ");
        setTelefone(sc.nextLine());
    }

    @Override
    public String toString(){
        return "-----------------------------------------------\n" +
                "Nome: " + getNome() + "\n" +
                "Endereco: " + getEndereco() + "\n" +
                "Cidade: " + getCidade() + "\n" +
                "Estado: " + getEstado() + "\n" +
                "Cep: " + getCep() + "\n" +
                "Telefone: " + getTelefone() + "\n";
    }
}

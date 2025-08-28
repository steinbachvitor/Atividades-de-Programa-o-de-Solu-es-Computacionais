package exercicio_34.modelo;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this("",0);
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void lerDados(){
        setNome(JOptionPane.showInputDialog(null,"Insira o nome: "));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a idade: ")));
    }

    public void imprimir(){
        JOptionPane.showMessageDialog(null,"Nome: " + getNome() + ", idade: " + getIdade());
    }

    public String getNomeFormatado(){
        return nome.toLowerCase();
    }
}

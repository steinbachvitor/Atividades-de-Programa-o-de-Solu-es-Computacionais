package model;

public class Pessoa {
    private int id, idade;
    private String nome;

    public Pessoa(){
        this(0,"",0);
    }

    public Pessoa(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniversario(){
        setIdade(getIdade()+1);
        System.out.println("Parabens é seu aniversario! Hoje você faz " + getIdade() + "!");
    }

    public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Id: " + getId());
        System.out.println("Idade: " + getIdade());
    }
}

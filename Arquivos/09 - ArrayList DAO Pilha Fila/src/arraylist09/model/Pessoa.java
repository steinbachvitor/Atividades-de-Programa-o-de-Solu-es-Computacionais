package arraylist09.model;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String paraString(){
        return "Nome: " + nome + "\n" +
                "Id: " + id + "\n" +
                "Idade: " + idade + "\n";
    }
}

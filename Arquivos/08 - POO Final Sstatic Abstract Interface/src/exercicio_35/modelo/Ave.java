package exercicio_35.modelo;

public class Ave implements Animal{
    private String especie;
    private String cor;

    public Ave(String especie, String cor) {
        this.especie = especie;
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void produzirSom(){
        System.out.println("Cantar");
    }

    @Override
    public void mover(){
        System.out.println("Voar");
    }
}

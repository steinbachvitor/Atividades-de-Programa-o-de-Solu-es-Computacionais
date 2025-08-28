package media.notas;

public class Media {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public Media(){
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    public Media(String nome, double nota1, double nota2, double nota3 ){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia(){
        media = (getNota1() + getNota2() + getNota3()) / 3;
        return  Math.round(media * 100.0) / 100.0;
    }

    @Override
    public String toString(){
        return "O aluno: " + getNome() +
                ", possui media: " + getMedia();
    }
}
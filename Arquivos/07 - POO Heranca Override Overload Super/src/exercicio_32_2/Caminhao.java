package exercicio_32_2;

import java.util.Scanner;

public class Caminhao extends Veiculo{
    private int cargaMax, alturaMax, comprimento;

    public Caminhao() {
        this(0,0,0.0,0,0,0);
    }

    public Caminhao(int peso, int velMax, double preco, int cargaMax, int alturaMax, int comprimento) {
        super(peso, velMax, preco);
        this.cargaMax = cargaMax;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public void solicitarDados(Scanner sc){
        super.solicitarDados(sc);
        System.out.print("Qual a carga maxima do veiculo: ");
        setCargaMax(sc.nextInt());
        System.out.print("Qual a carga altura do veiculo: ");
        setAlturaMax(sc.nextInt());
        System.out.print("Qual o comprimento do veiculo: ");
        setComprimento(sc.nextInt());
    }

    @Override
    public String toString(){
        return super.toString() +
                "Carga maxima do veiculo: " + getCargaMax() + "\n" +
                "Altura maxima do veiculo: " + getAlturaMax() + "\n" +
                "Comprimento do veiculo: " + getComprimento() + "\n" +
                "----------------------------\n" ;
    }
}

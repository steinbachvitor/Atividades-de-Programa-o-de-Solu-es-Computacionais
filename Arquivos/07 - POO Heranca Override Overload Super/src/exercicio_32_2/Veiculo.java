package exercicio_32_2;

import java.util.Scanner;

public class Veiculo {
    private int peso, velMax;
    private double preco;

    public Veiculo() {
        this(0,0,0.0);
    }

    public Veiculo(int peso, int velMax, double preco) {
        this.peso = peso;
        this.velMax = velMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void solicitarDados(Scanner sc){
        System.out.print("Qual o peso do veiculo: ");
        setPeso(sc.nextInt());
        System.out.print("Qual a velocidade maxima do veiculo: ");
        setVelMax(sc.nextInt());
        System.out.print("Qual o preço do veiculo: ");
        setPreco(sc.nextDouble());
    }

    @Override
    public String toString(){
        return "----------------------------\n" +
                "Peso do veiculo: " + getPeso() + "\n" +
                "Velocidade maxima do veiculo: " + getVelMax() + "\n" +
                "Preço do veiculo: " + getPreco() + "\n" ;
    }
}

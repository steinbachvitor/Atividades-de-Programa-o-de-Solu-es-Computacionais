package exercicio_32_2;

import java.util.Scanner;

public class CarroPasseio extends Veiculo{
    private String cor, modelo;

    public CarroPasseio() {
        this(0,0,0.0,"","");
    }

    public CarroPasseio(int peso, int velMax, double preco, String cor, String modelo) {
        super(peso, velMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void solicitarDados(Scanner sc){
        super.solicitarDados(sc);
        System.out.print("Qual a cor do veiculo: ");
        sc.nextLine();
        setCor(sc.nextLine());
        System.out.print("Qual o modelo do veiculo: ");
        setModelo(sc.nextLine());
    }

    @Override
    public String toString(){
        return super.toString() +
                "Modelo do veiculo: " + getModelo() + "\n" +
                "Cor do veiculo: " + getCor() + "\n" +
                "----------------------------\n" ;
    }
}

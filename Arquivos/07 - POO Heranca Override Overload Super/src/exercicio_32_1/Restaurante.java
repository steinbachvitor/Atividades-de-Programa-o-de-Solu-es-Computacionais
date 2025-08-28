package exercicio_32_1;

import java.util.Scanner;

public class Restaurante extends Empresa{
    private String tipoComida;
    private double precoMedio;

    public Restaurante() {
        this("", "", "", "", "", "", "",0.0);
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, String tipoComida, double precoMedio) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    @Override
    public void solicitarDados(Scanner sc){
        super.solicitarDados(sc);
        System.out.print("Digite o tipo de comida servido: ");
        setTipoComida(sc.nextLine());
        System.out.print("Digite o preço medio da comida: ");
        setPrecoMedio(sc.nextDouble());
    }

    @Override
    public String toString(){

        return super.toString() + "Tipo de Comida:" + getTipoComida() + "\n" +
                "PrecoMedio: " + getPrecoMedio() + "\n" +
                "-----------------------------------------------";
    }
}

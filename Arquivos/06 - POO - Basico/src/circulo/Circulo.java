package circulo;

public class Circulo {
    private double area;
    private double raio;

    public Circulo(){
        this.raio = 0;
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getArea(){
        area = Math.PI * (raio * raio);
        return Math.round(area * 100.0) / 100.0;

    }


}

public class Circulo {
    private Ponto centro;
    private double raio;

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    private double perimetro () {
        return 2*Math.PI+raio;
    }

    private double area () {
        return Math.PI*(raio)*(raio);
    }


}

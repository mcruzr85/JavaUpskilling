public class Circulo {
    public static final double PI = 3.14;
    private double radio;

    public Circulo(){}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea(double radio){
        return Circulo.PI * radio * radio;
    }
    public double calcularCircunferencia( double radio){
        return 2 * Circulo.PI * radio;
    }
}

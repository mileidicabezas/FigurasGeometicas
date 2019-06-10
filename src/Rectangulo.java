public class Rectangulo extends FigurasGeometricas{

    private double largo;
    private double ancho;
    private double perimetro;


    public Rectangulo(String nombre, double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
        this.perimetro = perimetro;

    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setPerimetro(double area) {
        this.perimetro = area;
    }

    public double getPerimetro() {
        this.calculaPerimetro();
        return perimetro;
    }

    @Override
    public String toString() {

        return "El perimtro del rectangulo es: " + Double.toString(getPerimetro());
    }

    @Override public void calculaPerimetro(){
        this.perimetro = 2 * (getLargo()) + 2 * (getAncho());
    }
}

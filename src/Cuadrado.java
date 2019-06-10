public class Cuadrado extends FigurasGeometricas {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;
    private double perimetro;


    public Cuadrado(String nombre,double ladoA,double ladoB, double ladoC,double ladoD) {
        super(nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        this.perimetro = perimetro;

    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }

    public double getLadoD() {
        return ladoD;
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
        return "Perimetro del cuadrado: " + Double.toString(getPerimetro());
    }

    @Override
    public void calculaPerimetro() {
        this.perimetro = getLadoA() + getLadoB() + getLadoC() + getLadoD();

    }
}

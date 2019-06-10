public  class Triangulo extends FigurasGeometricas {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double perimetro;


    public Triangulo(String nombre, double ladoA, double ladoB,double ladoC) {
        super(nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
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

    public void setPerimetro(double area) {
        this.perimetro = area;
    }

    public double getPerimetro() {
        this.calculaPerimetro();
        return perimetro;
    }

    @Override
    public String toString() {
        return "El perimetro del triangulo es: " + Double.toString(getPerimetro());
    }

    @Override public void calculaPerimetro(){
        this.perimetro = getLadoA()+ getLadoB()+getLadoC();
    }

}



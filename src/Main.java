import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FigurasGeometricas figuraCuadrado = new Cuadrado("Cuadrado", 4.2, 4.6, 4.6, 5.7);
        //figuraCuadrado.getPerimetro();

        FigurasGeometricas figuraRectangulo = new Rectangulo("Cuadrado", 4.2, 4.6);
        FigurasGeometricas figuraTriangulo = new Triangulo("Cuadrado", 4.2, 4.6, 6.9);

        List<FigurasGeometricas> figuras = new ArrayList<>();
        figuras.add(figuraCuadrado);
        figuras.add(figuraRectangulo);
        figuras.add(figuraTriangulo);

        for (FigurasGeometricas figura : figuras) {
            System.out.println(figura);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public abstract class  FigurasGeometricas {

    private String nombre;

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return nombre;
    }


    public abstract void calculaPerimetro();


    @Override
    public abstract String toString();

}
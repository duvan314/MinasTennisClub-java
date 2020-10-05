import java.util.ArrayList;

public class Sede  {
    public String nombre;
    public int numeroCanchas;
    public ArrayList<Persona> personalSocios = new ArrayList<>();

    public Sede(String nombre, int numeroCanchas) {
        this.nombre = nombre;
        this.numeroCanchas = numeroCanchas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCanchas() {
        return numeroCanchas;
    }

    public void setNumeroCanchas(int numeroCanchas) {
        this.numeroCanchas = numeroCanchas;
    }
}

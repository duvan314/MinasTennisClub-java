import java.util.ArrayList;

public class Sede  {
    public String nombre;
    public String ciudad;

    public ArrayList<Persona> personalSocios = new ArrayList<>();

    public Sede(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCanchas() {
        return ciudad;
    }

    public void  setNumeroCanchas(String numeroCanchas) { //se cambio de int a String
        this.ciudad = numeroCanchas;
    }
}

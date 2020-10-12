import java.util.ArrayList;

public class Sede  {
    public String nombre;
    public String ciudad;

    public ArrayList<Persona> personalSocios = new ArrayList<>();

    public Sede(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public int getNumeroCanchas() {
//        return ciudad;
//    }
//
//    public void setNumeroCanchas(int numeroCanchas) {
//        this.ciudad = numeroCanchas;
//    }
}

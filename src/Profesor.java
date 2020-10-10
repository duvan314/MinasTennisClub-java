import java.util.ArrayList;

 public class Profesor extends Persona {
    public String horario;
    ArrayList<Jugador> alumno = new ArrayList<>();

    public Profesor(String nombre, int edad, int telefono, int documento,String categoria, String contraseña, String horario, String rol) {
        super(nombre, edad, telefono, documento, categoria, contraseña, rol);
        this.horario = horario;
    }

     public String getHorario() {
         return horario;
     }

     public void setHorario(String horario) {
         this.horario = horario;
     }
 }

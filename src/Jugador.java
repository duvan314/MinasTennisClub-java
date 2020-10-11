 public class Jugador extends Persona {
    public boolean escuela;
    public boolean competencia;

    public Jugador(String nombre, int edad, int telefono, int documento,String categoria, String contraseña, boolean escuela, boolean competencia, String rol) {
        super(nombre, edad, telefono, documento, categoria, contraseña, rol);
        this.competencia = competencia;
    }

    public boolean isEscuela() {

        return escuela;
    }

    public void setEscuela(boolean escuela) {

        this.escuela = escuela;
    }

    public boolean isCompetencia() {

        return competencia;
    }

    public void setCompetencia(boolean competencia) {

        this.competencia = competencia;
    }

     @Override
     public String toString() {
         return "Jugador{" +
                 "nombre='" + nombre + '\'' +
                 ", edad=" + edad +
                 ", telefono=" + telefono +
                 ", documento=" + documento +
                 ", categoria='" + categoria + '\'' +
                 ", rol='" + rol + '\'' +
                 '}';
     }

 }

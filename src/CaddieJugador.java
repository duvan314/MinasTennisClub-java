public class CaddieJugador extends Persona {
    public String horario;


    public CaddieJugador(String nombre, int edad, int telefono, int documento, String categoria, String contraseña, String horario) {
        super(nombre, edad, telefono, documento, categoria, contraseña);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }



}

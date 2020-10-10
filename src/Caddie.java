public class Caddie extends Persona {
    public String horario;
    public Cancha cancha;


    public Caddie(String nombre, int edad, int telefono, int documento, String categoria, String contraseña, String horario, Cancha cancha, String rol) {
        super(nombre, edad, telefono, documento, categoria, contraseña,  rol);
        this.horario = horario;
        this.cancha = cancha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }



}

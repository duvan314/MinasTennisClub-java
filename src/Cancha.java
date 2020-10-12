public class Cancha {
    public int id;
    public String turnos;
    public String tipo;
    public boolean libre;
    public Sede sede;

   // public Caddie caddie;

    public Cancha(String turnos, String tipo, boolean libre, int id,Sede sede/*, Caddie caddie*/) {
        this.turnos = turnos;
        this.tipo = tipo;
        this.libre = libre;
        this.id=id;
        this.sede=sede;
      //  this.caddie = caddie;
    }

    public String getTurnos() {
        return turnos;
    }

    @Override
    public String toString() {
        return "Cancha{" +
                "id=" + id +
                ", turnos='" + turnos + '\'' +
                ", tipo='" + tipo + '\'' +
                ", libre=" + libre +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isLibre() {
        return libre;
    }
}

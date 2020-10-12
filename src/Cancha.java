public class Cancha {
    public int id;
    public String turnos;
    public String tipo;
    public boolean libre;

   // public Caddie caddie;

    public Cancha(String turnos, String tipo, boolean libre, int id/*, Caddie caddie*/) {
        this.turnos = turnos;
        this.tipo = tipo;
        this.libre = libre;
        this.id=id;
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
}

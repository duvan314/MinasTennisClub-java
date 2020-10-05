public class Cancha {
    public String turnos;
    public String tipo;
   // public Caddie caddie;

    public Cancha(String turnos, String tipo/*, Caddie caddie*/) {
        this.turnos = turnos;
        this.tipo = tipo;
      //  this.caddie = caddie;
    }

    public String getTurnos() {
        return turnos;
    }

    public void setTurnos(String turnos) {
        this.turnos = turnos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

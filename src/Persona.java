public class Persona {
    public String nombre;
    public int edad;
    public int telefono;
    public  int documento;
    public String categoria;
    public String contraseña;
    public String rol ;
    // public Sede sede;



    public Persona(String nombre, int edad, int telefono, int documento, String categoria, String contraseña, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.documento = documento;
        this.categoria = categoria;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int iContraseña() {
        return contraseña.indexOf(contraseña);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' + "\n"+
                ", edad=" + edad +"\n"+
                ", telefono=" + telefono +"\n"+
                ", documento=" + documento +"\n"+
                ", categoria='" + categoria + '\'' +"\n"+
                ", contraseña='" + contraseña + '\'' +"\n"+
                ", Rol='" + rol + '\'' +"\n"+
                '}';
    }


}

import java.util.Comparator; //pContraseña

public class pContraseñaComparator implements Comparator<Persona>{
    public int compare(Persona contraseña1, Persona contraseña2) {
        if(contraseña1.contraseña.compareTo(contraseña2.contraseña)<0){
            return -1;
        }
        else if(contraseña1.contraseña.equals(contraseña2.contraseña)){
            return 0;
        }
        else{
            return 1;
        }
    }

}

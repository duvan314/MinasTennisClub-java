import java.util.Comparator;

public class pNombreComparator implements Comparator<Persona>{
    public int compare(Persona nombre1, Persona nombre2) {
        if(nombre1.nombre.compareTo(nombre2.nombre)<0){
            return -1;
        }
        else if(nombre1.nombre.equals(nombre2.nombre)){
            return 0;
        }
        else{
            return 1;
        }
    }

}
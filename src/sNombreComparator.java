import java.util.Comparator;
public class sNombreComparator implements Comparator<Sede>{
    public int compare(Sede nombre1, Sede nombre2) {
        if(nombre1.nombre.compareTo(nombre2.nombre) <0){
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

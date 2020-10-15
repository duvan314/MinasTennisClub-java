import java.util.Comparator;
public class pEdadComparator implements Comparator<Persona>{
    public int compare(Persona edad1, Persona edad2) {
        if(edad1.edad < edad2.edad){
            return -1;
        }
        else if(edad1.edad == edad2.edad){
            return 0;
        }
        else{
            return 1;
        }
    }
}

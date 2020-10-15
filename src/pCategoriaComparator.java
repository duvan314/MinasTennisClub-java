import java.util.Comparator;

public class pCategoriaComparator implements Comparator<Persona>{
    public int compare(Persona categoria1, Persona categoria2) {
        if(categoria1.categoria.compareTo(categoria2.categoria)<0){
            return -1;
        }
        else if(categoria1.categoria.equals(categoria2.categoria)){
            return 0;
        }
        else{
            return 1;
        }
    }

}

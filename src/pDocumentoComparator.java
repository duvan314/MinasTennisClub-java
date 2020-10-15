import java.util.Comparator;

public class pDocumentoComparator implements Comparator<Persona>{
    public int compare(Persona documento1, Persona documento2) {
        if(documento1.documento < documento2.documento){
            return -1;
        }
        else if(documento1.documento == documento2.documento){
            return 0;
        }
        else{
            return 1;
        }
    }

}

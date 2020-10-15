import java.util.Comparator;

public class pTelefonoComparator implements Comparator<Persona>{
        public int compare(Persona telefono1, Persona telefono2) {
            if(telefono1.telefono < telefono2.telefono){
                return -1;
            }
            else if(telefono1.telefono == telefono2.telefono){
                return 0;
            }
            else{
                return 1;
            }
        }

}

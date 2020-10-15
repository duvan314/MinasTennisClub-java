import java.util.Comparator;
public class prHorarioComparator implements Comparator<Profesor>{
    public int compare(Profesor horario1, Profesor horario2) {
        if(horario1.horario.compareTo(horario2.horario) <0){
            return -1;
        }
        else if(horario1.horario.equals(horario2.horario)){
            return 0;
        }
        else{
            return 1;
        }
    }
}

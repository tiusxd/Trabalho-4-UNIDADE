import java.util.ArrayList;
import java.util.spi.ToolProvider;

public class Docente extends Entidade{
    private ArrayList<Disciplina> disciplinas;
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Docente() {
    }

    public Docente(String base) {
        super(base);
    }

    @Override
    public String toCsv() {
        // TODO Auto-generated method stub
        return null;
    }

    public void addDisciplina(Disciplina toAdd){
        disciplinas.add(toAdd);
    }
    
    public void removeDisciplina(Disciplina toRemove){
        disciplinas.remove(toRemove);
    }
}

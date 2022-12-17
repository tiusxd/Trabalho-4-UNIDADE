import java.util.ArrayList;
import java.util.spi.ToolProvider;

public class Docente extends Entidade{
    private ArrayList<Disciplina> disciplinas;
    
    public Docente(String nome, int codigo) {
        super(nome, codigo);
    }

    public Docente(String base) {
        super(base);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
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

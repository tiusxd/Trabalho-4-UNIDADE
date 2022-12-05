import java.util.ArrayList;
import java.util.HashMap;

public class Disciplina extends Entidade{
    
    private ArrayList<Docente> docentes;
    private HashMap<Aluno,Float[]> notas;
    private int ano;
    
    public Disciplina() {
    }

    public Disciplina(String base) {
        super(base);
    }
    public boolean adicionarAluno(Aluno aluno){
        if (notas.containsKey(aluno))
            return false;
        notas.put(aluno, new Float[4]);
        return true;
    }

    public boolean removerAluno(Aluno aluno){
        if (!notas.containsKey(aluno))
            return false;
        notas.remove(aluno);
        return true;
    }

    public boolean adicionarDocente(Docente docente){
        if (docentes.contains(docente))
            return false;
        docentes.add(docente);
        return true;
    }

    public boolean removerDocente(Docente docente){
        if (!docentes.contains(docente))
            return false;
        docentes.remove(docente);
        return true;
    }

    public String mapearDocentes(){
        String toReturn = "";
        for (Docente docente : docentes) {
            toReturn = toReturn + "Código: "+docente.getCodigo()+" Nome: " + docente.getNome();
        }

        return toReturn;
    }

    public String mapearAlunos(){
        String toReturn = "";
        for (Aluno aluno : notas.keySet()) {
            toReturn = toReturn + "Código: "+aluno.getCodigo()+" Nome: " + aluno.getNome();
        }

        return toReturn;
    }

    @Override
    public String toCsv() {
        // TODO Auto-generated method stub
        return null;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int novo){
        ano = novo;
    }
    
    public int getDocentesSize(){
        return docentes.size();
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class Disciplina extends Entidade{
    
    private ArrayList<Docente> docentes;
    private HashMap<Aluno,Float[]> notas;
    public HashMap<Aluno, Float[]> getNotas() {
        return notas;
    }

    private int ano;

    
    public Disciplina(String nome, int codigo) {
        super(nome, codigo);
    }

    public Disciplina(String base) {
        super(base);
    }

    public void editarNotas(Escola escola){
    }

    public boolean removerAluno(Aluno aluno){
        if (!notas.containsKey(aluno))
            return false;
        notas.remove(aluno);
        aluno.getNotas().remove(getCodigo());
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

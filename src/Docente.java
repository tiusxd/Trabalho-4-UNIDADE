import java.util.ArrayList;

public class Docente extends Entidade{
    private ArrayList<Disciplina> disciplinas;
    private String matricula,dataNascimento;
    
    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public Docente(String nome, int codigo,String mat, String dataNas) {
        super(nome, codigo);
        disciplinas = new ArrayList<Disciplina>();
        matricula = mat;
        dataNascimento = dataNas;
    }

    public Docente(String base) {
        super(base);
        try{
        disciplinas = new ArrayList<Disciplina>();
        String[] tierOne = base.split(";");
        matricula = tierOne[2];
        dataNascimento = tierOne [3];
        } catch (Exception ex){
            
        }
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toCsv() {
        String toReturn = "";
        toReturn = toReturn + getCodigo() + ";"+ getNome()+";"+matricula+";"+dataNascimento;
        return toReturn;
    }

    public void addDisciplina(Disciplina toAdd){
        disciplinas.add(toAdd);
    }
    
    public void removeDisciplina(Disciplina toRemove){
        disciplinas.remove(toRemove);
    }
}

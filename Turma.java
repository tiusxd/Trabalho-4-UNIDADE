import java.util.ArrayList;

public class Turma extends Entidade{
    private ArrayList<Aluno> alunos;
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    private int ano;

    public Turma() {
    }

    public Turma(String base) {
        super(base);
    }
    public boolean adicionarAluno(Aluno aluno){
        if (alunos.contains(aluno))
            return false;
        alunos.add(aluno);
        return true;
    }
    public boolean removerAluno(Aluno aluno){
        if (!alunos.contains(aluno))
            return false;
        alunos.remove(aluno);
        return true;
    }

    public String mapearAlunos(){
        String toReturn = "";
        for (Aluno aluno : alunos) {
            toReturn = toReturn + "Código: "+aluno.getCodigo()+" Nome: " + aluno.getNome();
        }

        return toReturn;
    }

    @Override
    public String toCsv() {
        // TODO Auto-generated method stub
        return null;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

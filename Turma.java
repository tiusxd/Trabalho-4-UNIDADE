import java.util.ArrayList;

public class Turma extends Entidade{
    private ArrayList<Aluno> alunos;
    private int ano;

    public Turma() {
    }

    public Turma(String base) {
        super(base);
    }
    public void adicionarAluno(Aluno aluno){}
    public void removerAluno(Aluno aluno){}

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

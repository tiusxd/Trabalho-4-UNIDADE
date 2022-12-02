public class Aluno extends Entidade{

    private int turma;

    public Aluno(){

    }
    
    public Aluno(String base){
        super(base);
    }
    @Override
    public String toCsv() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public int getTurma(){
        return turma;
    }

    public void setTurma(int novo){
        turma = novo;
    }
}

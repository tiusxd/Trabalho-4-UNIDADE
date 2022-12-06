import java.util.HashMap;

public class Aluno extends Entidade{
    //TODO adicionar um HashMap para um aluno ver suas notas
    private int turma;
    private HashMap<Integer,Float[]> notas;

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

    public HashMap<Integer, Float[]> getNotas() {
        return notas;
    }
}

package teste_trabalho;

import java.util.ArrayList;
import java.util.HashMap;

public class Disciplina extends Entidade{
    
    private ArrayList<Docente> docentes;
    private HashMap<Aluno,Float> notas;
    private int ano;
    
    public Disciplina() {
    }

    public Disciplina(String base) {
        super(base);
    }
    public void adicionarAluno(Aluno aluno){}

    public void removerAluno(Aluno aluno){}

    public void adicionarDocente(Docente docente){}

    public void removerDocente(Docente docente){}

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
    
}

package teste_trabalho;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

import teste_Objetos_e_Arrays.Carro;

public class Turma extends Entidade{
	Scanner sc = new Scanner(System.in);
	Scanner scn = new Scanner(System.in);

	public LinkedHashMap<Integer,Docente> docentes = new LinkedHashMap<Integer,Docente>();
    public LinkedHashMap<Integer,Disciplina> disciplinas = new LinkedHashMap<Integer,Disciplina>();
    public LinkedHashMap<Integer,Aluno> alunos = new LinkedHashMap<Integer,Aluno>();
    public LinkedHashMap<Integer,Turma> turmas = new LinkedHashMap<Integer,Turma>();
    private GerenteDeArquivo ga = new GerenteDeArquivo();
    private int ano;

    public Turma() {
    }

    public Turma(String base) {
        super(base);
    }
    public void adicionarAluno(){
    	Aluno a = new Aluno();
		alunos.put(a.getCodigo(), a);
    }
    public void removerAluno(){
    	System.out.println("Codigo de aluno à ser apagado: ");
		int x = scn.nextInt();
		alunos.remove(x);
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

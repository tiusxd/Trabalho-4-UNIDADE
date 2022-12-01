package teste_trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Entidade{
	Scanner sc = new Scanner(System.in);
	Scanner scn = new Scanner(System.in);
	
	
    private int turma;
	int codigo; //número indentificador
	String nome;
    
    public Aluno(){
    	/*System.out.print("Nome: ");
    	this.nome = sc.nextLine();
    	System.out.print("Código: ");
    	this.codigo = scn.nextInt();*/
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

package teste_trabalho;

import java.util.Scanner;

public abstract class Entidade{
	Scanner sc = new Scanner(System.in);
	Scanner scn = new Scanner(System.in);
	
    private String nome;
    private int codigo;

    public Entidade(){

    	System.out.print("Nome: ");
    	this.nome = sc.nextLine();
    	System.out.print("Código: ");
    	this.codigo = scn.nextInt();
    }
    public Entidade(String base){

    }

    public abstract String toCsv();

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setNome(String novo){
        nome = novo;
    }

    public void setCodigo(int novo){
        codigo = novo;
    }
}

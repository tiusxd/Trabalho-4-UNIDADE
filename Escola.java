package teste_trabalho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Escola{
	Scanner sc = new Scanner(System.in);
	Scanner scn = new Scanner(System.in);

	
    public LinkedHashMap<Integer,Docente> docentes = new LinkedHashMap<Integer,Docente>();
    public LinkedHashMap<Integer,Disciplina> disciplinas = new LinkedHashMap<Integer,Disciplina>();
    public LinkedHashMap<Integer,Aluno> alunos = new LinkedHashMap<Integer,Aluno>();
    public LinkedHashMap<Integer,Turma> turmas = new LinkedHashMap<Integer,Turma>();
    private GerenteDeArquivo ga = new GerenteDeArquivo();

    public void adicionarAluno(){
    	Aluno a = new Aluno();
    	int i = 0;
		alunos.put(a.codigo, a);
		i++;
    }
    

    public void removerAluno(int codigo) throws NoSuchKeyException{
        if (!alunos.containsKey(codigo)) {
            throw new NoSuchKeyException();
        }else {
        	System.out.println("Codigo de aluno à ser apagado: ");
    		int x = scn.nextInt();
    		alunos.remove(x);
        }
        
    }

    public void adicionarDocente(Docente toAdd){}

    public void removerDocente(int codigo) throws NoSuchKeyException{
        if (!docentes.containsKey(codigo))
            throw new NoSuchKeyException();
    }

    public void adicionarDisciplina(Disciplina toAdd){}

    public void removerDisciplina(int codigo) throws NoSuchKeyException{
        if (!disciplinas.containsKey(codigo))
            throw new NoSuchKeyException();
    }

    public void adicionarTurma(Turma toAdd){}

    public void removerTurma(int codigo) throws NoSuchKeyException{
        if (!turmas.containsKey(codigo))
            throw new NoSuchKeyException();
    }

    //Os métodos abaixo estão retornando null enquanto não são devidamente implementados, pra não dar erro no java

    public String mapearDocentes(){return null;} //Retorna o nome dos docentes e seus códigos.

    public String mapearDisciplinas(){return null;}//Retorna o nome das disciplinas e seus códigos.

    public String mapearAlunos(){return null;}//Retorna o nome dos alunos e seus códigos.

    public String mapearTurmas(){return null;}//Retorna o nome das turmas e seus códigos.

    public void editarDocente(int codigo) throws NoSuchKeyException{
        if (!docentes.containsKey(codigo))
            throw new NoSuchKeyException();
    }//Permite mudar informações de um docente, incluindo disciplinas.

    public void editarDisciplina(int codigo) throws NoSuchKeyException{
        if (!disciplinas.containsKey(codigo))
            throw new NoSuchKeyException();
    }//Permite mudar informações de uma disciplina, incluindo docentes, alunos e notas. 
    //Não deixar disciplina ficar sem docente. Não deixar adicionar aluno de ano errado ser cadastrado.

    public void editarAluno(int codigo) throws NoSuchKeyException{
        if (!alunos.containsKey(codigo))
            throw new NoSuchKeyException();
    }//Permite mudar informações de um aluno, incluindo turmas.

    public void editarTurma(int codigo) throws NoSuchKeyException{
        if (!turmas.containsKey(codigo))
            throw new NoSuchKeyException();
    }//Permite mudar informações de um docente, incluindo alunos.

    public void gerarRelatórios(int tipo){}//Gerar relatórios com o GeradorDeRelatorio e passar pro arquivo com o GerenteDeArquivos.

    public void carregar(){}//Inicializar dados a partir de informações de arquivos.
    
}

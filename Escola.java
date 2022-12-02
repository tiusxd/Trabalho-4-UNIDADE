import java.util.LinkedHashMap;

public class Escola{
    public LinkedHashMap<Integer,Docente> docentes = new LinkedHashMap<Integer,Docente>();
    public LinkedHashMap<Integer,Disciplina> disciplinas = new LinkedHashMap<Integer,Disciplina>();
    public LinkedHashMap<Integer,Aluno> alunos = new LinkedHashMap<Integer,Aluno>();
    public LinkedHashMap<Integer,Turma> turmas = new LinkedHashMap<Integer,Turma>();
    private int maiorAluno,maiorDocente,maiorDisciplina,maiorTurma;
    private GerenteDeArquivo ga = new GerenteDeArquivo();

    //Metódos
    //TODO fazer os métodos de adição e adição darem throws qnd acessar um item q nao existem
    public void adicionarAluno(Aluno toAdd){
        alunos.put(maiorAluno, toAdd);
        maiorAluno++;
    }

    public void removerAluno(int codigo) throws NoSuchKeyException{
        if (!alunos.containsKey(codigo))
            throw new NoSuchKeyException();
        else
            alunos.remove(codigo);
    }

    public void adicionarDocente(Docente toAdd){
        docentes.put(maiorDocente, toAdd);
        maiorDisciplina++;
    }

    public void removerDocente(int codigo) throws NoSuchKeyException{
        if (!docentes.containsKey(codigo))
            throw new NoSuchKeyException();
        else
            docentes.remove(codigo);
    }

    public void adicionarDisciplina(Disciplina toAdd){
        disciplinas.put(maiorDisciplina, toAdd);
        maiorDisciplina++;
    }

    public void removerDisciplina(int codigo) throws NoSuchKeyException{
        if (!disciplinas.containsKey(codigo))
            throw new NoSuchKeyException();
        else
            disciplinas.remove(codigo);
    }

    public void adicionarTurma(Turma toAdd){
        turmas.put(maiorTurma, toAdd);
        maiorTurma++;
    }

    public void removerTurma(int codigo) throws NoSuchKeyException{
        if (!turmas.containsKey(codigo))
            throw new NoSuchKeyException();
        else
            turmas.remove(codigo);
    }

    //Os métodos abaixo estão retornando null enquanto não são devidamente implementados, pra não dar erro no java

    public String mapearDocentes(){return null;} //Retorna o nome dos docentes e seus códigos.

    public String mapearDisciplinas(){return null;}//Retorna o nome das disciplinas e seus códigos.

    public String mapearAlunos(){return null;}//Retorna o nome dos alunos e seus códigos.

    public String mapearTurmas(){return null;}//Retorna o nome das turmas e seus códigos.

    public void editarDocente(int codigo) throws NoSuchKeyException{
        if (!docentes.containsKey(codigo))
            throw new NoSuchKeyException();
        //int key = docentes.get(codigo).getCodigo();
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

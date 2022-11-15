import java.util.HashMap;

public class Escola{
    public HashMap<Integer,Docente> docentes;
    public HashMap<Integer,Disciplina> disciplinas;
    public HashMap<Integer,Aluno> alunos;
    public HashMap<Integer,Turma> turmas;
    private GerenteDeArquivo ga;

    //Metódos
    //TODO fazer os métodos de adição e adição darem throws qnd acessar um item q nao existem
    public void adicionarAluno(Aluno toAdd){}

    public void removerAluno(int codigo){}

    public void adicionarDocente(Docente toAdd){}

    public void removerDocente(int codigo){}

    public void adicionarDisciplina(Disciplina toAdd){}

    public void removerDisciplina(int codigo){}

    public void adicionarTurma(Turma toAdd){}

    public void removerTurma(int codigo){}

    //Os métodos abaixo estão retornando null enquanto não são devidamente implementados, pra não dar erro no java

    public String mapearDocentes(){return null;} //Retorna o nome dos docentes e seus códigos.

    public String mapearDisciplinas(){return null;}//Retorna o nome das disciplinas e seus códigos.

    public String mapearAlunos(){return null;}//Retorna o nome dos alunos e seus códigos.

    public String mapearTurmas(){return null;}//Retorna o nome das turmas e seus códigos.

    public void editarDocente(int codigo){}//Permite mudar informações de um docente, incluindo disciplinas.

    public void editarDisciplina(int codigo){}//Permite mudar informações de uma disciplina, incluindo docentes, alunos e notas. 
    //Não deixar disciplina ficar sem docente. Não deixar adicionar aluno de ano errado ser cadastrado.

    public void editarAluno(int codigo){}//Permite mudar informações de um aluno, incluindo turmas.

    public void editarTurma(int codigo){}//Permite mudar informações de um docente, incluindo alunos.

    public void gerarRelatórios(int tipo){}//Gerar relatórios com o GeradorDeRelatorio e passar pro arquivo com o GerenteDeArquivos.

    public void carregar(){}//Inicializar dados a partir de informações de arquivos.
    
}

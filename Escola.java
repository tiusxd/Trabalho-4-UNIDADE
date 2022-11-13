import java.util.HashMap;

public class Escola{
    public HashMap<Integer,Docente> docentes;
    public HashMap<Integer,Disciplina> disciplinas;
    public HashMap<Integer,Aluno> alunos;
    public HashMap<Integer,Turma> turmas;;
    private GerenteDeArquivo ga;

    //Metódos
    public void adicionarAluno(){}

    public void removerAluno(){}

    public void adicionarDocente(){}

    public void removerDocente(){}

    public void adicionarDisciplina(){}

    public void removerDisciplina(){}

    public void adicionarTurma(){}

    public void removerTurma(){}

    //Os métodos abaixo estão retornando null enquanto não são devidamente implementados, pra não dar erro no java

    public String mapearDocentes(){return null;} //Retorna o nome dos docentes e seus códigos.

    public String mapearDisciplinas(){return null;}//Retorna o nome das disciplinas e seus códigos.

    public String mapearAlunos(){return null;}//Retorna o nome dos alunos e seus códigos.

    public String mapearTurmas(){return null;}//Retorna o nome das turmas e seus códigos.

    public void editarDocente(){}//Permite mudar informações de um docente, incluindo disciplinas.

    public void editarDisciplina(){}//Permite mudar informações de uma disciplina, incluindo docentes, alunos e notas. 
    //Não deixar disciplina ficar sem docente. Não deixar adicionar aluno de ano errado ser cadastrado.

    public void editarAluno(){}//Permite mudar informações de um aluno, incluindo turmas.

    public void editarTurma(){}//Permite mudar informações de um docente, incluindo alunos.

    public void gerarRelatórios(int tipo){}//Gerar relatórios com o GeradorDeRelatorio e passar pro arquivo com o GerenteDeArquivos.

    public void carregar(){}//Inicializar dados a partir de informações de arquivos.
    
}

import java.util.ArrayList;
import java.util.HashMap;

public class Disciplina extends Entidade{
    
    private ArrayList<Docente> docentes;
    private HashMap<Aluno,Float[]> notas;
    public HashMap<Aluno, Float[]> getNotas() {
        return notas;
    }

    private int ano;
    
    public Disciplina() {
    }

    public Disciplina(String base) {
        super(base);
    }

    public void editarNotas(Escola escola){
        //Presume-se q a UI n vai deixar pegar algo q n existe
        System.out.println("Qual aluno editar? Escolha entre os disponíveis:\n"+mapearAlunos());
        Aluno aluno = escola.alunos.get(Util.lerInteger());
        float nota;
        int unidade;
        while(true){
            System.out.println("Tem ctz q quer editar as notas de "+aluno.getNome()+" ? 1-ss");
            if (Util.lerInteger()!=1)
                break;
            System.out.println("Qual unidade? 1-4");
            unidade = Util.lerInteger();
            System.out.println("Unidade: "+unidade+"\nCtz? 1 - ss");
            if(Util.lerInteger()!=1)
                continue;
            System.out.println("Qual a nota? 0-10");
            nota = Util.lerFloat();
            if (nota<0)
                nota = 0f;
            else if (nota>10)
                nota = 10f;
            System.out.println("A nota será: " + nota+" para a unidade: "+unidade+"\nCtz? 1 - ss");
            if(Util.lerInteger()!=1)
                continue;
                var n = notas.get(aluno);
                n[unidade-1] = nota;
                n = aluno.getNotas().get(getCodigo());
                n[unidade-1] = nota;
            System.out.println("1 - Sair 2 - Continuar");
            if (Util.lerInteger() == 1)
                break;
            continue;
        }
    }
    public boolean adicionarAluno(Aluno aluno){
        if (notas.containsKey(aluno))
            return false;
        notas.put(aluno, new Float[4]);
        aluno.getNotas().put(getCodigo(), new Float[4]);
        return true;
    }

    public boolean removerAluno(Aluno aluno){
        if (!notas.containsKey(aluno))
            return false;
        notas.remove(aluno);
        aluno.getNotas().remove(getCodigo());
        return true;
    }

    public boolean adicionarDocente(Docente docente){
        if (docentes.contains(docente))
            return false;
        docentes.add(docente);
        return true;
    }

    public boolean removerDocente(Docente docente){
        if (!docentes.contains(docente))
            return false;
        docentes.remove(docente);
        return true;
    }

    public String mapearDocentes(){
        String toReturn = "";
        for (Docente docente : docentes) {
            toReturn = toReturn + "Código: "+docente.getCodigo()+" Nome: " + docente.getNome();
        }

        return toReturn;
    }

    public String mapearAlunos(){
        String toReturn = "";
        for (Aluno aluno : notas.keySet()) {
            toReturn = toReturn + "Código: "+aluno.getCodigo()+" Nome: " + aluno.getNome();
        }

        return toReturn;
    }

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
    
    public int getDocentesSize(){
        return docentes.size();
    }
}

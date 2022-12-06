import java.util.LinkedHashMap;
import java.util.Map;

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

    public String mapearDocentes(){
        String toReturn = "";
        for (Map.Entry<Integer, Docente> pair:docentes.entrySet()){
            toReturn = toReturn + pair.getKey() + " - " +pair.getValue().getNome() + "\n"; 
        } 
        return toReturn;
    } //Retorna o nome dos docentes e seus códigos.

    public String mapearDisciplinas(){        
        String toReturn = "";
        for (Map.Entry<Integer, Disciplina> pair:disciplinas.entrySet()){
            toReturn = toReturn + pair.getKey() + " - " +pair.getValue().getNome() + "\n"; 
        } 
        return toReturn;
    }//Retorna o nome das disciplinas e seus códigos.

    public String mapearAlunos(){
        String toReturn = "";
        for (Map.Entry<Integer, Aluno> pair:alunos.entrySet()){
            toReturn = toReturn + pair.getKey() + " - " +pair.getValue().getNome() + "\n"; 
        } 
        return toReturn;
    }//Retorna o nome dos alunos e seus códigos.

    public String mapearTurmas(){
        String toReturn = "";
        for (Map.Entry<Integer, Turma> pair:turmas.entrySet()){
            toReturn = toReturn + pair.getKey() + " - " +pair.getValue().getNome() + "\n"; 
        } 
        return toReturn;
    }//Retorna o nome das turmas e seus códigos.

    public void editarDocente(int codigo) throws NoSuchKeyException{
        if (!docentes.containsKey(codigo))
            throw new NoSuchKeyException();
        Docente d;
        System.out.println("1 - Nome");
        switch(Util.lerInteger()){
            case 1:
                d = docentes.get(codigo);
                System.out.println("Nome atual: " + d.getNome());
                System.out.println("Qual o novo nome?");
                String buffer = Util.lerString();
                System.out.println("O novo nome será: " + buffer + " ctz? 1 - SS");
                if(Util.lerInteger() == 1){
                    d.setNome(buffer);
                    System.out.println("Nome mudado com sucesso.");
                } else {
                    return;
                }
                break;
            default:
                System.out.println("Digite uma opção valida");
        }
        //int key = docentes.get(codigo).getCodigo();
    }//Permite mudar informações de um docente, incluindo disciplinas.

    public void editarDisciplina(int codigo) throws NoSuchKeyException{
        if (!disciplinas.containsKey(codigo))
            throw new NoSuchKeyException();
        System.out.println("1 - Nome, 2 - Docentes, 3 - Alunos, 4 - Notas, 5 - Ano");
        Disciplina d = disciplinas.get(codigo);
        int selector;
        switch(Util.lerInteger()){
            case 1:
                System.out.println("Nome atual: " + d.getNome());
                System.out.println("Qual o novo nome?");
                String buffer = Util.lerString();
                System.out.println("O novo nome será: " + buffer + " ctz? 1 - SS");
                if(Util.lerInteger() == 1){
                    d.setNome(buffer);
                    System.out.println("Nome mudado com sucesso.");
                } else {
                    return;
                }
                break;
            case 2: 
                System.out.println("1 - Add, 2 - Remove");
                selector = Util.lerInteger();
                if (selector == 1){
                    //Supoe-se q a UI não vai deixar o usuario selecionar algo inexistente. Se UI não for feita,
                    //implementar medidas de segurança
                    System.out.println("Escolha um docente entre os disponíveis:");
                    System.out.println(mapearDocentes());
                    Integer toAdd = Util.lerInteger();
                    if (!d.adicionarDocente(docentes.get(toAdd))){
                        System.out.println("Esse docente já ta nessa disciplina");
                    } else {
                        docentes.get(toAdd).addDisciplina(d);
                        System.out.println("Feito");
                    }

                } else {
                    if (d.getDocentesSize()==1){
                        System.out.println("Uma disciplina n pode ficar sem docentes");
                        return;
                    } else {
                        System.out.println("Escolha:");
                        System.out.println(d.mapearDocentes());
                        Integer toRemove = Util.lerInteger();
                        if(!d.removerDocente(docentes.get(toRemove))){
                            System.out.println("Esse docente não tá nessa disciplina");
                        }else {
                            docentes.get(toRemove).removeDisciplina(d);
                            System.out.println("Feito");
                        }
                    }
                }
                break;
            case 3:
            System.out.println("1 - Add, 2 - Remove");
                selector = Util.lerInteger();
                if (selector == 1){
                    //Supoe-se q a UI não vai deixar o usuario selecionar algo inexistente. Se UI não for feita,
                    //implementar medidas de segurança
                    System.out.println("Escolha um Aluno entre os disponíveis:");
                    System.out.println(mapearAlunos());
                    Integer toAdd = Util.lerInteger();
                    if (!d.adicionarAluno(alunos.get(toAdd))){
                        System.out.println("Esse aluno já ta nessa disciplina");
                    } else {
                        System.out.println("Feito");
                    }
                    //TODO adicionar a possibilidade de adicionar a turma toda de vez.
                } else {
                    System.out.println("Escolha:");
                    System.out.println(d.mapearAlunos());
                    Integer toRemove = Util.lerInteger();
                    if(!d.removerAluno(alunos.get(toRemove))){
                        System.out.println("Esse aluno não tá nessa disciplina");
                    }else {
                        System.out.println("Feito");
                    }
                    
                }
                break;
            case 4:
                d.editarNotas(this);
                break;
            default:
                System.out.println("Digite uma opção valida");
                break;
        }
    }//Permite mudar informações de uma disciplina, incluindo docentes, alunos e notas. 
    //Não deixar disciplina ficar sem docente. Não deixar adicionar aluno de ano errado ser cadastrado.

    public void editarAluno(int codigo) throws NoSuchKeyException{
        if (!alunos.containsKey(codigo))
            throw new NoSuchKeyException();
        System.out.println("1 - Nome"); //Só da pra editar nome por agr
        Aluno a;
        switch(Util.lerInteger()){
            case 1:
                a = alunos.get(codigo);
                System.out.println("Nome atual: " + a.getNome());
                System.out.println("Qual o novo nome?");
                String buffer = Util.lerString();
                System.out.println("O novo nome será: " + buffer + " ctz? 1 - SS");
                if(Util.lerInteger() == 1){
                    a.setNome(buffer);
                    System.out.println("Nome mudado com sucesso.");
                } else {
                    return;
                }
                break;
            default:
                System.out.println("Digite uma opção valida");
        }
    }//Permite mudar informações de um aluno.

    public void editarTurma(int codigo) throws NoSuchKeyException{
        if (!turmas.containsKey(codigo))
            throw new NoSuchKeyException();
            Turma t = turmas.get(codigo);
            System.out.println("1- Nome 2 - Alunos");
            switch(Util.lerInteger()){
                case 1:
                    t = turmas.get(codigo);
                    System.out.println("Nome atual: " + t.getNome());
                    System.out.println("Qual o novo nome?");
                    String buffer = Util.lerString();
                    System.out.println("O novo nome será: " + buffer + " ctz? 1 - SS");
                    if(Util.lerInteger() == 1){
                        t.setNome(buffer);
                        System.out.println("Nome mudado com sucesso.");
                    } else {
                        return;
                    }
                    break;
                case 2:
                System.out.println("1 - Add, 2 - Remove");
                int selector = Util.lerInteger();
                if (selector == 1){
                    //Supoe-se q a UI não vai deixar o usuario selecionar algo inexistente. Se UI não for feita,
                    //implementar medidas de segurança
                    System.out.println("Escolha um Aluno entre os disponíveis:");
                    System.out.println(mapearAlunos());
                    Integer toAdd = Util.lerInteger();
                    if (!t.adicionarAluno(alunos.get(toAdd))){
                        System.out.println("Esse aluno já ta nessa turma");
                    } else {
                        alunos.get(toAdd).setTurma(codigo);
                        System.out.println("Feito");
                    }
                    //TODO adicionar a possibilidade de adicionar a turma toda de vez.
                } else {
                    System.out.println("Escolha:");
                    System.out.println(t.mapearAlunos());
                    Integer toRemove = Util.lerInteger();
                    if(!t.removerAluno(alunos.get(toRemove))){
                        System.out.println("Esse aluno não tá nessa turma");
                    }else {
                        alunos.get(toRemove).setTurma(-99);
                        System.out.println("Feito");
                    }
                    
                }
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
    }//Permite mudar informações de um docente.

    public void gerarRelatórios(int tipo){}//Gerar relatórios com o GeradorDeRelatorio e passar pro arquivo com o GerenteDeArquivos.

    public void carregar(){
        Aluno a;
        for (String base : ga.carregarAlunos()) {
            a = new Aluno(base);
            alunos.put(a.getCodigo(), a); 
        }
        Docente doc;
        for (String base : ga.carregarDocentes()) {
            doc = new Docente(base);
            docentes.put(doc.getCodigo(), doc); 
        }
        Turma t;
        for (String base : ga.carregarTurmas()) {
            t = new Turma(base);
            turmas.put(t.getCodigo(), t); 
        }
        Disciplina dic;
        for (String base : ga.carregarDisciplinas()) {
            dic = new Disciplina(base);
            disciplinas.put(dic.getCodigo(), dic); 
        }
    }

    public void salvar(){
        ga.escrever(this);
    }
    
}   

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GerenteDeArquivo{
    public String baseAdress = "Trabalho-4-UNIDADE/src";

    public List<String> carregarAlunos(){
        Path path = FileSystems.getDefault().getPath(baseAdress+"/Dados/Alunos.txt");
        List<String> toReturn = null;
        try {
            toReturn = Files.readAllLines(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return toReturn;
    }

    public String carregarMeta(){
        Path path = FileSystems.getDefault().getPath(baseAdress+"/Dados/Meta.txt");
        String toReturn = null;
        try {
            toReturn = Files.readString(path);
            return toReturn;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return toReturn;
    }

    public List<String> carregarDocentes(){
        Path path = FileSystems.getDefault().getPath(baseAdress+"/Dados/Docentes.txt");
        List<String> toReturn = null;
        try {
            toReturn = Files.readAllLines(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return toReturn;
    }

    public List<String> carregarTurmas(){
        Path path = FileSystems.getDefault().getPath(baseAdress+"/Dados/Turmas.txt");
        List<String> toReturn = null;
        try {
            toReturn = Files.readAllLines(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return toReturn;
    }

    public List<String> carregarDisciplinas(){
        Path path = FileSystems.getDefault().getPath(baseAdress+"/Dados/Disciplinas.txt");
        List<String> toReturn = null;
        try {
            toReturn = Files.readAllLines(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return toReturn;
    }
    public void adicionarLinha(int list, String add){}// Bota a string add na lista list (códigos definidos na classe Util).

    public void removerLinha(int linha, int list){}
    
    public void adicionarRelatorio(String relatorio){}//

    public void escrever(Escola escola){
        String toWrite = "";
        FileWriter writer = null;
        for (Aluno aluno : escola.alunos.values()) {
            toWrite = toWrite + aluno.toCsv() + "\n";
        }
        
        try {
            writer = new FileWriter(baseAdress+"/Dados/Alunos.txt");
            writer.write(toWrite);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        toWrite = "";
        for ( Docente doc : escola.docentes.values()) {
            toWrite = toWrite + doc.toCsv() + "\n";
        }
        
        try {
            writer = new FileWriter(baseAdress+"/Dados/Docentes.txt");
            writer.write(toWrite);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        toWrite = "";
        for (Turma t : escola.turmas.values()) {
            toWrite = toWrite + t.toCsv() + "\n";
        }
        
        try {
            writer = new FileWriter(baseAdress+"/Dados/Turmas.txt");
            writer.write(toWrite);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        toWrite = "";
        for (Disciplina d : escola.disciplinas.values()) {
            toWrite = toWrite + d.toCsv() + "\n";
        }
        
        try {
            writer = new FileWriter(baseAdress+"/Dados/Disciplinas.txt");
            writer.write(toWrite);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        toWrite = escola.getNumeroRelatorios() + ";"+escola.maiorAluno+";"+escola.maiorDocente+";"+escola.maiorTurma+";"+escola.maiorDisciplina;
        
    } 
}

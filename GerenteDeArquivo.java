import java.util.ArrayList;

public class GerenteDeArquivo{
    public ArrayList<String> metaDados;// Proveniente do metadados.txt
    public ArrayList<String> alunos;// Proveniente do alunos.txt
    public ArrayList<String> docentes;// Proveniente do docentes.txt
    public ArrayList<String> disciplinas;// Proveniente do disciplinas.txt
    public ArrayList<String> turmas;// Proveniente do turmas.txt
    public ArrayList<String> relatorios;

    public void carregarMeta(){} // Carrega o arquivo metadados.txt e bota na lista metaDados;

    public void carregarDemais(){}// Carrega os outros arquivos e bota em suas respectivas listas.

    public void adicionarLinha(int list, String add){}// Bota a string add na lista list (códigos definidos na classe Util).

    public void removerLinha(int linha, int list){}
    
    public void adicionarRelatorio(String relatorio){}//

    public void escrever(){} //Passa as listas dele pros respectivos arquivos 
}

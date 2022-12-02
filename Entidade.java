public abstract class Entidade{
    private String nome;
    private int codigo;

    public Entidade(){

    	System.out.println("Nome: ");
    	this.nome = Util.lerString();
    	System.out.println("Código: ");
    	this.codigo = Util.lerInteger();
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

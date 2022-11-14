
public class Main {
    public static void main(String[] args) {
        /*
         * if (primeiraInicialização){
         * inicializaçãoPura();
         * } else {
         * carregarDosArquivos();
         * }
         */
        
        Menu menu = new Menu();
		
		System.out.print("1 - Menu do aluno\n2- ...\n3 - ...\n Digite: ");
		int op = Util.lerInteger();
		
		switch(op) {
		
			case 1: menu.alunoMenu();
		
		}
    }
}

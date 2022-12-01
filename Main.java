package teste_trabalho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        /*
         * if (primeiraInicialização){
         * inicializaçãoPura();
         * } else {
         * carregarDosArquivos();
         * }
         */
        
        Menu menu = new Menu();
        
        // util dando erro, resolva e depois substitui, mas troquei pelo pelo scanner para facilitar testes
		
		System.out.print("1 - Menu do aluno\n2- ...\n3 - ...\n Digite: ");
		int op = sc.nextInt();
		
		switch(op) {
		
			case 1: menu.alunoMenu();
		
		}
    }
}

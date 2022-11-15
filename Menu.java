import java.util.ArrayList;

public class Menu{
    private Escola escola;

    //Métodos
	//Número 9 = retornar
    public boolean mainMenu(){
		/*
		 * A princípio, esses metódos funcionam via terminal para propósitos de denenvolvimento.
		 * Para conectar com interface gráfica, fazer o clique de um botão retornar um int pra ser usado aqui.
		 */
		boolean stay = true;
		while(stay){
		System.out.println("0 = Gerenciar alunos \n 1 = Gerenciar docentes \n 2 = Gerenciar disciplinas \n"+
		"3 = Gerenciar turmas \n 4 = Gerar relatórios \n 9 = Encerrar sessão\n");
		int decisor = Util.lerInteger();
			switch(decisor){
				case 0:
					alunoMenu();
					break;
				case 1:
					docenteMenu();
					break;
				case 2:
					disciplinaMenu();
					break;
				case 3:
					turmaMenu();
					break;
				case 4:
					relatorioMenu();
					break;
				case 9:
					System.out.println("Encerrando sessão");
					stay = false;
					continue;
				default:
					System.out.println("Digite um número válido válido");
					break;
			}
		}
		return false;
	}
	
    public boolean alunoMenu(){//Turma turma = new Turma();
		boolean stay = true;
		while(stay){
			System.out.println("1 - cadastrar aluno\n 2 - Editar Aluno \n3 - Remover Aluno\n 9 = Sair \n "+
			"Digite: ");
			int op = Util.lerInteger();
			switch(op) {
				case 1:
					System.out.println("Informe os dados do aluno: ");
					Aluno aluno = new Aluno();
					System.out.println("Tem ctz q quer adicionar esse aluno? 0 = sim, qqr outra coisa  = não");
					if(Util.lerInteger() == 1){
					escola.adicionarAluno(aluno);
					System.out.println("Cadastrado!");
					break;
					} else {
						System.out.println("OK. Retornando ao menu de alunos");
						continue;
					}
				case 2: 
					System.out.println("Escolha qual aluno quer editar dentre os disponíveis: ");
					System.out.println(escola.mapearAlunos());
					System.out.println("Qual quer editar? Digite o código");
					//Isso vai gerar uma exceção não-tratada se pedir pra editar um aluno inexistente
					escola.editarAluno(Util.lerInteger());
					break;
				case 3:
					System.out.println("Escolha qual aluno remover dentre os disponíveis: ");
					System.out.println(escola.mapearAlunos());
					System.out.println("Qual quer remover? Digite o código");
					int codigo = Util.lerInteger();
					System.out.println("Ctz? 1 = Sim");
					if(Util.lerInteger() == 1){
					//Isso gera uma exceção não-tratada se pedir pra remove rum que não existe
					escola.removerAluno(codigo);
					break;
					} else{
						System.out.println("OK. Retornando ao menu de alunos");
						continue;
					}
				case 9:
					stay = false;
					continue;
				default:
					System.out.println("Digite um número válido");
			}
		}
			return false;
    }
    public boolean docenteMenu(){
		boolean stay = true;
		while(stay){
			System.out.println("1 = Cadastrar docente \n2 = Editar docente \n3 = Remover docente \n 9 = Sair");
			int decisor = Util.lerInteger();
			switch(decisor){
				case 1:
					System.out.println("Informe os dados do docente:");
					Docente docente = new Docente();
					System.out.println("Ctz? 1 = Sim");
					if(Util.lerInteger() == 1){
						escola.adicionarDocente(docente);
						System.out.println("Cadastrado!");
						break;
					} else {
						System.out.println("OK. Retornando ao menu anterior");
						continue;
					}
				case 2:
					System.out.println("Escolha qual Docente editar dentre os disponíveis:");
				    System.out.println(escola.mapearDocentes());
					System.out.println("Digite o código: ");
					//Isso gera uma exceção não-tratada
					escola.editarDocente(Util.lerInteger());
					break;
				case 3:
					System.out.println("Escolha qual Docente remover dentre os disponíveis:");
					System.out.println(escola.mapearDocentes());
					System.out.println("Digite o código: ");
					int codigo = Util.lerInteger();
					System.out.println("Ctz? 1 = Sim");
					if(Util.lerInteger() == 1){
						escola.removerDocente(codigo);
						break;
					} else {
						System.out.println("OK. Retornando ao menu anterior");
						continue;
					}
				case 9:
					stay = false;
					continue;
				default:
					System.out.println("Digite um número válido");
					break;
			}
		}
		return false;
	}
    public boolean disciplinaMenu(){
		boolean stay = true;
		while(stay){
			System.out.println("1 = Cadastrar Disciplina \n2 = Editar Disciplina \n3 = Remover Disciplina \n 9 = Sair");
			int decisor = Util.lerInteger();
			switch(decisor){
				case 1:
					System.out.println("Informe os dados da Disciplina:");
					Disciplina d = new Disciplina();
					System.out.println("Ctz? 1 = Sim");
					if(Util.lerInteger() == 1){
						escola.adicionarDisciplina(d);
						System.out.println("Cadastrado!");
						break;
					} else {
						System.out.println("OK. Retornando ao menu anterior");
						continue;
					}
				case 2:
					System.out.println("Escolha qual Disciplina editar dentre as disponíveis:");
				    System.out.println(escola.mapearDisciplinas());
					System.out.println("Digite o código: ");
					//Isso gera uma exceção não-tratada
					escola.editarDisciplina(Util.lerInteger());
					break;
				case 3:
					System.out.println("Escolha qual remover dentre os disponíveis:");
					System.out.println(escola.mapearDisciplinas());
					System.out.println("Digite o código: ");
					int codigo = Util.lerInteger();
					System.out.println("Ctz? 1 = Sim");
					if(Util.lerInteger() == 1){
						escola.removerDisciplina(codigo);
						break;
					} else {
						System.out.println("OK. Retornando ao menu anterior");
						continue;
					}
				case 9:
					stay = false;
					continue;
				default:
					System.out.println("Digite um número válido");
					break;
			}
		}
		return false;
	}
    public boolean turmaMenu(){
		boolean stay = true;
		while(stay){
			System.out.println("1 = Cadastrar Turma \n 2 = Editar Turma \n 3 = Remover \n 9 = Sair");
			int decisor = Util.lerInteger();
			switch(decisor){
				case 1:
					System.out.println("Informe os dados da Turma:");
					Turma t = new Turma();
					System.out.println("Ctz? 1 = Sim");
					if(Util.lerInteger() == 1){
						escola.adicionarTurma(t);
						System.out.println("Cadastrado!");
						break;
					} else {
						System.out.println("OK. Retornando ao menu anterior");
						continue;
					}
				case 2:
					System.out.println("Escolha qual editar dentre os disponíveis:");
				    System.out.println(escola.mapearTurmas());
					System.out.println("Digite o código: ");
					//Isso gera uma exceção não-tratada
					escola.editarTurma(Util.lerInteger());
					break;
				case 3:
					System.out.println("Escolha qual remover dentre os disponíveis:");
					System.out.println(escola.mapearTurmas());
					System.out.println("Digite o código: ");
					int codigo = Util.lerInteger();
					System.out.println("Ctz? 1 = Sim");
					if(Util.lerInteger() == 1){
						escola.removerTurma(codigo);
						break;
					} else {
						System.out.println("OK. Retornando ao menu anterior");
						continue;
					}
				case 9:
					stay = false;
					continue;
				default:
					System.out.println("Digite um número válido");
					break;
			}
		}	
		return false;
	}
    public boolean relatorioMenu(){return false;}

}

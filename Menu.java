public class Menu{
    private Escola escola;

    //Métodos
    public boolean mainMenu(){return false;}
    public boolean alunoMenu(){//Turma turma = new Turma();
			System.out.print("1 - cadastrar aluno\n3 - Mostrar turma\n Digite: ");
			int op = Util.lerInteger();
			switch(op) {
				case 1:
					Aluno aluno = new Aluno();
					ArrayList<Aluno> a = new ArrayList<Aluno>();
					System.out.println("Cadastrado!");
					break;
				case 2: 
			}
			return false;
    }
    public boolean docenteMenu(){return false;}
    public boolean disciplinaMenu(){return false;}
    public boolean turmaMenu(){return false;}
    public boolean relatorioMenu(){return false;}

}

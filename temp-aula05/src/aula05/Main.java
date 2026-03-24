package aula05;

public class Main {

	public static void main(String[] args) {

		Aluno a = new Aluno ("Vitor", 18);
		
		a.setIdade(20);

		System.out.println(a.getIdade());

		a.exibeAuno();
	}

}

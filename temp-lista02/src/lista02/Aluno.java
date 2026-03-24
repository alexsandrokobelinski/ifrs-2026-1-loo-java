package lista02;

public class Aluno {

	String nome;
	int matricula;
	double notaSemestre;

	boolean verificarAprovacao(double nota) {

		if (nota >= 7) {
			return true;
		} else {
			return false;
		}
	}
}

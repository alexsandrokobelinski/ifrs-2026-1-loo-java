package exercicio01;

import java.util.Scanner;

public class UrnaEletronica {


	public static void exibirMenu() {

		System.out.println("*** Urna Eletrônica *** ");
		System.out.println("Cadidatos: ");
		System.out.println("13 - Polvo | 22 - Biroliro | 12 - Giro Comes");
	}

	
	public static void votar(int idCandidato) {

		String candidato;

		switch (idCandidato) {
		case 13:
			candidato = "Polvo";
			break;
		case 22:
			candidato = "Biroliro";
			break;
		case 12:
			candidato = "Giro Comes";
			break;
		default:
			candidato = "Voto Nulo / Branco";
			break;
		}
		System.out.println ("Você votou em: " + candidato);
	
	}
	
	public static void main(String[] args) {
		
		exibirMenu();
		
		System.out.println("Informe o código do candidato: ");
		Scanner teclado = new Scanner(System.in);
		int idCandidato = teclado.nextInt();
		teclado.close();
		
		votar(idCandidato);
	}

}

package zeroUm;


public class SistemaEleitoral {

	public static void main(String[] args) {
		int codigoVoto = 1;
		String candidato;
		
		switch (codigoVoto) {
		case 1:
			candidato = "Ada Lovelace";
			break;
		case 2:
			candidato = "Alan Turing";
			break;
		case 3:
			candidato = "Grace Hoper";
			break;
		default:
			candidato = "Voto Nulo / Branco";
			break;
		}
		
		System.out.println ("Resultado: " + candidato);

	}

}

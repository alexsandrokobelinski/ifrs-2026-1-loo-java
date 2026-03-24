package exercicio01;

public class Calculadora {

	public static int somar(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}

	public static int multiplicar(int n1, int n2) {
		int resultado = n1 * n2;
		return resultado;
	}

	public static void imprimirMensagem(String msg) {
		System.out.println("Mensagem do Sistema: " + msg);
	}

	public static void main(String[] args) {
		int soma = somar(5, 10);
		int produto = multiplicar(5, 10);

		imprimirMensagem("O total somado é " + soma);
		imprimirMensagem("O total multiplicado é " + produto);
	}

}

package lista01;

import java.util.Scanner;

public class SequenciaDeFibonacci {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int a = 0;
		int b = 1;
		int cont = 0;

		System.out.println("Digite um número inteiro: ");
		int n = teclado.nextInt();

		while (cont < n) {
			System.out.printf("%d", a);
			if (cont < n - 1) {
				System.out.printf(", ");
			}
			int prox = a + b;
			a = b;
			b = prox;
			cont++;
		}
		teclado.close();
	}
}

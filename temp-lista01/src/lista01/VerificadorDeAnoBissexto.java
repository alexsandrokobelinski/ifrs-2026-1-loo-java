package lista01;

import java.util.Scanner;

public class VerificadorDeAnoBissexto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um valor para ANO: ");

		int ano = teclado.nextInt();

		if (ano % 4 == 0) {
			System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}

		teclado.close();
	}

}

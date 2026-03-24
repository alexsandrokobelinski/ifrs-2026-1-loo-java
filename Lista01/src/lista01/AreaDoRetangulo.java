package lista01;

import java.util.Scanner;

public class AreaDoRetangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("*** Área do Retângulo *** ");

		System.out.println("Informe o valor inteiro para base: ");
		int base = teclado.nextInt();

		System.out.println("Informe o valor inteiro para altura: ");
		int altura = teclado.nextInt();

		System.out.println ("Área do Retângulo = " + base * altura);

		teclado.close();
	};		
}
package exercicio01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("*** Área do Retângulo *** ");

		System.out.println("Informe o valor inteiro para base: ");
		double base = teclado.nextDouble();

		System.out.println("Informe o valor inteiro para altura: ");
		double altura = teclado.nextDouble();
		
		double area = base * altura;

		System.out.println ("Área do Retângulo = " + area);

		System.out.printf ("Área do Retângulo =  %.2f", area);

		teclado.close();
	};		
}

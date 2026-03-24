package lista01;

import java.util.Scanner;

public class ConversorDeMoedas {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
		
		System.out.println("*** Conversor de Moedas *** ");

		System.out.println("Informe o valor em reais R$: ");
		double valorReal = teclado.nextDouble();

		System.out.println("Informe a cotação do dólar U$ (Ex: 5,10): ");
		double cotacaoDolar = teclado.nextDouble();

		if (cotacaoDolar == 0) {
		    System.out.println("Erro: Valor não pode ser igual a zero.");	
		} else {
			System.out.printf(
						"Valor R$ %.2f em dólar = %.2f%n",
						valorReal,
						valorReal / cotacaoDolar
					);
		}

		teclado.close();
	};		
}
package zeroUm;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {

//		double nota01 = 10.5;
//		double nota02 = 22.8;
//		double media = (nota01 + nota02)/2;
//		System.out.printf("Média = %.2f ", media);

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Bem vindo," + nome);
		System.out.println("Qual a sua idade? ");
		int idade = teclado.nextInt();
		System.out.println(nome + " você tem " + idade + " anos.");

		if (idade >= 18) {
			System.out.println("Pode entrar!");
		} else {
			System.out.println("Não pode entrar!");
		}

		teclado.close();

	}

}

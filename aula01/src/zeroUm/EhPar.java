package zeroUm;

import java.util.Scanner;

public class EhPar {

	public static void main(String[] args) {

		//cria a variável para abrir opção de captura de caracter em tela
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 1 e 10 ");
		
		//captura um número inteiro 
		int inteiro = teclado.nextInt();
		
		
		System.out.println("Tabuada de " + inteiro);
		for (int i =1 ; i <=10 ; i++) {
			System.out.println(inteiro + " x " + i + " = " + inteiro *i);
			
		};

		//fecha a variável de captura de caracter
		teclado.close();


	}

}

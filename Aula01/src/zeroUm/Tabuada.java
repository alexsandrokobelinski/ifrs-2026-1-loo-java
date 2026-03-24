package zeroUm;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro de 1 a 10: ");
		//captura um número inteiro 
		int inteiro = teclado.nextInt();
		
		
		System.out.println("Tabuada de %d" + inteiro);
		for (int i =1 ; i <=10 ; i++) {
			System.out.println("%d " + inteiro + " x %d " + i + " = %d" + inteiro *i);
		};		

		teclado.close();


	}

}

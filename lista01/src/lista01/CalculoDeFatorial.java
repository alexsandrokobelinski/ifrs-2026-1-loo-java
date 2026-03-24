package lista01;

import java.util.Scanner;

public class CalculoDeFatorial {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");

		//captura um número inteiro 
		int inteiro = teclado.nextInt();
		int fatorial = 1;
		String s = "";
		
		for (int i = inteiro ; i > 0 ; i--) {
			
			fatorial *= i;
			
			s += i;
			
			if (i > 1) {
				s += "*";
			} 
			
		};		
		System.out.printf("Fatorial de " + inteiro + " é " + fatorial + " (" + s + ")"  );

		teclado.close();


	}
}

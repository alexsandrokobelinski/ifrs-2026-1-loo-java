package lista01;

import java.util.Scanner;

public class AnalisadorDeNumeros {

	public static void main(String[] args) {
		
		int qtde = 0;
		int soma = 0;
		
		Scanner teclado = new Scanner(System.in);

	    System.out.println("Informe um valor inteiro: ");
		
		
		int valor = 1;

		while (valor != 0) {
		    
			valor = teclado.nextInt();
			if (valor !=0){
		    qtde++; 
		    soma += valor;
			}
		}
		
		System.out.println ("Quantidade de valores informados = " + qtde);
		System.out.println ("Soma dos valores informados = " + soma);

		teclado.close();
	};
}
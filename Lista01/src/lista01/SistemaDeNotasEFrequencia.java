package lista01;

import java.util.Scanner;

public class SistemaDeNotasEFrequencia {

	public static void main(String[] args) {
        
	Scanner teclado = new Scanner(System.in);

	System.out.println("Informe a nota (Ex: 7,5): ");
	double nota = teclado.nextDouble();

	System.out.println("Informe a frequência (Ex: 80): ");
	double frequencia = teclado.nextDouble();

	if(nota >= 7 && frequencia >= 75) {
		System.out.println("Você foi aprovado!");
	} else {
		System.out.println("Você foi reprovado.");
	}

	teclado.close();
    }
}
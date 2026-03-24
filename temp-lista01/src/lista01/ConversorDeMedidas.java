package lista01;

import java.util.Scanner;

public class ConversorDeMedidas {

    public static double converterParaCentimetros(double m) {
        return m * 100;
    }

    public static double converterParaQuilometros(double m) {
        return m / 1000;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Conversor de Medidas ---");
        System.out.print("Digite o valor em metros: ");
        double metros = teclado.nextDouble();

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Para Centímetros (cm)");
        System.out.println("2 - Para Quilômetros (km)");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            double resultado = converterParaCentimetros(metros);
            System.out.println(metros + " metros = " + resultado + " cm");
        } else if (opcao == 2) {
            double resultado = converterParaQuilometros(metros);
            System.out.println(metros + " metros = " + resultado + " km");
        } else {
            System.out.println("Opção inválida.");
        }

        teclado.close();
    }

}
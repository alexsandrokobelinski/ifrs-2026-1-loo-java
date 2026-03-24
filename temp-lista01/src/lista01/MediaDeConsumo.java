package lista01;

import java.util.Scanner;

public class MediaDeConsumo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Média de Consumo *** ");

        System.out.println("Informe a distância total percorrida em km: ");
        double valorDistancia = teclado.nextDouble();

        System.out.println("Informe a quantidade de combustível gasto: ");
        double combustivelGasto = teclado.nextDouble();

        if (combustivelGasto <= 0) {
            System.out.println("Erro: Valor não pode ser igual a zero ou negativo.");
        } else {
            System.out.printf(
                "%.2f km percorridos com %.2f litros resulta em consumo médio de %.2f km/l%n",
                valorDistancia,
                combustivelGasto,
                valorDistancia / combustivelGasto
            );
        }

        teclado.close();
    }
}
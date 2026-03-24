package lista01;

import java.util.Scanner;

public class GestaoDeEstoque {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int estoque = 10; 
        System.out.println("--- Gestão de Estoque ---");
        System.out.println("Estoque inicial: " + estoque + " unidades.");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Cliente " + i + " - Digite a quantidade para venda: ");
            int venda = teclado.nextInt();

            if (venda <= estoque) {
                estoque -= venda; 
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Estoque Insuficiente! (Saldo atual: " + estoque + ")");
            }
            
            if (estoque == 0) {
                System.out.println("O estoque acabou!");
                break;
            }
        }

        System.out.println("-----------------------");
        System.out.println("Estoque final: " + estoque + " unidades.");

        teclado.close();
    }
}
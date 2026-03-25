package exercicio01;

import exercicio02.IoT;

public class Main {

	public static void main(String[] args) {
		Lampada lampada = new Lampada("Lâmpada Inteligente");
		

		System.out.println("*** Estado inicial da Lâmpada ***");
		lampada.exibirLampada();
		
		
		System.out.println("--- Lâmpada ON ---");
		lampada.ligar();
		lampada.exibirLampada();

		
		System.out.println("--- Lâmpada OFF ---");
		lampada.desligar();
		lampada.exibirLampada();
		
		
		System.out.println("--- Tentativa de brilho para 150 ---");
		lampada.setBrilho(150);
		lampada.exibirLampada();

		System.out.println("--- Tentativa de brilho para -12 ---");
		lampada.setBrilho(-12);
		lampada.exibirLampada();
		
		
		
		System.out.println("*** Estado inicial do IoT ***");
		IoT iot = new IoT ("Câmera" , 220);
		iot.exibirIoT();
		
		System.out.println("*** Consultando consumo atual do IoT ***");
		iot.sondarConsumo();
		iot.exibirIoT();
		
		
		
		

	}
}

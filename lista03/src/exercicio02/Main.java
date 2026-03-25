package exercicio02;

import exercicio02.IoT;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("*** Estado inicial do IoT ***");
		IoT iot = new IoT ("Câmera" , 220);
		iot.exibirIoT();
		
		System.out.println("*** Consultando consumo atual do IoT ***");
		iot.sondarConsumo();
		iot.exibirIoT();
		
		
		
		

	}
}

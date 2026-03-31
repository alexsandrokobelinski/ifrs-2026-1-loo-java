package composicao;

public class Carro {
	
	private Motor motor;
	private String marca;

	public Carro(String marca, String modeloMotor) {
		this.motor = new Motor (modeloMotor);
		this.marca = marca;
	}
	
	public void ligar () {
		System.out.println("Ligando o carro...");
		this.motor.combustao();
		System.out.println("Vrum vrum vrum");
	}
	

}

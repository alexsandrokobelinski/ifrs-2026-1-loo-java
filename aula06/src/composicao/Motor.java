package composicao;

public class Motor {
	private String modelo;

	public Motor(String modelo) {
		this.modelo = modelo;
	}
	
	public void combustao () {
		System.out.println("Motor em combustão...");
	}

}

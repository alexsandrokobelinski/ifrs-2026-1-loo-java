package exercicio01;

public class Lampada {
	/*
	 * Questão 1: Sistema de Automação Uma empresa de automação residencial está
	 * desenvolvendo um aplicativo para controlar dispositivos inteligentes dentro
	 * de uma casa. Um dos primeiros dispositivos a ser implementado é uma Lâmpada
	 * Inteligente (Smart Bulb), que permite controlar o brilho e o estado
	 * (ligada/desligada). Durante o desenvolvimento, surgiu a necessidade de
	 * garantir que os dados da lâmpada sejam protegidos contra alterações indevidas
	 * e que os valores utilizados façam sentido dentro do funcionamento do
	 * dispositivo.
	 * 
	 * 
	 * Atributos Privados: marca (String), brilho (int) e ligada (boolean).
	 * Construtor: Deve receber a marca. O brilho deve iniciar em 50 e ligada como
	 * false. Encapsulamento: A marca não pode ser alterada após a criação (somente
	 * Getter). O atributo ligada não deve ter Setter. Crie os métodos ligar() e
	 * desligar() para alterar esse estado. O brilho deve ter Getter e Setter.
	 * Validação: No Setter do brilho, garanta que o valor esteja sempre entre 0 e
	 * 100. Se o usuário tentar passar 150, o brilho deve ser travado em 100. Se
	 * passar um valor negativo, trave em 0.
	 */
	private String marca;
	private int brilho;
	private boolean ligada;

	public Lampada(String marca) {
		this.marca = marca;
		this.brilho = 50;
		this.ligada = false;
	}

	public String getMarca() {
		return marca;
	}

//	public void setMarca(String marca) {
//		this.marca = marca;
//	}

	public int getBrilho() {
		return brilho;
	}

	public void setBrilho(int brilho) {
		if (brilho < 0) {
			this.brilho = 0;
		} else if (brilho > 100) {
			this.brilho = 100;
		} else {
			this.brilho = brilho;
		}

	}

	public boolean isLigada() {
		return ligada;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = false;
	}

//	public void setLigada(boolean ligada) {
//		this.ligada = ligada;
//	}
	public void exibirLampada ()	{		
		System.out.println("Lâmpada de marca " + this.marca);
		System.out.println("Brilho " + this.brilho);
		if (this.ligada) {
			System.out.println("Lâmpada está acesa!");
		} else System.out.println("Lâmpada está desligada!");

}

}

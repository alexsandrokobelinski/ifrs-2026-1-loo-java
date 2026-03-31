package associacao;

public class Pedido {
	
	//Atributos da classe
	private Cliente cliente;

	//Classe Constructor
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

}

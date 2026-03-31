package associacao;

public class Main {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Ian");
		Pedido p = new Pedido (c);
		
		System.out.println(p.getCliente().getNome());

	}

}

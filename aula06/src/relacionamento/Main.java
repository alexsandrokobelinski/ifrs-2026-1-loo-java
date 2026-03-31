package relacionamento;

public class Main {

	public static void main(String[] args) {

		Relatorio r = new Relatorio ();
		
		Impressora i = new Impressora ();
		
		r.gerar(i);
		

	}

}

package animais;

public class Coruja {

	String nome;
	double peso;

	void chirriar() {
		System.out.println("Pruul-pruul!");
	}

	void comer(double quantidade) {
		peso += quantidade;

		System.out.print(nome + " comeu " + quantidade);
		System.out.println("Seu novo peso é: " + peso);
	}

	void voar(double tempo) {

		System.out.println(nome + " voou por: " + tempo);
	}

}

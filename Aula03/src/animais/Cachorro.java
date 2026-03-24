package animais;

public class Cachorro {

	String nome;
	double peso;

	void latir() {
		System.out.println("Au-au!");
	}

	void comer(double quantidade) {
		peso = peso + quantidade;

		System.out.print(nome + " comeu " + quantidade);
		System.out.println("Seu novo peso é: " + peso);
	}

	void cruzar (Cachorro cachorro) {
		System.out.println(nome + " cruzou com " + cachorro.nome);
	}
	
	void correrAtrasCoruja (Coruja coruja) {
		System.out.println(" correndo atrás de " + coruja.nome);
	}
	
	
}

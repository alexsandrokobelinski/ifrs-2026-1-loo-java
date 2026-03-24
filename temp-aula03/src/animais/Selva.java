package animais;

public class Selva {

	public static void main(String[] args) {

		
		Cachorro cachorro = new Cachorro();
		
		cachorro.nome = "Scooby";
		cachorro.peso = 10;
		
		cachorro.latir();
		
		cachorro.comer(5);
		
		Cachorro bob = new Cachorro ();
		bob.nome = "Bob";
		bob.peso = 2;
		
		bob.comer(1);
		bob.latir();
		
		
		Coruja coruja = new Coruja ();
		coruja.nome = "Edwiges";
		coruja.peso = 2;
		coruja.comer(3);
		coruja.chirriar();
		
		bob.cruzar(cachorro);
		
		Coruja edwiges = new Coruja ();
		edwiges.nome = "Edwiges";
		edwiges.peso = 10;
		
		bob.correrAtrasCoruja (edwiges);
		
		
	}

}

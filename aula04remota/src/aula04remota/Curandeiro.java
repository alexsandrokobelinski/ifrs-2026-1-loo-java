package aula04remota;

public class Curandeiro {
    String nome;
    int poderCura;

    // ALTERAÇÃO: limite de curas
    int curasRestantes;

    public Curandeiro(String nome, int poderCura) {
        this.nome = nome;
        this.poderCura = poderCura;
        this.curasRestantes = 3; // limite inicial
    }

    public void mostrarDados() {
        System.out.println("Curandeiro: " + nome + " | Cura: " + poderCura + " | Restantes: " + curasRestantes);
    }

    public void curar(Heroi heroi) {

        // ALTERAÇÃO: verifica se ainda pode curar
        if (curasRestantes > 0) {
            System.out.println("*** CURA *** " + nome + " cura " + heroi.nome + " em " + poderCura);
            heroi.vida += poderCura;
            curasRestantes--;
        } else {
            System.out.println("*** CURA *** " + nome + " não pode mais curar!");
        }
    }
}
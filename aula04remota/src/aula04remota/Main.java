package aula04remota;

public class Main {
    public static void main(String[] args) {

        Heroi heroi = new Heroi("Auron", 100, 18);
        Monstro monstro = new Monstro("Gárgula Sombria", 120, 15);
        Curandeiro curandeiro = new Curandeiro("Lyra", 12);

        Arena arena = new Arena("Arena de Pedra", heroi, monstro, curandeiro);

        arena.mostrarStatus();

        while (!arena.batalhaTerminou()) {
            arena.executarRodada();
        }

        System.out.println("\n--- FIM DA BATALHA ---");

        if (heroi.estaVivo()) {
            System.out.println("Herói venceu!");
        } else {
            System.out.println("Monstro venceu!");
        }
    }
}
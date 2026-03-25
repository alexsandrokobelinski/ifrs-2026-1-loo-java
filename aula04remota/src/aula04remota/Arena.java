package aula04remota;

public class Arena {
    String nome;
    Heroi heroi;
    Monstro monstro;
    Curandeiro curandeiro;

    // ALTERAÇÃO: contador de rodadas
    int rodada;

    public Arena(String nome, Heroi heroi, Monstro monstro, Curandeiro curandeiro) {
        this.nome = nome;
        this.heroi = heroi;
        this.monstro = monstro;
        this.curandeiro = curandeiro;
        this.rodada = 1;
    }

    public void mostrarStatus() {
        System.out.println("\n=== STATUS DA ARENA ===");
        heroi.mostrarDados();
        monstro.mostrarDados();
        curandeiro.mostrarDados();
    }

    public void executarRodada() {

        // ALTERAÇÃO: mensagem organizada com número da rodada
        System.out.println("\n============================");
        System.out.println("RODADA " + rodada);
        System.out.println("============================");

        // ALTERAÇÃO: herói pode usar ataque especial em rodadas pares
        if (heroi.estaVivo()) {
            if (rodada % 2 == 0) {
                heroi.ataqueEspecial(monstro);
            } else {
                heroi.atacar(monstro);
            }
        }

        if (monstro.estaVivo()) {
            monstro.atacar(heroi);
        }

        if (heroi.estaVivo()) {
            curandeiro.curar(heroi);
        }

        mostrarStatus();

        rodada++; // ALTERAÇÃO: incrementa rodada
    }

    public boolean batalhaTerminou() {
        return !heroi.estaVivo() || !monstro.estaVivo();
    }
}
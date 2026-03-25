package aula04remota;

public class Monstro {
    String nome;
    int vida;
    int dano;

    public Monstro(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void mostrarDados() {
        System.out.println("Monstro: " + nome + " | Vida: " + vida + " | Dano: " + dano);
    }

    public void atacar(Heroi heroi) {

        // ALTERAÇÃO: aumenta dano quando vida está baixa
        int danoAtual = dano;
        if (vida <= 30) {
            danoAtual = dano * 2;
            System.out.println("*** FÚRIA *** " + nome + " está enfurecido! Dano aumentado!");
        }

        System.out.println("*** ATAQUE *** " + nome + " ataca " + heroi.nome + " causando " + danoAtual);
        heroi.vida -= danoAtual;

        // ALTERAÇÃO: evita vida negativa
        if (heroi.vida < 0) {
            heroi.vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
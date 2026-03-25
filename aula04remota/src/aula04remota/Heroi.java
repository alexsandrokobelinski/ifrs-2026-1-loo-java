package aula04remota;

public class Heroi {
    String nome;
    int vida;
    int forca;

    public Heroi(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void mostrarDados() {
        System.out.println("Herói: " + nome + " | Vida: " + vida + " | Força: " + forca);
    }

    public void atacar(Monstro monstro) {
        System.out.println("*** ATAQUE *** " + nome + " ataca " + monstro.nome);
        monstro.vida -= forca;

        // ALTERAÇÃO: evita vida negativa
        if (monstro.vida < 0) {
            monstro.vida = 0;
        }
    }

    // ALTERAÇÃO: ataque especial com dano maior
    public void ataqueEspecial(Monstro monstro) {
        int danoEspecial = forca * 2;
        System.out.println("*** ATAQUE ESPECIAL *** " + nome + " causa " + danoEspecial + " de dano!");
        monstro.vida -= danoEspecial;

        if (monstro.vida < 0) {
            monstro.vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
package lista02;

public class Computador {

    String marca;
    String processador;
    boolean estaLigado;

    void ligar() {
        estaLigado = true;
    }

    void desligar() {
        estaLigado = false;
    }

    void verificarStatus() {
        if (estaLigado) {
            System.out.println("Computador " + marca + " está pronto para uso.");
        } else {
            System.out.println("Computador " + marca + " está desligado.");
        }
    }
}
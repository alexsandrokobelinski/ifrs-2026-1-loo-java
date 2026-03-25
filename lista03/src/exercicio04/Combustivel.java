package exercicio04;

/*
 * Classe Combustivel:

A classe Combustivel deve possuir os seguintes atributos privados: tipo (String) e precoLitro (double).

Construtor: Deve receber o tipo e o precoLitro.

Validação: O preço por litro não pode ser negativo. Caso um valor inválido seja informado, ele deve ser ajustado para 0.

 * 
 */



public class Combustivel {

    private String tipo;
    private double precoLitro;

    public Combustivel(String tipo, double precoLitro) {
        this.tipo = tipo;

        // preço não pode ser negativo
        if (precoLitro < 0) {
            this.precoLitro = 0;
        } else {
            this.precoLitro = precoLitro;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }
}
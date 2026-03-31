package exercicio04;
/*
 * Classe Veiculo:

A classe Veiculo deve possuir os seguintes atributos privados: modelo (String), tanqueLitros (double) e 
combustivel (Combustivel).

Construtor: Deve receber o modelo, a capacidade do tanque em litros e um objeto do tipo Combustivel.

Encapsulamento:

O modelo deve ter apenas Getter.
O tanqueLitros deve ter Getter e Setter.
O combustivel deve ter Getter, mas sua alteração deve ser feita por meio de um método específico, e não por um Setter comum.

 * 
 */
public class Veiculo {

    private String modelo;
    private double tanqueLitros;
    private Combustivel combustivel;

    public Veiculo(String modelo, double tanqueLitros, Combustivel combustivel) {
        this.modelo = modelo;
        this.tanqueLitros = tanqueLitros;
        this.combustivel = combustivel;
    }

    // modelo: somente getter
    public String getModelo() {
        return modelo;
    }

    // tanque: getter e setter
    public double getTanqueLitros() {
        return tanqueLitros;
    }

    public void setTanqueLitros(double tanqueLitros) {
        this.tanqueLitros = tanqueLitros;
    }

    // combustivel: somente getter
    public Combustivel getCombustivel() {
        return combustivel;
    }

    // troca controlada (não usar setter comum)
    public void trocarCombustivel(Combustivel novoCombustivel) {

        String tipo = novoCombustivel.getTipo();

        // validação dos tipos permitidos
        if (tipo.equalsIgnoreCase("Gasolina") ||
            tipo.equalsIgnoreCase("Etanol") ||
            tipo.equalsIgnoreCase("Diesel")) {

            this.combustivel = novoCombustivel;
            System.out.println("Combustível trocado para: " + tipo);

        } else {
        	throw new IllegalArgumentException ("Erro: combustível inválido para a frota.");
        }
    }

    // cálculo do custo para encher o tanque
    public double calcularCustoTanqueCheio() {
        return tanqueLitros * combustivel.getPrecoLitro();
    }
}
package exercicio04;

public class Main {
    public static void main(String[] args) {

        // combustível válido
        Combustivel gasolina = new Combustivel("Gasolina", 5.50);

        // combustível inválido
        Combustivel agua = new Combustivel("Água", 1.00);

        // veículo inicial
        Veiculo carro = new Veiculo("Caminhão Volvo", 200, gasolina);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Combustível atual: " + carro.getCombustivel().getTipo());

        // tentativa de troca inválida
        carro.trocarCombustivel(agua);

        // troca válida
        Combustivel diesel = new Combustivel("Diesel", 6.00);
        carro.trocarCombustivel(diesel);

        // cálculo do custo
        double custo = carro.calcularCustoTanqueCheio();
        System.out.println("Custo para encher o tanque: R$ " + custo);
    }
}
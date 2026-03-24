package lista02;

public class ContaBancaria {

	String titular;
	double saldo;

	void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito realizado. Novo saldo: " + saldo);
	}

	void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado. Novo saldo: " + saldo);
		} else {
			System.out.println("Erro: saldo insuficiente.");
		}
	}
}
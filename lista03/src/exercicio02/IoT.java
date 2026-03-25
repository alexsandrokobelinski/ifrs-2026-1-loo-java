package exercicio02;

import java.util.Random;

public class IoT {

	/*
	 * Questão 2: Monitor de Consumo IoT
	 * 
	 * Em uma casa inteligente, sensores são utilizados para monitorar o consumo de
	 * energia elétrica de diferentes aparelhos. Esses sensores enviam dados
	 * constantemente para o sistema, permitindo acompanhar o gasto em tempo real.
	 * 
	 * No entanto, é necessário garantir que esses dados sejam gerados de forma
	 * controlada e que informações importantes, como o consumo atual, não sejam
	 * alteradas diretamente por quem utiliza o sistema.
	 * 
	 * Atributos Privados: nomeAparelho (String), voltagem (int) e consumoAtual
	 * (double).
	 * 
	 * Construtor: Deve receber o nomeAparelho e a voltagem.
	 * 
	 * Validação: A voltagem só pode ser 110 ou 220. Se for informado qualquer outro
	 * valor, o padrão deve ser 110.
	 * 
	 * Comportamento e Aleatoriedade:
	 * 
	 * Crie um método chamado sondarConsumo(). Este método deve usar a classe Random
	 * para gerar um novo valor para consumoAtual entre 0 e 500 (watts).
	 * 
	 * Encapsulamento: O consumoAtual deve ser somente leitura para o usuário
	 * externo (apenas Getter), pois ele só é alterado internamente pelo método de
	 * sondagem.
	 * 
	 * 
	 * Pílula de Conhecimento B: Identificadores Únicos (UUID)
	 * 
	 * Em aplicações web e sistemas distribuídos, não usamos IDs simples (1, 2, 3)
	 * para evitar que invasores descubram o próximo item da lista. Usamos o UUID
	 * (Universally Unique Identifier).
	 * 
	 * Como usar:
	 * 
	 * import java.util.UUID;
	 * 
	 * String codigoUnico = UUID.randomUUID().toString(); // Resultado:
	 * "550e8400-e29b-41d4-a716-446655440000"
	 * 
	 *	import java.util.Random;

     *	Random gerador = new Random();
	 *	int valorAleatorio = gerador.nextInt(101); // Gera um número entre 0 e 100	 * 
	 */
	private String nomeAparelho;
	private int voltagem;
	private double consumoAtual;

	public IoT(String nomeAparelho, int voltagem) {
		this.nomeAparelho = nomeAparelho;
		this.setVoltagem(voltagem);
		this.consumoAtual = 0;
	}

	public String getNomeAparelho() {
		return nomeAparelho;
	}

	public void setNomeAparelho(String nomeAparelho) {
		this.nomeAparelho = nomeAparelho;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		if (!(voltagem == 110) || !(voltagem == 220)) {
			this.voltagem = 110;
		} else {
			this.voltagem = voltagem;
		}
	}
	
	public double getConsumo() {
		return consumoAtual;
	}

	public void sondarConsumo() {
		Random gerador = new Random();
		this.consumoAtual = gerador.nextInt(501); // Gera um número entre 0 e 500
	}
	
	public void exibirIoT () {
		System.out.println("Aparelho: " + this.nomeAparelho);
		System.out.println("Voltagem: " + this.voltagem);
		System.out.println("Consumo: " + this.consumoAtual);
	}

}

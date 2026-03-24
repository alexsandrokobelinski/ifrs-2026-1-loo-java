package aula05;

import java.util.UUID;

public class Aluno {
	private String nome;
	private String matricula;
	private int mediaFinal;
	private int idade;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.matricula = UUID.randomUUID().toString();
		this.setIdade(idade);
		this.mediaFinal = 0;
	}

	public void exibeAuno () {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("idade: " + this.idade);
	}

	public void setIdade (int idade) {
		if (idade < 18 ) {
			throw new IllegalArgumentException ("Idade inválida");
			// gerando um erro de argumento inválido
		} else {
			this.idade = idade;
		}
	}

	public int getIdade() {
		return this.idade;
	}

	public String getMatricula() {
		return this.matricula;
	}

}

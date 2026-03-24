package lista02;

public class Exercicios02 {

    public static void main(String[] args) {

        // inicio execução da atividade 01 : classe Livro
        Livro livro = new Livro();
        livro.autor = "Deitel";
        livro.titulo = "Java como Programar";
        livro.paginasTotais = 1386;
        livro.exibirDados();
        // fim execução da atividade 01 : classe Livro

        // inicio execução da atividade 02 : classe Aluno
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.notaSemestre = 8;

        if (aluno.verificarAprovacao(aluno.notaSemestre)) {
            System.out.println("Aluno: " + aluno.nome + " com nota: " + aluno.notaSemestre + " está aprovado!");
        } else {
            System.out.println("Aluno: " + aluno.nome + " com nota: " + aluno.notaSemestre + " está reprovado!");
        }
        // fim execução da atividade 02 : classe Aluno


        // inicio atividade 03 : Conta Bancaria
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.saldo = 1000;

        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500);
        // fim atividade 03


        // inicio atividade 04 : Computador
        Computador pc = new Computador();
        pc.marca = "Dell";
        pc.processador = "Intel i7";

        pc.verificarStatus();
        pc.ligar();
        pc.verificarStatus();
        pc.desligar();
        pc.verificarStatus();
        // fim atividade 04


        // inicio atividade 05 : Retangulo
        Retangulo ret = new Retangulo();
        ret.base = 5;
        ret.altura = 3;

        System.out.println("Área do retângulo: " + ret.calcularArea());
        System.out.println("Perímetro do retângulo: " + ret.calcularPerimetro());
        // fim atividade 05

    } //fim main
} // fim Exercicios02
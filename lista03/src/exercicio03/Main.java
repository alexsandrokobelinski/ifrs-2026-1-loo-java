package exercicio03;

public class Main {
    public static void main(String[] args) {

        Perfil perfil = new Perfil("João", 10);
        perfil.mostrarPerfil();

        // tentativa de alterar nome (deve falhar)
        perfil.setNome("Novo Nome");

        // altera idade
        perfil.setIdade(15);
        perfil.mostrarPerfil();

        // menor de 18 restrição continua ativa
        perfil.setNome("Agora Pode?");
        perfil.mostrarPerfil();

        // maior de idade
        perfil.setIdade(20);
        perfil.setNome("Nome Adulto");
        perfil.mostrarPerfil();
    }
}
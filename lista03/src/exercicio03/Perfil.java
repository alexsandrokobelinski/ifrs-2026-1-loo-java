package exercicio03;

/*
 * import java.util.UUID;

String codigoUnico = UUID.randomUUID().toString();
// Resultado: "550e8400-e29b-41d4-a716-446655440000"
Questão 3: Perfil de Streaming

Uma plataforma de streaming está implementando um sistema de perfis de usuários, 
onde cada pessoa pode ter sua própria conta com restrições de conteúdo baseadas na idade.

Para garantir segurança e controle parental, algumas regras precisam ser aplicadas automaticamente pelo sistema, 
sem depender da ação do usuário.

Atributos Privados: idPerfil (String), nome (String), idade (int) e restricaoAtiva (boolean).

Construtor:

Deve receber nome e idade.
O idPerfil deve ser gerado automaticamente no construtor usando UUID.
 * 
 */




import java.util.UUID;

public class Perfil {

    // atributos privados 
    private String idPerfil;
    private String nome;
    private int idade;
    private boolean restricaoAtiva;

    // construtor
    public Perfil(String nome, int idade) {
        this.idPerfil = UUID.randomUUID().toString(); // geração automática do UUID
        this.nome = nome;
        this.idade = idade;

        atualizarRestricao(); // garante regra já na criação
    }

    // método interno para manter a regra centralizada
    private void atualizarRestricao() {
        this.restricaoAtiva = this.idade < 18;
    }

    public String getIdPerfil() {
        return idPerfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        // regra: menor de 12 não pode alterar nome
        if (this.idade < 12) {
            System.out.println("Erro: não é permitido alterar o nome para menores de 12 anos.");
            return;
        }

        this.nome = nome;
    }
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

        atualizarRestricao(); // regra aplicada sempre que idade muda
    }
    
    
    public boolean isRestricaoAtiva() {
        return restricaoAtiva;
    }



    // exibição
    public void mostrarPerfil() {
        System.out.println("\n   PERFIL    ");
        System.out.println("ID: " + idPerfil);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Restrição ativa: " + restricaoAtiva);
    }
}
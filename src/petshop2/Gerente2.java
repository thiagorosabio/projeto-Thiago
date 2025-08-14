package petshop2;

public class Gerente2 {
    private String nome;
    private String cpf;

    public Gerente2(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirFuncao() {
        System.out.println("Gerente: " + nome + " - Responsável pela administração do Pet Shop.");
    }
}
package petshop2;

public class Atendente2 {
    private String nome;
    private String cpf;

    public Atendente2(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirFuncao() {
        System.out.println("Atendente: " + nome + " - Responsável pelo atendimento ao cliente.");
    }
}
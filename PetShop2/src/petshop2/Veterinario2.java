package petshop2;

public class Veterinario2 {
    private String nome;
    private String cpf;

    public Veterinario2(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirFuncao() {
        System.out.println("Veterinário: " + nome + " - Responsável pelos cuidados com os animais.");
    }
}
package petshop2;

public class Tutor2 {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    public Tutor2(String nome, String telefone, String email, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
}
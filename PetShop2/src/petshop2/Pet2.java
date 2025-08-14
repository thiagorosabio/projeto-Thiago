package petshop2;

public class Pet2 {
    private String tipo;
    private String raca;
    private int idade;
    private Tutor2 tutor;

    public Pet2(String tipo, String raca, int idade, Tutor2 tutor) {
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.tutor = tutor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public Tutor2 getTutor() {
        return tutor;
    }
}
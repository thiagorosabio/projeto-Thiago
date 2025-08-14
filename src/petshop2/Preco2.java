package petshop2;

public enum Preco2 {
    BANHO("R$ 30,00"),
    TOSA("R$ 25,00"),
    BRINQUEDOS("R$ 20,00"),
    RACAO("R$ 50,00"),
    REMEDIOS("R$ 40,00");

    private String valor;

    Preco2(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
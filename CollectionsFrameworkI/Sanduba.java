public class Sanduba {
    private String descricao;
    private double preco;

    public Sanduba(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String toString() {
        return descricao + "R$" + preco;
    }
}
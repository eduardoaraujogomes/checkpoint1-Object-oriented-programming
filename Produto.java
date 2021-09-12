package Checkpoint1;

public class Produto {
    private String nome;
    private String comprimento;
    private String largura;
    private double preco;
    private int estoque;

    Produto(String nome, String comprimento, String largura, double preco, int estoque) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;
        this.estoque = estoque;

    }

    public void checkCompras() {

    }

    public void checkVendas() {

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", comprimento='" + comprimento + '\'' +
                ", largura='" + largura + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }

    public void setEstoque(int estoque) {
        this.estoque += estoque;
    }

    public int getEstoque() {
        return estoque;
    }
}

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

    // Esse método permite que se realize ajustes no estoque enquanto se realiza das vendas ou compras dos produtos.
    public void setEstoque(int estoque) {
        this.estoque += estoque;
    }

    // Método GET que auxilia na verificação do estoque.
    public int getEstoque() {
        return estoque;
    }

    // Método GET que informa o nome do produto.
    public String getNome() {
        return nome;
    }

    // Métodos GET não utilizados neste código.
    public String getComprimento() {
        return comprimento;
    }

    public String getLargura() {
        return largura;
    }

    public double getPreco() {
        return preco;
    }
}

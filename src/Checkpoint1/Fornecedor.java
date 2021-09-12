package Checkpoint1;

import java.util.ArrayList;

public class Fornecedor extends Usuario {
    private ArrayList<Produto> produtos; // Cada compra realizada ao fornecedor gera a inclusão de um ou do mesmo Objeto Produto neste atributo Array.

    Fornecedor(String nome, String cpf_cnpj, String endereco, String contato, String email) {
        super(nome, cpf_cnpj, endereco, contato, email);
        this.produtos = new ArrayList<>();
    }

    public void checkCompras() {

    }

    public void setProdutos(Produto produto) {

        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "nome=" + nome +
                ", cpf_cnpj=" + cpf_cnpj +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", email=" + email +
                ", produtos=" + produtos + '}';
    }
}

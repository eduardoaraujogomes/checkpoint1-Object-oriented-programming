package Checkpoint1;

import java.util.ArrayList;
import java.util.HashSet;

public class Consumidor extends Usuario {
    private ArrayList<Produto> produtos; // Cada venda realizada ao consumidor gera a inclusão de um ou do mesmo Objeto Produto neste atributo Array.

    Consumidor(String nome, String cpf_cnpj, String endereco, String contato, String email) {
        super(nome, cpf_cnpj, endereco, contato, email);
        this.produtos = new ArrayList<>();

    }

    Consumidor(String nome, String cpf_cnpj, String contato) {
        super(nome, cpf_cnpj, contato);
        this.produtos = new ArrayList<>();

    }

    Consumidor(String nome, String cpf_cnpj, String contato, String email) {
        super(nome, cpf_cnpj, contato, email);
        this.produtos = new ArrayList<>();

    }

    // Método que inclui produtos comprados pelo consumidor no sistema.
    public void setProdutos(Produto produto) {

        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "produtos=" + produtos +
                ", nome='" + nome + '\'' +
                ", cpf_cnpj='" + cpf_cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", contato='" + contato + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

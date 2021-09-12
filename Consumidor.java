package Checkpoint1;

import java.util.ArrayList;
import java.util.HashSet;

public class Consumidor extends Usuario {
    private HashSet produtos; // Cada venda realizada ao consumidor gera a inclusão de um ou do mesmo Objeto Produto neste atributo Array.

    Consumidor(String nome, String cpf_cnpj, String endereco, String contato, String email) {
        super(nome, cpf_cnpj, endereco, contato, email);
        this.produtos = new HashSet<>();

    }

    Consumidor(String nome, String cpf_cnpj, String contato) {
        super(nome, cpf_cnpj, contato);
        this.produtos = new HashSet<>();

    }

    Consumidor(String nome, String cpf_cnpj, String contato, String email) {
        super(nome, cpf_cnpj, contato, email);
        this.produtos = new HashSet<>();

    }

    // Método que verifica todas as vendas
    public void checkVendas() {

    }

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

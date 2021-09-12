package Checkpoint1;

import java.util.ArrayList;

public class Consumidor extends Usuario {
    private ArrayList<Produto> produtos; // Cada venda realizada ao consumidor gera a inclusão de um ou do mesmo Objeto Produto neste atributo Array.

    Consumidor(String nome, String cpf_cnpj, String endereco, String contato, String email) {
        super(nome, cpf_cnpj, endereco, contato, email);
        this.produtos = new ArrayList<Produto>();

    }

    Consumidor(String nome, String cpf_cnpj, String contato) {
        super(nome, cpf_cnpj, contato);
        this.produtos = new ArrayList<Produto>();

    }

    Consumidor(String nome, String cpf_cnpj, String contato, String email) {
        super(nome, cpf_cnpj, contato, email);
        this.produtos = new ArrayList<Produto>();

    }

    // Método que verifica todas as vendas
    public void checkVendas() {

    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}

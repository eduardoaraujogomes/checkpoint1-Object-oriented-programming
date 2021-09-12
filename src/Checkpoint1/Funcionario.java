package Checkpoint1;

import java.util.ArrayList;

public class Funcionario extends Usuario {

    private String cargo;
    private String senha;
    private int acesso;

    Funcionario(String nome, String cpf_cnpj, String endereco, String contato, String email, String cargo, String senha, int acesso) {
        super(nome, cpf_cnpj, endereco, contato, email);
        this.cargo = cargo;
        this.senha = senha;
        this.acesso = acesso;
    }

    // Subscrição dos métodos na superclasse para realizar a compra e venda dos produtos.
    @Override
    public void comprarFornecedor (Fornecedor fornecedor, Produto produto) {

        fornecedor.setProdutos(produto);


    }


    @Override
    public void venderConsumidor () {

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", senha='" + senha + '\'' +
                ", acesso=" + acesso +
                '}';
    }
}

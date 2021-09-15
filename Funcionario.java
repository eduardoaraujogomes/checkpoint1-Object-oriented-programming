package Checkpoint1;

import java.util.HashSet;

public class Funcionario extends Usuario {

    private String cargo;
    private String senha;
    private int acesso;
    private HashSet<Funcionario> funcionarios;

    Funcionario(String nome, String cpf_cnpj, String endereco, String contato, String email, String cargo, String senha, int acesso) {
        super(nome, cpf_cnpj, endereco, contato, email);
        this.cargo = cargo;
        this.senha = senha;
        this.acesso = acesso;
    }


    // Subscrição dos métodos na superclasse para realizar a compra e venda dos produtos.
    // Essas compras e vendas são realizadas pelo funcionário da empresa.
    @Override
    public void comprarFornecedor (Fornecedor fornecedor, Produto produto, int quantidade) {
        // É necessário um método para acrescenter estoque.
        // Provavelmente, será necessário criar uma parâmetro para acrescentar no Estoque.
        produto.setEstoque(quantidade);
        fornecedor.setProdutos(produto);


    }


    @Override
    public void venderConsumidor (Consumidor consumidor, Produto produto, int quantidade) {
        // método de checar Estoque antes de realizar a venda.

        if (quantidade > produto.getEstoque()) {
            System.out.println("A venda não pode ser realizada, uma vez que só tem " + produto.getEstoque() + " peças disponíveis no estoque.");
        } else {
            produto.setEstoque(-(quantidade));
            consumidor.setProdutos(produto);

        }

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

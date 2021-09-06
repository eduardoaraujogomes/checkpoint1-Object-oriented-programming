package Checkpoint1;

public class Funcionario extends Usuario {

    private String cargo;
    private String senha;
    private byte acesso;

    Funcionario(String nome, String cpf_cnpj, String endereco, String contato, String email, String cargo, String senha, byte acesso) {
        super(nome, cpf_cnpj, endereco, contato, email);
        this.cargo = cargo;
        this.senha = senha;
        this.acesso = acesso;
    }

    // Subscrição dos métodos na superclasse para realizar a compra e venda dos produtos.
    @Override
    public void comprarFornecedor () {

    }

    @Override
    public void venderConsumidor () {

    }

}

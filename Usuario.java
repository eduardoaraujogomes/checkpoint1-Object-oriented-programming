package Checkpoint1;

public abstract class Usuario {

    // Dados gerais de todos os usuarios do sistema, incluindo funcionario, cadastro de fornecedor e consumidor.
    protected String nome;
    protected String cpf_cnpj;
    protected String endereco;
    protected String contato;
    protected String email;

    Usuario (String nome, String cpf_cnpj, String endereco, String contato, String email) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.email = email;

    }

    Usuario(String nome, String cpf_cnpj, String contato) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.contato = contato;
    }

    Usuario(String nome, String cpf_cnpj, String contato, String email) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.contato = contato;
        this.email = email;
    }

    // Métodos para serem subscritos na subclasse Funcionario
    public void comprarFornecedor(Fornecedor fornecedor, Produto produto, int quantidade) {

    }

    public void venderConsumidor(Consumidor consumidor, Produto produto, int quantidade) {

    }

}

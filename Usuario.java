package Checkpoint1;

public abstract class Usuario {

    // Dados gerais de todos os usuarios do sistema, incluindo funcionario, cadastro de fornecedor e consumidor.
    private String nome;
    private String cpf_cnpj;
    private String endereco;
    private String contato;
    private String email;

    Usuario (String nome, String cpf_cnpj, String endereco, String contato, String email) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.email = email;

    }

    // Métodos para serem subscritos na subclasse Usuario
    public void comprarFornecedor() {

    }

    public void venderConsumidor() {

    }

}

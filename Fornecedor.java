package Checkpoint1;

import java.util.ArrayList;

public class Fornecedor extends Usuario {
    private ArrayList<Produto> produtos;

    Fornecedor(String nome, String cpf_cnpj, String endereco, String contato, String email) {
        super(nome, cpf_cnpj, endereco, contato, email);
    }

    public void checkCompras() {

    }

}

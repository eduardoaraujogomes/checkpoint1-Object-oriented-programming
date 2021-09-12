package Checkpoint1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Teste");

        Usuario fornecedor1 = new Fornecedor("Belenus", "123", "SP", "11 555", "belenus@belenus");

        Usuario funcionario1 = new Funcionario("Gustavo", "123", "Salvador", "123", "gustavo@geral", "Administrador", "123", 1);

        Produto produto1 = new Produto("Parafuso sextavado aço carbono rosca total", "3", "4", 1.99, 100);

        System.out.println(fornecedor1.toString());

        System.out.println(funcionario1.toString());

        System.out.println(produto1.toString());



    }

}

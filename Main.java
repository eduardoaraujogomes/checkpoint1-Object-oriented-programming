package Checkpoint1;

import java.util.Scanner;
import java.util.*;

public class Main {

    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    static ArrayList<Consumidor> consumidores = new ArrayList<>();
    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<Produto> listaProdutosVendaCompra = new ArrayList<>();

    // Abaixo estãoa s funções aplicadas na main.

    private static double calcValorTotal (int quantidade, double preco) {
        return  quantidade * preco;

    }

    private static void cadastrarFuncionario() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = input.next();

        System.out.print("Digite o endereço: ");
        String endereco = input.nextLine();
        input.nextLine();

        System.out.print("Digite o contato: ");
        String contato = input.nextLine();

        System.out.print("Digite o e-mail: ");
        String email = input.nextLine();

        System.out.print("Escolha uma senha: ");
        String senha = input.nextLine();

        System.out.print("Digite o cargo: ");
        String cargo = input.nextLine();

        System.out.print("Escolha o nível de acesso de 1 a 9: ");
        int acesso = input.nextInt();

        Funcionario funcionario = new Funcionario(nome, cpf, endereco, contato, email, senha, cargo, acesso);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");

    }

    private static void cadastrarFornecedor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = input.next();

        System.out.print("Digite o endereço: ");
        String endereco = input.nextLine();
        input.nextLine();

        System.out.print("Digite o contato: ");
        String contato = input.nextLine();

        System.out.print("Digite o e-mail: ");
        String email = input.nextLine();

        Fornecedor fornecedor = new Fornecedor(nome, cpf, endereco, contato, email);
        fornecedores.add(fornecedor);
        System.out.println("Fornecedor cadastrado com sucesso!");

    }

    private static void cadastrarConsumidor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = input.next();

        System.out.print("Digite o endereço: ");
        String endereco = input.nextLine();
        input.nextLine();

        System.out.print("Digite o contato: ");
        String contato = input.nextLine();

        System.out.print("Digite o e-mail: ");
        String email = input.nextLine();

        Consumidor consumidor = new Consumidor(nome, cpf, endereco, contato, email);

        consumidores.add(consumidor);
        System.out.println("Consumidor cadastrado com sucesso!");

    }

    private static void cadastrarProduto() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o comprimento: ");
        String comprimento = input.next();

        System.out.print("Digite a largura: ");
        String largura = input.nextLine();
        input.nextLine();

        System.out.print("Digite o preço: ");
        double preco = input.nextDouble();

        System.out.print("Digite o estoque: ");
        int estoque = input.nextInt();

        Produto produto = new Produto(nome, comprimento, largura, preco, estoque);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");

    }

    public static void realizarVenda() {

        listaConsumidor();

        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o consumidor?: ");
        int consumidorVenda = input.nextInt();

        listaProdutos();

        System.out.print("Qual é o produto?: ");
        int produtoVenda = input.nextInt();

        System.out.print("Qual a quantidade?: ");
        int quantidade = input.nextInt();

        Produto produto = Main.produtos.get(produtoVenda);
        listaProdutosVendaCompra.add(produto);

        Funcionario funcionario = Main.funcionarios.get(0);
        Consumidor consumidor = Main.consumidores.get(consumidorVenda);

        funcionario.venderConsumidor(consumidor, produto, quantidade);

        System.out.println("O valor total da venda foi de R$ " + calcValorTotal(quantidade, produto.getPreco()) + ". ");

        System.out.println("Venda realizada com sucesso!");
    }

    public static void realizarCompra() {

        listaFornecedor();

        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o fornecedor?: ");
        int fornecedorCompra = input.nextInt();

        listaProdutos();

        System.out.print("Qual é o produto?: ");
        int produtoCompra = input.nextInt();

        System.out.print("Qual a quantidade?: ");
        int quantidade = input.nextInt();

        Funcionario funcionario = Main.funcionarios.get(0);
        Fornecedor fornecedor = Main.fornecedores.get(fornecedorCompra);
        Produto produto = Main.produtos.get(produtoCompra);
        funcionario.comprarFornecedor(fornecedor, produto, quantidade);

        System.out.println("O valor total da compra foi de R$ " + calcValorTotal(quantidade, produto.getPreco()) + ". ");

        System.out.println("Compra realizada com sucesso!");
    }

    public static void verificarEstoque() {
        System.out.println("====================================ESTOQUE====================================");

        for (Produto produto : produtos) {
            System.out.println("NOME: " + produto.getNome() + " - QUANTIDADE: " + produto.getEstoque());
        }
        System.out.println("====================================ESTOQUE====================================");
    }

    public static void listaFornecedor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Gostaria de ver a lista de fornecedores? [S/N]");
        char awnser = input.next().charAt(0);
        if (awnser == 'S') {
            System.out.println("====================================FORNECEDORES====================================");
            for (Fornecedor fornecedor : fornecedores) {

                System.out.println(fornecedores.indexOf(fornecedor) + " - " + fornecedor.getNome());

            }
            System.out.println("====================================================================================");
        }

    }

    public static void listaProdutos() {
        Scanner input = new Scanner(System.in);
        System.out.print("Gostaria de ver a lista de produtos? [S/N]");
        char awnser = input.next().charAt(0);
        if (awnser == 'S') {
            System.out.println("====================================PRODUTOS========================================");
            for (Produto produto : produtos) {

                System.out.println(produtos.indexOf(produto) + " - " + produto.getNome() + " - QNTD = " + produto.getEstoque());

            }
            System.out.println("====================================================================================");
        }

    }

    public static void listaConsumidor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Gostaria de ver a lista de clientes? [S/N]");
        char awnser = input.next().charAt(0);
        if (awnser == 'S') {
            System.out.println("====================================CLIENTES========================================");
            for (Consumidor consumidor : consumidores) {

                System.out.println(consumidores.indexOf(consumidor) + " - " + consumidor.getNome());

            }
            System.out.println("====================================================================================");
        }

    }

    public static void main(String[] args) {
        boolean variable = true;

        while (variable) {

            System.out.println("=========== MENU DO SISTEMA =========== ");
            System.out.println("Digite o que deseja fazer no sistema: \n" +
                                "\t1 - Cadastro de Funcionário\n" +
                                "\t2 - Cadastro de Fornecedor\n" +
                                "\t3 - Cadastro de Cliente\n" +
                                "\t4 - Cadastrar Produto\n" +
                                "\t5 - Realizar Venda\n" +
                                "\t6 - Realizar Compra\n" +
                                "\t7 - Verificar Estoque\n" +
                                "\t9 - Sair\n");
            System.out.print("Resposta: ");
            Scanner input = new Scanner(System.in);
            int awnser = input.nextInt();

            switch (awnser) {

                case 1:
                    Main.cadastrarFuncionario();
                    break;

                case 2:
                    Main.cadastrarFornecedor();
                    break;

                case 3:
                    Main.cadastrarConsumidor();
                    break;

                case 4:
                    Main.cadastrarProduto();
                    break;

                case 5:
                    realizarVenda();
                    break;

                case 6:
                    realizarCompra();
                    break;

                case 7:
                    verificarEstoque();
                    break;

                case 8:

                case 9:
                    System.out.println("=========== PROGRAMA ENCERRADO ===========");
                    variable = false;
                    break;


                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");

            }

        }
    }

}

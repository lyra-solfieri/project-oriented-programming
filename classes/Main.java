import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nomeCliente, cpf, email, telefone;
        ArrayList<Caixa> caixa = new ArrayList<Caixa>();
        ArrayList<Estoque> estoque = new ArrayList<Estoque>();
        ArrayList<Produtos> p = new ArrayList<Produtos>();
        ArrayList<Clientes> c = new ArrayList<Clientes>();
        // Endereco endereco = new Endereco();
        Gerente gerente = new Gerente();

        boolean yes = true;

        while (yes) {
            System.out.println("\nStudio EncanARTE" + "\n1.Realizar vendas " + "\n2. Cadastrar clientes "

                    + "\n3. Acessar Estoque " + "\n4. Cancelar venda" + "\n5. Listar Cliente(s)"
                    + "\n6. Aquisição de  produtos" + "\n7 Deletar Cliente(Procurar pelo cpf) " + "\n0. Sair");

            int op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o código do produto:");

                    break;

                case 2:

                    System.out.println("Cadastrar clientes");
                    System.out.println("Dados pessoais");
                    System.out.println("*** *** ***");
                    System.out.println("Digite o nome do cliente : ");
                    nomeCliente = scan.next();
                    System.out.println("Digite o cpf do cliente : ");
                    cpf = scan.next();
                    System.out.println("Digite o email do cliente : ");
                    email = scan.next();
                    System.out.println("Digite o telefone do cliente : ");
                    telefone = scan.next();
                    System.out.println("*** *** ***");
                    System.out.println("Endereço");
                    Endereco e = new Endereco();

                    System.out.println("Digite o nome da rua : ");
                    String rua = scan.next();
                    e.setRua(rua);
                    System.out.println("Digite o nome do bairro : ");
                    String bairro = scan.next();
                    e.setBairro(bairro);
                    System.out.println("Digite o número da residencia : ");
                    int numeroCasa = scan.nextInt();
                    System.out.println("Digite a cidade : ");
                    e.setNumero(numeroCasa);
                    String cidade = scan.next();
                    e.setCidade(cidade);
                    System.out.println("Digite o estado : ");
                    String uf = scan.next();
                    e.setUF(uf);
                    System.out.println("Digite o cep : ");
                    String cep = scan.next();
                    e.setCep(cep);
                    System.out.println("Digite o complemento : ");
                    String complemento = scan.next();
                    e.setComplemento(complemento);
                    // endereco.add(new Endereco(rua, bairro, numeroCasa, cidade, uf, cep,
                    // complemento));
                    c.add(new Clientes(nomeCliente, cpf, email, telefone, e));

                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println("*** *** ***");

                    break;

                case 3:
                    // Acesso ao estoque
                    System.out.println("Digite o usuário: ");
                    String login = scan.next();
                    System.out.println("Digite a senha: ");
                    String senha = scan.next();

                    if (gerente.getLOGIN().equals(login) & gerente.getSENHA().equals(senha)) {
                        System.out
                                .println("Acessar estoque: 1-Ver todos os produtos 2-pesquisar por código do produto");

                        int o = scan.nextInt();
                        if (o == 1) {
                            System.out.println(estoque.toString());

                        } else if (o == 2) {
                            System.out.println("Digite o Código");
                            int testar = scan.nextInt();
                            for (Produtos pro : p) {
                                if (pro.getCodigo() == testar) {
                                    System.out.println("Está na lista");
                                    System.out.println(pro.toString());
                                } else if (pro.getQuantidade() == 0) {
                                    System.out.println("Operação inválida");
                                }

                            }
                        }

                    } else {
                        System.out.println("Login ou senha inválidos");
                    }

                    break;
                case 4:
                    System.out.println("Cancelar vendas");
                    break;
                case 5:

                    System.out.println("Digite 1-Para listar todos os clientes. 2-Para buscar um cliente ");
                    op = scan.nextInt();

                    if (op == 1) {

                        System.out.println("Listar Clientes");
                        System.out.println(c.toString());

                    } else if (op == 2) {

                        System.out.println("Digite o cpf do cliente o qual deseja consultar : ");
                        cpf = scan.next();

                        for (Clientes clientes : c) {

                            if (clientes.getCpf().equals(cpf)) {

                                System.out.println(clientes.toString());

                            }
                        }
                    }

                    break;

                case 6:
                    System.out.println(" Aquisição de produtos" + "\nDigite o código do produto");
                    int cod = scan.nextInt();
                    System.out.println("Nome do produto:");
                    String nome = scan.next();
                    System.out.println("Preço do produto:");
                    double preco = scan.nextDouble();
                    System.out.println("Quantidade de produtos:");
                    int quantidade = scan.nextInt();
                    p.add(new Produtos(cod, nome, preco, quantidade));
                    estoque.add(new Estoque(p));
                    System.out.println("Compra efetuada com sucesso!");
                    break;
                case 7:
                    String cpfCliente;
                    System.out.println("Digite o cpf do cliente : ");
                    cpfCliente = scan.next();

                    for (int i = 0; i < c.size(); i++) {
                        if (c.get(i).getCpf().equals(cpfCliente)) {
                            c.remove(c.get(i));

                        } else {
                            System.out.println("Cliente não encontrado!");
                        }

                    }

                    System.out.println("Cliente apagado do banco de dados!");

                    break;

                case 0:
                    System.out.println("Saiu!");
                    yes = false;
                default:
                    break;
            }

        }

        scan.close();

    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nomeCliente, cpf, email, telefone;
        int numeroCasa;

        ArrayList<Caixa> caixa = new ArrayList<Caixa>();
        ArrayList<Estoque> estoque = new ArrayList<Estoque>();
        ArrayList<Produtos> p = new ArrayList<Produtos>();
        ArrayList<Clientes> c = new ArrayList<Clientes>();

        boolean yes = true;
        while (yes) {
            System.out.println("\nAteliê EncanARTE" + "\n1.Realizar vendas " + "\n2. Cadastrar clientes "

                    + "\n3. Acessar Estoque " + "\n4. Cancelar venda" + "\n5. Listar Clientes"
                    + "\n6. Aquisição de  produtos" + "\n0. Sair");

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
                    // Strin numeroCasa = scan.nextInt();
                    System.out.println("Digite a cidade : ");
                    String cidade = scan.next();
                    e.setCidade(cidade);
                    System.out.println("Digite o estado : ");
                    String uf = scan.next();
                    e.UF(uf);
                    System.out.println("Digite o cep : ");
                    String cep = scan.next();
                    e.cep(cep);
                    System.out.println("Digite o complemento : ");
                    String complemento = scan.next();
                    e.complemento(complemento);
                    // enderecos.add(new Endereco(rua, bairro, numeroCasa, cidade, uf, cep,
                    // complemento)

                    c.add(new Clientes(nomeCliente, cpf, email, telefone, e));
                    System.out.println("Cliente cadastrado com sucesso!");

                    break;

                case 3:

                    System.out.println("Acessar estoque");
                    System.out.println(estoque.toString());
                    break;

                case 4:

                    System.out.println("Cancelar vendas");

                    break;

                case 5:

                    System.out.println("Listar Clientes");
                    System.out.println("*** *** ***");
                    System.out.println(c.toString());

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

                case 0:
                    System.out.println("Saiu!");
                    yes = false;
                    break;

                default:

                    break;
            }

        }

    }
}
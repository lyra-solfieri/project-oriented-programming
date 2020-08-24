import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Caixa> caixa = new ArrayList<Caixa>();
        ArrayList<Estoque> estoque = new ArrayList<Estoque>();
        ArrayList<Produtos> p = new ArrayList<Produtos>();

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
                default:
                    break;
            }

        }

    }
}
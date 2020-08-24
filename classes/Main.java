import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Caixa> caixa = new ArrayList<Caixa>();
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();

        

        boolean yes = true;
        while (yes) {
            System.out.println("\nAteliê EncanARTE" + "\n1.Realizar vendas " + "\n2. Cadastrar clientes "

                    + "\n3. Acessar Estoque " + "\n4. Cancelar venda" +"\n5. Listar Clientes"+ "\n6. Aquisição de  produtos"+ "\n0. Sair");

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
                        break;
                        case 4:
                        System.out.println("Cancelar vendas");
                        break;
                        case 5:
                        System.out.println("Listar Clientes");
                        break;
                        case 6:
                        System.out.println(" Aquisição de produtos" +"\nDigite o código do produto");
                        int cod = scan.nextInt();

                        default:
                            break;
                    }

        }

    }
}
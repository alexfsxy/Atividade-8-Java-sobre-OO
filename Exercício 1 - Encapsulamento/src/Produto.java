import java.util.Scanner;

public class Produto {

    private static Object produto;

    public static <Produto> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Defina um produto: ");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Preço: ");
        float preco = sc.nextFloat();
        sc.nextLine();


        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();


        System.out.println();
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}

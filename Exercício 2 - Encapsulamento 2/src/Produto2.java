import java.util.Scanner;

public class Produto2 {
    public static <Desconto> void main(String[] args) {
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

        System.out.println("Desconto: ");
        float desconto = sc.nextFloat();
        sc.nextLine();

        double produto = (preco/100) * desconto;

        System.out.println();
        System.out.println("Nome: " + nome);

        System.out.println("Desconto: " + desconto);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço desconto: R$" + ((desconto/100) * preco));
        System.out.println("Preço total: R$" + (preco - ((desconto/100) * preco)));
        System.out.println();

        System.out.println("Aplicando o desconto no preço do produto confirmado: ");
        System.out.println("Porcentagem % determinado: ");
       System.out.printf("Preço de total " + (preco - ((desconto/100) * preco)) + " com desconto: R$ %.2f", produto);
    }
}

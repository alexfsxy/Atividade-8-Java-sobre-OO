import java.util.Scanner;

public class    Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Desenvolvedor dev;
        Gerente grh;

        System.out.println("O nome do desenvolvedor: ");
        String desenvolvedor = sc.nextLine();

        System.out.println("O teto salarial " + desenvolvedor + ": ");
        float salarioDoDev = (int)sc.nextFloat();
        sc.nextLine();

        System.out.println();

        System.out.println("O nome do gerente: ");
        String gerente = sc.nextLine();

        System.out.println("O teto salarial  " + gerente + ": ");
        float salarioDoGrh = (int)sc.nextFloat();
        sc.nextLine();
        System.out.println();

        dev = new Desenvolvedor(desenvolvedor, salarioDoDev);
        grh = new Gerente(gerente, salarioDoGrh);

        System.out.println("O teto salarial deste desenvolvedor " + dev.getNome() + " em bônus: " + dev.calcularEmBonus());

        System.out.println("O teto salarial deste gerente " + grh.getNome() + " em bônus: " + grh.calcularEmBonus());
    }
}

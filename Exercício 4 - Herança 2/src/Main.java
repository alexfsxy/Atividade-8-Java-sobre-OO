import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario func;
        Desenvolvedor dev;
        Gerente grh;

        System.out.println("Digite o nome do funcionário: ");
        String funcNome = sc.nextLine();
        System.out.println("Digite o salário deste funcionário: ");
        float funcSal = (int)sc.nextFloat();
        sc.nextLine();
        func = new Funcionario(funcNome, funcSal);

        System.out.println("Digite o nome do desenvolvedor: ");
        String devNome = sc.nextLine();
        System.out.println("Digite o salário deste desenvolvedor: ");
        float devSalario = (int)sc.nextFloat();
        sc.nextLine();
        dev = new Desenvolvedor(devNome, devSalario);

        System.out.println("Digite o nome do gerente: ");
        String grhNome = sc.nextLine();
        System.out.println("Digite o salário deste gerente: ");
        float grhSalario = (int)sc.nextFloat();
        sc.nextLine();
        grh = new Gerente(grhNome, grhSalario);

        System.out.println();
        func.trabalhar();
        dev.trabalhar();
        grh.trabalhar();
    }
}

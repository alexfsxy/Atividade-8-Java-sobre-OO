public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, float salario) {
       super(nome, salario);
    }

    public double calcularEmBonus() {
        return this.salario * (10.0f / 100.0f);
    }

    @Override
    public void trabalhar() {
        System.out.println("O desenvolvedor " + this.nome + " está trabalhando em seu desenvolvimento no setor do administrativo no projeto");
    }
}

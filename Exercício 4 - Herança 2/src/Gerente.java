public class Gerente extends Funcionario {

public Gerente(String nome, float salario) {
     super(nome, salario);
    }

    public double calcularEmBonus() {
        return this.salario * (20.0f / 100.0f);
   }

@Override
    public void trabalhar() {
        System.out.println("O gerente " + this.nome + " está trabalhando em  gerenciamento administrativo do projeto");
    }
}

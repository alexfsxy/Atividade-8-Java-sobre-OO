public class Funcionario {
    protected String nome;

    protected double salario;

 protected Funcionario(String nome, float salario) {
       this.nome = nome;
        this.salario = salario;
    }

    protected void trabalhar() {
        System.out.println("O funcionário " + this.nome + " está trabalhando em sua função determinada da empresa");
    }
}

public class Funcionario {
    protected String nome;
    protected float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double calcularBonus() {
        return 0.0;
    }
}

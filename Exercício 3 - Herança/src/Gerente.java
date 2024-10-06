public class Gerente extends Funcionario{
    public Gerente(String nome, float salario) {
        super(nome, salario);
    }

    public String getNome() {
        return this.nome;
    }

    public float calcularEmBonus() {
        return this.salario + this.salario * (20.0f / 100.0f);
    }
}

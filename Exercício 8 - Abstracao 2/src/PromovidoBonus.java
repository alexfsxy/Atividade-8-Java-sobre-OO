import java.util.List;

public class PromovidoBonus {
    public static void main(String[] args) {
        final PromovidoBonus promovidoBonus = new PromovidoBonus();
        promovidoBonus.execute();
    }

    private void execute() {
        List<Colaborador> colaboradores = List.of(
         new Colaborador("Alex foi promovido de Desenvolvedor", Cargo.Desenvolvedor, 2000),
         new Colaborador("Ana foi promovida de Analista", Cargo.Analista, 2500),
         new Colaborador("Silva foi promovido ao Gerente último grau da hierarquia ", Cargo.Gerente ,3000),
         new Colaborador("Davi começou função de Estagiário", Cargo.Estagiario,800)
);
        final CalculadoraBonificacao calculadora = new CalculadoraBonificacao();
        colaboradores.forEach(colaborador -> {
            System.out.printf("O colaborador %s tem bonificacao de %f%n",
                    colaborador.nome(), calculadora.calcularBonificacao(colaborador)).println();
        });
    }
}

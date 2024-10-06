public class CartaoDeCredito extends FormaDePagamento{
    private float limite;

    private float valor;

    public CartaoDeCredito(float limite) {
        if (limite < 0) {
            throw new IllegalStateException("O limite deve ser maior que o valor zero!");
        }

        this.limite = limite;
    }

    @Override
    public void processarOPagamento(float valor) {
        this.valor = valor;

        if (validarOPagamento()) {
            System.out.println("O pagamento deste cartão " + this.valor + " foi aprovado!");
        } else {
            System.out.println("O pagamento deste cartão não foi aprovado! Valor foi maior que o limite!");
        }
    }

    @Override
    public boolean validarOPagamento() {
        return !(this.valor <= 0) && !(this.valor > this.limite);
    }
}

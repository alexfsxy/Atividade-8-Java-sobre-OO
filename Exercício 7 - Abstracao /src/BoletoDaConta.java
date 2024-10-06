public class BoletoDaConta extends FormaDePagamento {
    private final String codigoBarras;

    public BoletoDaConta(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarOPagamento(float valor) {
        if (validarOPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com muito sucesso pelo boleto.");
        } else {
            System.out.println("Pagamento foi inválido. Boleto inválido.");
        }
    }

    @Override
    public boolean validarOPagamento() {
        return codigoBarras.length() == 44;
    }
}

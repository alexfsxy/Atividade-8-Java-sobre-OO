public class Pix extends FormaDePagamento {
    private final String chavePix;

    public Pix(String chaveDoPix) {
        this.chavePix = chaveDoPix;
    }

    @Override
    public void processarOPagamento(float valor) {
        if (validarOPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com muito sucesso pelo Pix.");
        } else {
            System.out.println("Pagamento foi inválido. Chave do Pix inválida.");
        }
    }

    @Override
    public boolean validarOPagamento() {
        return chavePix != null && !chavePix.isEmpty();
    }
}

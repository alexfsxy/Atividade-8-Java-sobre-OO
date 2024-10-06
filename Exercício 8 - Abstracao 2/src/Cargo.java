public enum Cargo {
    Analista {
        @Override
        public double calcularBonificacao(double salarioBase) {
            return  (salarioBase  * 0.07f + salarioBase);
        }
    },
    Desenvolvedor {
        @Override
        public double calcularBonificacao(double salarioBase) {
            return  (salarioBase * 0.05f + salarioBase);
        }
    },
    Gerente {
        @Override
        public double calcularBonificacao(double salarioBase) {
            return  (salarioBase * 0.1f + salarioBase);
        }
    },
    Estagiario;

    public double calcularBonificacao(double salarioBase){
        return  (salarioBase * 0.02f + salarioBase);
    }
}

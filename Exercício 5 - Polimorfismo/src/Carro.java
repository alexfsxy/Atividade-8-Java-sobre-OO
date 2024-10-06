public class Carro implements MeioDeTransporte {
    @Override
    public void aceleracao() {
        System.out.println("O carro está sob aceleração");
    }

    @Override
    public void freando() {
        System.out.println("O carro está freando");
    }
}

public class Trem implements MeioDeTransporte {
    @Override
    public void aceleracao() {
        System.out.println("O trem está saindo da estação");
    }

    @Override
    public void freando() {
        System.out.println("O trem está parando da estação");
    }
}

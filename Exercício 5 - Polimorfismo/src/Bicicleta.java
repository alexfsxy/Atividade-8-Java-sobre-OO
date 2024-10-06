public class Bicicleta implements MeioDeTransporte {
    @Override
    public void aceleracao() {
        System.out.println("O ciclista está pedalando a bicicleta");
    }

    @Override
    public void freando() {
        System.out.println("O ciclista está parando a bicicleta");
    }
}

public class Main {
    public static void main(String[] args) {

      MeioDeTransporte[] meiosDeTranpsporte = new MeioDeTransporte[3];

        meiosDeTranpsporte[0] =  new Carro();
        meiosDeTranpsporte[1] = new Bicicleta();
        meiosDeTranpsporte[2] = new Trem();

        for (MeioDeTransporte meio : meiosDeTranpsporte) {
            meio.aceleracao();
            meio.freando();
            System.out.println();
        }
    }
}

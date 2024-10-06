import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println("Polimorfismo com classes abstratas de emissão do som deste animais. \n");
    }
}

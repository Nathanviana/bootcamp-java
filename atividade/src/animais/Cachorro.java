package animais;

public class Cachorro extends Animal {

    // crie um metodo emitirSom que sobrescreve o metodo emitirSom da classe Animal
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }

}

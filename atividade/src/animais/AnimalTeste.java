package animais;

public class AnimalTeste {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setIdade(3);
        cachorro.emitirSom();

        Gato gato = new Gato();
        gato.setNome("Felix");
        gato.setIdade(2);
        gato.emitirSom();

        Animal an = new Animal();
        an.emitirSom();

    }

}

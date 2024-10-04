package animais;

public class AnimalTeste {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setIdade(3);
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade());
        cachorro.emitirSom();

        Gato gato = new Gato();
        gato.setNome("Felix");
        gato.setIdade(2);
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Idade: " + gato.getIdade());
        gato.emitirSom();

    }

}

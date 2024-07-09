package heranca;

public class AnimaisTeste {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro("doribaldo");
        dog.comer();
        dog.beber();

        System.out.println(" ");

        Gato gato = new Gato("pandora");
        gato.comer();
        gato.beber();
        gato.miar();

        System.out.println(" ");

        Pombo pombo = new Pombo("cleber");
        pombo.comer();
        pombo.beber();
        pombo.voar();
        pombo.bicar();

    }

}

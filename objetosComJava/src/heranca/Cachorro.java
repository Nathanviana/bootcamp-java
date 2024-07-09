package heranca;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.printf("%s latiu", getNome());
    }

    public void lamber() {
        System.out.printf("%s lambeu", getNome());
    }
}

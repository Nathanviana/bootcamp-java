package heranca;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.printf("%s miou\n", getNome());
    }
}

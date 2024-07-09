package heranca;

public class Pombo extends Ave {

    public Pombo(String nome) {
        super(nome);
    }

    public void bicar() {
        System.out.printf("%s bicou\n", getNome());
    }


}

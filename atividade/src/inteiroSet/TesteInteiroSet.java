package inteiroSet;

public class TesteInteiroSet {

    public static void main(String[] args) {

        InteiroSet conj1 = new InteiroSet();
        InteiroSet conj2 = new InteiroSet();

        conj1.insereElemento(10);
        conj1.insereElemento(20);
        conj1.insereElemento(30);

        conj2.insereElemento(20);
        conj2.insereElemento(40);
        conj2.insereElemento(50);

        System.out.println(conj1.toSetString());
        System.out.println(conj2.toSetString());

        InteiroSet uniao = conj1.union(conj2);
        System.out.println(uniao.toSetString());

        InteiroSet intersecao = conj1.intersecao(conj2);
        System.out.println(intersecao.toSetString());

        if (conj1.ehIgualTo(conj2)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

    }

}

package classesObjAtriMetod;

public class Carro {

    //atributos
    String modelo;
    String marca;
    int ano;
    int velocidade;

    //métodos
    void acelerar(int aceleracao) {
        velocidade += aceleracao;
    }

    void frear(int reduzir) {
        velocidade -= reduzir;
    }

    void buzinar() {
        System.out.println("bibi");
    }

}

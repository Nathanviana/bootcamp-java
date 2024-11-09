package Vetor;

public class VetorNumerico {
    public static void main(String[] args) {
        int [] vetorTeste = new int [6];

        vetorTeste[0] = 10;
        vetorTeste[1] = 20;
        vetorTeste[2] = 30;
        vetorTeste[3] = 40;
        vetorTeste[4] = 50;
        vetorTeste[5] = 60;

        for (int i = 0; i < vetorTeste.length; i++) {
            System.out.println(vetorTeste[i]);
        };

        System.out.println("fim do programa");

    }
}
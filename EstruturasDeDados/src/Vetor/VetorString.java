package Vetor;

import java.util.Scanner;

public class VetorString {
    public static void main(String[] args) {
        String[] vetorString = new String[6];

        vetorString[0] = "A";
        vetorString[1] = "B";
        vetorString[2] = "C";
        vetorString[3] = "D";
        vetorString[4] = "E";
        vetorString[5] = "F";

        for (int i = 0; i < vetorString.length; i++) {
            System.out.println("imprimindo posição " + i + ": " + vetorString[i]);
        }

        //fazer busca linear

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor a ser buscado: ");
        String valorBuscado = leitor.nextLine();

        boolean achou = false;
        for (int i = 0; i < vetorString.length; i++) {
            String elemento = vetorString[i];
            if (elemento.equalsIgnoreCase(valorBuscado)) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            System.out.println("valor econtrado");
        } else {
            System.out.println("valor não encontrado");

        }
    }
}

package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // Array (vetor) > com um tamanho fixo de x posições
        String[] arrayEstatico = new String[4];

        arrayEstatico[0] = "A";
        arrayEstatico[1] = "B";
        arrayEstatico[2] = "C";
        arrayEstatico[3] = "D";

        System.out.println("Array estatico: " + Arrays.toString(arrayEstatico));

        //ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        numeros.remove(2); // remove o numero que ta no indice 2.

        System.out.println("Array dinamico: " + numeros);

        //Array padrão
        String[] nomes;
        nomes = new String[] {"Nathan", "Lucas", "Noser", "lufe"};

        System.out.println("Array padrão: " + Arrays.toString(nomes));

    }

}

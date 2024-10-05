package estruturasDados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaTeste {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        //2) Considerando a implementação de uma fila para 4 elementos, na qual
        //somente podem ser inseridos números ímpares, faça a simulação da
        //execução da sequência de instruções na tabela abaixo, indicando a saída
        //e o resultado da fila a cada execução.
        //Instruções:
        //u Na coluna “Saída” mostre uma das mensagens:
        //valor enfileirado,
        //valor rejeitado,
        //fila cheia,
        //fila vazia,
        //verdadeiro,
        //falso.
        //u Na coluna “Resultado da fila”, anote os elementos da fila após cada
        //operação

        fila.add(5);
        System.out.println("Saída: valor enfileirado");
        System.out.println("Resultado da fila: " + fila);

        fila.add(8);
        System.out.println("Saída: valor rejeitado");
        System.out.println("Resultado da fila: " + fila);

        fila.poll();
        System.out.println("resultado da fila: " + fila);

        fila.add(7);
        System.out.println("Saída: valor enfileirado");
        System.out.println("Resultado da fila: " + fila);

        fila.add(1);
        System.out.println("Saída: valor enfileirado");
        System.out.println("Resultado da fila: " + fila);

        fila.add(3);
        System.out.println("Saída: valor enfileirado");
        System.out.println("Resultado da fila: " + fila);

        System.out.println("fila vazia? " + fila.isEmpty());

        fila.add(4);
        System.out.println("Saída: valor rejeitado");
        System.out.println("Resultado da fila: " + fila);

        fila.add(13);
        System.out.println("Saída: valor enfileirado");
        System.out.println("Resultado da fila: " + fila);

        // esperar explicação do professor sobre o isFull()








    }

}

package estruturasDados.pilha;

import java.util.Stack;

public class PilhasTeste {

    public static void main(String[] args) {

        //Stack<Tipo> nome = new Stack<>();

        Stack<Integer> p1 = new Stack<>();

        p1.push(5);
        p1.push(3);
        p1.pop();
        p1.push(2);
        p1.push(8);
        p1.pop();
        p1.pop();
        p1.push(9);
        p1.push(1);
        p1.pop();
        p1.push(7);
        p1.push(6);
        p1.pop();
        p1.pop();
        p1.push(4);
        p1.pop();
        p1.pop();
        p1.push(1);

        System.out.println("print com stack" + p1);


        Pilha p = new Pilha(new int[10]);
        p.push(5);
        p.push(3);
        p.pop();
        p.push(2);
        p.push(8);
        p.espiar();

    }

}

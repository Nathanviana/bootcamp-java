package estruturasDados.pilha;

public class Pilha {


    private int valores[];
    private int topo;

    public Pilha(int Valores[]) {
        this.valores = Valores;
        topo = -1;
    }

    public void push(int elemento) {
        if (topo < 9) {
            topo = topo + 1;
            valores[topo] = elemento;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    public void pop() {
        if (topo != -1) {
            topo = topo - 1;
        } else {
            System.out.println("Pilha vazia");
        }
    }

    public void espiar() {
        if (topo != -1) {
            System.out.println("o topo é: " + valores[topo]);
        } else {
            System.out.println("Pilha vazia");
        }
    }
}

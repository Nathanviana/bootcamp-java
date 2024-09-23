package inteiroSet;

public class InteiroSet {

    private boolean[] conjunto;

    public InteiroSet() {
        conjunto = new boolean[101]; // 0 a 100
    }

    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        } else {
            System.out.println("Elemento fora do intervalo permitido (0-100).");
        }
    }

    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        } else {
            System.out.println("Elemento fora do intervalo permitido (0-100).");
        }
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public String toSetString() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            if (conjunto[i]) {
                resultado.append(i).append(" ");
            }
        }
        return resultado.length() > 0 ? resultado.toString().trim() : "-";
    }

    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

}

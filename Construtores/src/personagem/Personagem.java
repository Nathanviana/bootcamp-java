package personagem;

public class Personagem {

    //Attribute
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;

    }

    public void imprimir() {
        System.out.println("Nome do personagem: " + nome + "\nClasse do personagem: " + classe + "\nNivel do personagem: " + nivel);
    }
}

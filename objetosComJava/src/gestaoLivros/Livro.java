package gestaoLivros;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int ano;
    private String IBSN;
    private boolean disponivel = true;

    // Construtor
    public Livro(String titulo, String autor, int ano, String IBSN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.IBSN = IBSN;
    }

    // Métodos
    public String getTitulo() {
        return this.titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("IBSN: " + IBSN);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}

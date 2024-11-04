package gestaoLivros;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Atributos
    private List<Livro> livros = new ArrayList<>();

    // Métodos
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " adicionado a biblioteca.");
    }

    public void listaLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : livros) {
            if (livro.estaDisponivel()) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro com título " + titulo + " não encontrado.");
        return null;
    }
}

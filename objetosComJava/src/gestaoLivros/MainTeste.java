package gestaoLivros;

public class MainTeste {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "978-0-395-19395-7");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997, "978-85-325-1423-5");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listaLivrosDisponiveis();

        Usuario usuario1 = new Usuario("João", "123456");

        usuario1.emprestarLivro(livro1);

        usuario1.emprestarLivro(livro1);

        usuario1.devolverLivro(livro1);

        biblioteca.listaLivrosDisponiveis();

        Livro livroBuscado = biblioteca.buscarLivroPorTitulo("Harry Potter e a Pedra Filosofal");
        if (livroBuscado != null) {
            livroBuscado.exibirDetalhes();
        }
    }
}

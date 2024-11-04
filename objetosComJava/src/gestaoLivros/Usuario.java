package gestaoLivros;

public class Usuario {
    // Atributos
    private String nome;
    private String ID;

    // Construtor
    public Usuario(String nome, String ID) {
        this.nome = nome;
        this.ID = ID;
    }

    // Métodos

    public void emprestarLivro(Livro livro) {
        if (livro.estaDisponivel()) {
            livro.setDisponivel(false);
            System.out.println(nome + " emprestou o livro " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (!livro.estaDisponivel()) {
            livro.setDisponivel(true);
            System.out.println(nome + " devolveu o livro " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " já está disponível.");
        }
    }

}

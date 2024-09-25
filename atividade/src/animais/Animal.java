package animais;

public class Animal {

    // crie uma classe animal com os atributos nome e idade
    private String nome;
    private int idade;

    // crie uym metodo get e set para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // crie um metodo abstrato emitirSom
    public void emitirSom() {
        System.out.println("O animal faz um som");
    }


}

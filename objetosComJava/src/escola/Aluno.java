package escola;

public class Aluno {
	private String nome;
	private int matricula;
	private int idade;
	
	public Aluno (String nome, int matricula, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public int getIdade(){
		return idade;
	}
}



package escola;

public class Escola {

	public static void main(String[] args) {
		
		Aluno nathan = new Aluno("Nathan", 4113455);
		
		System.out.println("Ficha do aluno\n \nNome: " + nathan.getNome() + "\nMatricula: " + nathan.getMatricula() );
	}
	
}

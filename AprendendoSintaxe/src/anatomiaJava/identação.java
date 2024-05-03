package anatomiaJava;

public class identação {

	public static void main(String[] args) {
		// sem identação
		int num = 5;
		if (num>6) 
		System.out.println("Aprovado");
		else if (num==6)
		System.out.println("Prova Final");
		else
		System.out.println("Reprovado");
		
		// com identação
		int num2 = 5;
		if (num2 > 6)
			System.out.println("Aprovado");
		else if (num2 == 6)
			System.out.println("Prova Final");
		else
			System.out.println("Reprovado");


	}

}

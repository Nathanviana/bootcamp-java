package anatomiaJava;

public class MinhaClasse {

	public static void main(String[] args) {
		
		String primeiroNome = "Nathan";
		String segundoNome = "Viana";
		
		String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado " + primeiroNome.concat(" ").concat(segundoNome); 
	}

}

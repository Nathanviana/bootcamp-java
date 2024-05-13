package estruturacondicional;

public class Condicoesternarias {

	public static void main(String[] args) {
		
		//cenario 01
		int nota = 7;
		String resultado = nota >=7 ? "aprovado" : "reprovado";
		System.out.println(resultado);
		
		
		//cerario 02
		int nota2 = 5;
		
		String resultado2 = nota2 >=7 ? "aprovado" : nota2 >=5 && nota2 <7 ? "recuperação" : "reprovado";
		System.out.println(resultado2);

	}

}

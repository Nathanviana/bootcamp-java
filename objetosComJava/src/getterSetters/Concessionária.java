package getterSetters;

public class Concessionária {
	
	public static void main(String[] args) {
		Carros fiat = new Carros();
		
		fiat.setMarca("Fiat");
		fiat.setCor("Vermelho");
		fiat.setAno(2003);
		
		
		System.out.println("O carro " + fiat.getMarca() + " da cor " + fiat.getCor() + " fabricado no ano de " + fiat.getAno() + " foi visto a 400km em uma avenida de cratocirty sendo pilotado por rodflipe");
		
	}
}

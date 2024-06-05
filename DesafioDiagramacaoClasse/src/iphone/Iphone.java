package iphone;

public class Iphone {

	public static void main(String[] args) {		
		
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		reprodutor.selecionarMusica("505");
		
		Telefone telefone = new Telefone();
		telefone.atender();
		
		Navegador nav = new Navegador();
		nav.adcPag();
		
		
	}
	
}

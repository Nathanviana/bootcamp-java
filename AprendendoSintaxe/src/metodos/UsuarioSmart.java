package metodos;

public class UsuarioSmart {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Tv ligada ? " + smartTv.ligada);
		System.out.println("Canal: " + smartTv.canal);
		System.out.println("Volume: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status" + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status" + smartTv.ligada);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("volume: " + smartTv.volume);
		
		smartTv.mudarCanal(12);
		System.out.println("Canal atual: " + smartTv.canal);
	}

}

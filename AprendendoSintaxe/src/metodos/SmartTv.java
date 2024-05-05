package metodos;

public class SmartTv {
	boolean ligada=false;
	int canal=1;
	int volume=25;
	
	
	public void ligar() {
		ligada=true;
	}
	public void desligar() {
		ligada=false; 
	}
	

	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		if (canal > 0) {
			canal--;
		} else {
			System.out.println("Canal não identificado");
		}
	}
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("Volume no minimo");
		}
	}
	
	
}

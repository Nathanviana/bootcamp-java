package estruturacondicional;

import java.util.Scanner;
                  
public class EstruturaComposta {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		
		int nota = 0;
		
		System.out.println("Informe a nota do aluno: ");
		nota = texto.nextInt();
		
		if(nota >= 7)
			System.out.println("vc passou de ano");
		else
			System.out.println("vc não passou de ano");

	}

}

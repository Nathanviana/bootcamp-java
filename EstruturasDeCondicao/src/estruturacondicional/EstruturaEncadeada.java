package estruturacondicional;

import java.util.Scanner;

public class EstruturaEncadeada {

	public static void main(String[] args) {
		Scanner tx = new Scanner(System.in);

		int nota = 0;

		System.out.println("Informe a nota do aluno: ");
		nota = tx.nextInt();

		if (nota >= 7)
			System.out.println("vc passou de ano");
		else if (nota >= 5 && nota < 7)
			System.out.println("prova final");
		else
			System.out.println("vc não passou de ano");
	}

}

package estruturacondicional;

import java.util.Scanner;

public class EstruturaSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo = 120.00, saldoRetirar = 0;
				
		System.out.println("Informe quanto deseja retirar de saldo: ");
		saldoRetirar = sc.nextDouble();
		
		if(saldoRetirar < saldo)
			saldo = saldo - saldoRetirar;
		
		System.out.println("Seu saldo atual é de R$" + saldo);
		

	}

	
}
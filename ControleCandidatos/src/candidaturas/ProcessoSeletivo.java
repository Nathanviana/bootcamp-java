package candidaturas;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		selecaoCanditados();
	}

	static void selecaoCanditados() {
		String[] candidatos = { "NOSER", "DIVAL", "LUFE", "EMANU", "WESLEY", "RODRIGO", "NATHAN", "DAVID", "LUIZ",
				"AMANDA" };

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;

		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPredentido) {
		double salarioBase = 2000.0;

		if (salarioBase > salarioPredentido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPredentido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}

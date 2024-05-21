package candidaturas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		String[] candidatos = { "NOSER", "DIVAL", "LUFE", "EMANU", "WESLEY" };
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}

	}

	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		} while (continuarTentando && tentativasRealizadas < 3);
		if (atendeu)
			System.out
					.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + " TENTATIVA ");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS "
					+ tentativasRealizadas + " REALIZADA");

	}

	// método auxiliar para ligação
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	static void imprimirSelecionados() {
		String[] candidatos = { "NOSER", "DIVAL", "LUFE", "EMANU", "WESLEY" };
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de N° " + (indice + 1) + " foi o(a) " + candidatos[indice]);
		}
		System.out.println("Forma abreviada de interação for each");

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
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

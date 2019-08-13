package googleCharts;

import java.io.IOException;
import java.util.Scanner;
/* O programa gera um gráfico com o número de gols feitos em cada partida.
  Caio Luiz Bervian e Vinicius Goulart Almeida*/

public class Main {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		GeraGrafico g = new GeraGrafico();
		g.setVetor(novoVetor());
		
		try {
			GerarHtml.gerarHtml(g.getVetor());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	public static int[] novoVetor() {
		System.out.println("Informe o número de partidas");
		int quantidade = entrada.nextInt();
		int vet[] = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe a quantidade de gols por partida");
			vet[i] = entrada.nextInt();
		}
		System.out.println("Dados salvos com sucesso.");
		entrada.close();

		return vet;

	}

}

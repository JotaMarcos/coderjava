package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Come�ou o jogo! Sera que consegue me vencer?");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();

				if (numero > numeroSorteado) {

					System.out.printf("O numero sorteado e menor que %d\n\n", numero);

				} else if (numero < numeroSorteado) {

					System.out.printf("O numero sorteado e maior que %d\n\n", numero);

				} else {

					System.out.printf("Parabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);

				}

			} while (numero != numeroSorteado);

			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = entrada.nextInt();

		} while (continuar != 0);
		
		System.out.println("========================== Fim do Jogo ==========================");

		

		entrada.close();
	}

}

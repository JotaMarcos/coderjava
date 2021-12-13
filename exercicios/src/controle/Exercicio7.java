package controle;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero;
				System.out.printf("Soma até o momento: %d\n", somadorDeNumeros);
			}
		}
		System.out.printf("O Total da Soma é: %d\n", somadorDeNumeros);
		System.out.println("================== Fim da Soma ==================");
		entrada.close();
	}
	
}

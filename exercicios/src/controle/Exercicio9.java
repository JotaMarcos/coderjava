package controle;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("Digite um numero: ");
			int valor = entrada.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.println("O maior valor foi: " + maiorValor);
		System.out.println("================== Fim da Compara��o ==================");

		entrada.close();
		
		
	}
}

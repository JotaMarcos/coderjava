package controle;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nota Parcial 1: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Nota Parcial 2: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Sua m�dia foi " + media + " e voc� est� Aprovado.");
		} else if (media >= 4) {
			System.out.println("Sua m�dia foi " + media + " e voc� est� de Recupera��o.");
		} else {
			System.out.println("Sua m�dia foi " + media + " e voc� est� Reprovado.");
		}

		entrada.close();
		
		
	}
	
}

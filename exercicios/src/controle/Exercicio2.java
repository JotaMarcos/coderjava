package controle;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		boolean anoBissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		
		if(anoBissexto) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}

		entrada.close();
		
	}

}

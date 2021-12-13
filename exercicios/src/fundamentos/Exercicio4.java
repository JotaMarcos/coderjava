package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/* 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = scanner.nextDouble();
		
		/**
		 * Existe também a seguinte possibilidade:
		 * double quadrado = valor * valor;
		 * double cubo = valor * valor * valor;
		 */
				
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		
		System.out.print("O valor ao quadrador é: " + quadrado + "\nO valor do cubo é: " + cubo);
		
		scanner.close();
	}

}

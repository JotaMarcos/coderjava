package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		/* Criar um programa que leia a temperatura em graus Fahrenheit e converta em graus Celsius. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit °F: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = fahrenheit * 1.8 + 32;
		
		System.out.println("O Valor da Temperatura em Celsius °C é: " + conversao);
		
		scanner.close();
		
		
	}

}

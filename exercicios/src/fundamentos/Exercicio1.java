package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/* Criar um programa que leia a temperatura em graus Celsius e converta para Fahrenheit. */
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite a temperatura em graus Celsius °C: ");
		double celsius = scanner.nextDouble();
		
		double conversao = (celsius -32) / 1.8;
		
		System.out.print("O Valor da Temperatura em Fahrenheit °F é: " + conversao);
		
		scanner.close();
		
	}

}

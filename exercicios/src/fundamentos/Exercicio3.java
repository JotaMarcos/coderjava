package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		/* 3. Criar um programa que leia o peso e a altura do usu�rio e imprima no console o IMC. */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso da pessoa em quilogramas(kg): ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura da pessoa em metros(m): ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O IMC da Pessoa �: %.2f", imc);
		
		scanner.close();
		
	}

}

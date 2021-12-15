package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informar quantas notas: ");
		int qtde_Notas = entrada.nextInt();
		
		double[] notas = new double[qtde_Notas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		double media = (total / notas.length);
		
		System.out.printf("A Média é: %.1f!\n", media);

		entrada.close();
		
		
	}
	
}

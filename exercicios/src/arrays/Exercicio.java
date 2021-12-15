package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println("========================");
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7; 
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println("========================");
		System.out.println("Primeira Nota: " + notasAlunoA[0]);
		System.out.println("Quarta Nota: " + notasAlunoA[notasAlunoA.length -1]);
		// System.out.println("Primeira Nota: " + notasAlunoA[4]); ERRO! Pois está fora dos limites do array
		
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("========================");
		System.out.printf("A Média de Notas é: %.1f\n", totalAlunoA / notasAlunoA.length);
		
		System.out.println("========================");
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.println("========================");
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
	
		System.out.printf("A Média de Notas é: %.1f\n", totalAlunoB / notasAlunoB.length);
		
	}
	
	
}

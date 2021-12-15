package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		double [][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", a + 1, n + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		System.out.println();
		System.out.println("================================");
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.printf("A M�dia da Turma �: %.1f", media);
		
		System.out.println();
		System.out.println("================================");
		for(double[] notasDoAluno :  notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		System.out.println();
		System.out.println("================================");		
		if (media >= 7) {
			System.out.println("Turma Aprovada com Sucesso! \\o/");
		} else if(media >= 4.5) {
			System.out.println("Turma em Recupera��o! :(");
		} else {
			System.out.println("Turma Reprovada! ;(");
		}
		
		entrada.close();
		
		
	}
	
}

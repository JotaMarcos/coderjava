package arrays;


public class ExercicioForech {
	
	public static void main(String[] args) {
		
		// Aplicação do foreach no arquivo de Exercício
		System.out.println("========================");
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7; 
		
		for(double notaAlunoA : notasAlunoA) {
			System.out.print(notaAlunoA + " ");
		}
		
		System.out.println();
		System.out.println("========================");
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		for(double notaAlunoB : notasAlunoB) {
			System.out.print(notaAlunoB + " ");
		}
		
	}

}

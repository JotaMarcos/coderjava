package arrays;



public class Forech {
	
	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		// Varrendo o array com o for de forma tradicional
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		System.out.println();
		System.out.println("=================");
		
		// Varrendo o array com o forech 
		for(double nota : notas) {
			System.out.print(nota + " ");
		}
		 
		
		
		
	}
	
}

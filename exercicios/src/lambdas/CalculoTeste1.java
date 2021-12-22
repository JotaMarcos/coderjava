package lambdas;

public class CalculoTeste1 {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println("==================================");
		System.out.println("O resultado é: " + calculo.executar(2, 3));		
		System.out.println("==================================");
		System.out.println();
		
		calculo = new Subtrair();
		System.out.println("==================================");
		System.out.println("O resultado é: " + calculo.executar(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		calculo = new Multiplicar();
		System.out.println("==================================");
		System.out.println("O resultado é: " + calculo.executar(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		calculo = new Dividir();
		System.out.println("==================================");
		System.out.println("O resultado é: " + calculo.executar(2, 3));
		System.out.println("==================================");
		System.out.println();
			
		
		
	}
	
	
}

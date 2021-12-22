package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { return x + y;};
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.executar(2, 3));		
		System.out.println("==================================");
		System.out.println();
		
		calc = (x, y) -> x - y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.executar(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		calc = (x, y) -> x * y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.executar(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		calc = (x, y) -> x * y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.executar(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		
		System.out.println(calc.legal()); // é possível ter o método default
		System.out.println(Calculo.muitoLegal()); // é possível ter o método static
		
	}
}

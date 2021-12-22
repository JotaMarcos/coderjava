package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y;};
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.apply(2.0, 3.0));		
		System.out.println("==================================");
		System.out.println();
		
		calc = (x, y) -> x - y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.apply(2.0, 3.0));
		System.out.println("==================================");
		System.out.println();
		
		calc = (x, y) -> x * y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.apply(2.0, 3.0));
		System.out.println("==================================");
		System.out.println();
		
		calc = (x, y) -> x * y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc.apply(2.0, 3.0));
		System.out.println("==================================");
		System.out.println();
		
		System.out.println();
		System.out.println("======================================================");
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y;};
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc2.apply(2, 3));		
		System.out.println("==================================");
		System.out.println();
		
		calc2 = (x, y) -> x - y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc2.apply(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		calc2 = (x, y) -> x * y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc2.apply(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		calc2 = (x, y) -> x * y;
		System.out.println("==================================");
		System.out.println("O resultado é: " + calc2.apply(2, 3));
		System.out.println("==================================");
		System.out.println();
		
		
	}
}

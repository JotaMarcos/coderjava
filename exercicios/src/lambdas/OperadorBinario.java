package lambdas;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> ((n1 + n2) / 2);
		System.out.printf("A média é: %.1f\n", media.apply(9.5, 5.8));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = ((n1 + n2) / 2);
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.printf("A situação do Aluno(a) é: %s\n", resultado.apply(9.7, 4.1));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.printf("A situação do Aluno(a) é: %s\n", media.andThen(conceito).apply(9.5, 5.5));
	}
}

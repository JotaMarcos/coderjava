package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		System.out.println("------------------ DESAFIO CALCULADORA ------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a opera��o que deseja realizar: ");
		String op = entrada.next();
		
		// L�gica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		
		System.out.printf("O Resultado da Opera��o %.2f %s %.2f � = %2f", num1, op, num2, resultado);
		entrada.close();
		
		
	}

}

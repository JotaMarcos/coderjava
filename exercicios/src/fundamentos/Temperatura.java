package fundamentos;

public class Temperatura {
	
	
	public static void main(String[] args) {
		
		//(°F - 32) x 5/9 = °C
		double F = 95;
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		double C = (F - AJUSTE) * FATOR;
		
		System.out.println("A Temperatura é igual a: " + C + " °C");
		
		
	}
	

}

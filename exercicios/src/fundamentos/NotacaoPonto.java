package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom Dia, DEV";
		s = s.replace("DEV", "DEV Java");
		s = s.toUpperCase();
		s = s.concat("!!!\\\\o/\\\\o/\\\\o/");
		
		System.out.println("-------------------------------------------");
		System.out.println(s);
		
		System.out.println("-------------------------------------------");
		String x = "Jo�o".toUpperCase();
		System.out.println(x);
		
		System.out.println("-------------------------------------------");
		String y = "Bom Dia, DEV"
				.replace("DEV", "Jo�o")
				.toUpperCase().concat("!!! \\o/\\o/\\o/");
		
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
		int a = 3;
		System.out.println(a);
		
		
		
	}
	
	

}

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
		String x = "João".toUpperCase();
		System.out.println(x);
		
		System.out.println("-------------------------------------------");
		String y = "Bom Dia, DEV"
				.replace("DEV", "João")
				.toUpperCase().concat("!!! \\o/\\o/\\o/");
		
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
		
		
	}
	
	

}

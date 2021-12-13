package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String ... args) {
		
		
		/*double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		
		System.out.println(d);*/
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	}

}

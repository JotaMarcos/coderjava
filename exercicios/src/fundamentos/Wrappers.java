package fundamentos;


public class Wrappers {
	
	public static void main(String[] args) {
		
		
		// byte
		Byte b = 100;
		Short s = 1000;
		//Short s = 10000;
		Integer i = 10000;
		//Integer i = 1000000000; // int
		Long l = 100000L;
		//Long l = 1000000000000000000L;
		Float f = 123.10F;
		Double d = 1234.45678;
		//Float f = 100000000000000000000000000000000000000F;
		//Double d = 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000D;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		System.out.println(f);
		System.out.println(d);
		
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		
		
	}

}

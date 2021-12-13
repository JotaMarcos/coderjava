package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 - Forma Pós-Fixada
		a--; // a = a - 1 - Forma Pós-Fixada
		
		++b; // b = b + 1 - Pré-Fixada
		--b; // b = b - 1 - Pré-Fixada
		
		System.out.println(a);
		System.out.println(b);
		
		/* Uma das maiores virtudes do programador é escrever
		 * códigos de fácil compreensão como bons nomes de 
		 * variáveis, o qual você vai olhar para o código e 
		 * entender o que ele está fazendo.
		*/
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
	

}

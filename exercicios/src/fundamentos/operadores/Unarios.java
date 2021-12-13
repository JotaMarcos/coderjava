package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 - Forma P�s-Fixada
		a--; // a = a - 1 - Forma P�s-Fixada
		
		++b; // b = b + 1 - Pr�-Fixada
		--b; // b = b - 1 - Pr�-Fixada
		
		System.out.println(a);
		System.out.println(b);
		
		/* Uma das maiores virtudes do programador � escrever
		 * c�digos de f�cil compreens�o como bons nomes de 
		 * vari�veis, o qual voc� vai olhar para o c�digo e 
		 * entender o que ele est� fazendo.
		*/
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
	

}

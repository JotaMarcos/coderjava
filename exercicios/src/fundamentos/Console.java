package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Sal�rio R$ %.2f%n ", 1234.5678);
		System.out.printf("Nome: %s%n%n", "Jo�o Marcos");
		
		System.out.println("------------------------------------------------------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("------------------------------------------------");
		System.out.printf("O seu nome compelto �: %s %s %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
		
		
		
		
	}
	
	

}

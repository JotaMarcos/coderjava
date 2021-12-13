package fundamentos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		// Esclarescimento sobre os métodos nextInt e nextDouble
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		
		System.out.printf("O senhor %s %s com idade %d anos, foi Aprovado em nosso Processo Seletivo!!!\\o/\\o/\\o/", nome, sobrenome, idade);
		
		teclado.close();

	}

}

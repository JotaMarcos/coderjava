package controle;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0  && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("O n�mero " + numero + " est� entre 0 e 10 e � um n�mero par.");
			} else {
				System.out.println("O n�mero " + numero + " est� entre 0 e 10 e n�o � um n�mero par.");
			}
						
		 } else {
			 System.out.println("O n�mero " + numero + " n�o est� entre 0 e 10.");
		 }
		

		entrada.close();
		
		
	}

}

package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número: ");
		
		int numero = Integer.parseInt(valor);
		
		// Estrutura de controle com ifelse
		if (numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");			
		}
		
	}

}

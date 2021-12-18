package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.4);
		
		System.out.println("====================================================");
		System.out.printf("O peso inicial do convidado é: %.2f\n", convidado.getPeso());
		
		System.out.println("====================================================");
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.printf("O peso atual do convidado é: %.2f\n", convidado.getPeso());
		
		System.out.println("====================================================");
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		System.out.printf("O peso atual do convidado é: %.2f\n", convidado.getPeso());
		System.out.println("====================================================");
		
		
	}
	
}

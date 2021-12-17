package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 10, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.79);
		
		System.out.println("==================================");
		System.out.printf("A Compra do Cliente %s \n", compra1.cliente);
		System.out.println("Quantidade de Itens: " + compra1.itens.size());
		System.out.printf("Valor Total da Compra R$ %.2f\n", compra1.obterValorTotal());
		System.out.println("==================================");
		
		// Só para mostrar a relação bidirecional!!!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O Valor Total é R$ " + total);
		
	}
	
	
}

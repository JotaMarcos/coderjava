package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.0, 10);
		compra2.adicionarItem(new Produto("Impressora", 900.90), 1);
		
		Cliente cliente1 = new Cliente("Maria Julia Moraes");
		cliente1.compras.add(compra1);		
		cliente1.compras.add(compra2);	
		
		System.out.println();
		System.out.println("======================================");
		System.out.println("Cliente: " + cliente1.nome);
		System.out.printf("Total de Compras R$ %.2f\n", cliente1.obterValorTotal());
		
		System.out.println("======================================");
		
		System.out.println();
		
		
		compra1.adicionarItem("Microondas",768.98, 3);
		compra1.adicionarItem(new Produto("Freezer", 2759.35), 1);
		
	
		compra2.adicionarItem("Liquidificador",189.65, 5);
		compra2.adicionarItem(new Produto("Assadeira Elétrica", 559.45), 4);
		
		
		
		Cliente cliente2 = new Cliente("Ellen Duarte");
		cliente2.compras.add(compra1);		
		cliente2.compras.add(compra2);	
		
		System.out.println("======================================");
		System.out.println("Cliente: " + cliente2.nome);
		System.out.printf("Total de Compras R$ %.2f\n", cliente2.obterValorTotal());
		
		System.out.println("======================================");
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("Geladeira Brelux Gelo Seco", 189.65, 2);
		compra3.adicionarItem(new Produto("Fogão Delu Kuke", 758.65), 2);
		
		System.out.println();
		
		Cliente cliente3 = new Cliente("Poliane Cardoso");
		cliente3.adicionarCompra(compra3);		
		cliente3.adicionarCompra(compra3);	
		
		System.out.println("======================================");
		System.out.println("Cliente: " + cliente3.nome);
		System.out.printf("Total de Compras R$ %.2f\n", cliente3.obterValorTotal());
		
		System.out.println("======================================");
		
	}
}

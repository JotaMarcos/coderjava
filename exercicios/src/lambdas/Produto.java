package lambdas;

// A classe m�e de todas as classes em java � o Object
// n�o � necess�rio adicionar que por padr�o subentende-se 
// que a classe Produto j� extende dela.
public class Produto extends Object {
	
	final String nome;
	final double preco;
	final double desconto;
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return "Nome: " +  nome + " tem pre�o de R$" + precoFinal;
	}
	
	
}

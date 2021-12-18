package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setIdade(idade);
		setSobrenome(sobrenome);
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompelto() {
		return getNome() + " " + getSobrenome();
	}
	
	// Getter
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}		
	}
	
	@Override
	public String toString() {
		return "Ol� eu sou o(a) " + getNome() + " e tenho " + getIdade() + " anos.";
	}
	
}

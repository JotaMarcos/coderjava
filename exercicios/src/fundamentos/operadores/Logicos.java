package fundamentos.operadores;

public class Logicos {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		System.out.println();
		
		// Tabela Verdade do E
		System.out.println("Tabela Verdade do E (AND)");
		System.out.println("-----------------------------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		// Tabela Verdade do OU
		System.out.println("Tabela Verdade do OU (OR)");
		System.out.println("-------------------------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		
		// Tabela Verdade do XOR
		System.out.println("Tabela Verdade do OU Exclusivo (XOR)");
		System.out.println("-----------------------------------");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);		
		System.out.println();
		
		// Tabela Verdade da Negação
		System.out.println("Tabela Verdade da Negação (NOT)");
		System.out.println("--------------------------------");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		// Tabela Verdade da Dupla Negação
		System.out.println("Tabela Verdade da Dupla Negação (Double NOT)");
		System.out.println("---------------------------------------------");
		System.out.println(!!true);
		System.out.println(!!false);
		System.out.println();
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		System.out.println("----------------------Desafio---------------------");
		boolean trabalho1 = true; 
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 50\"? " + comprouTV32);
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		// Operador Unário!
		System.out.println("Mais saudável ? " + maisSaudavel);
		
		
		
		
		
	}

}

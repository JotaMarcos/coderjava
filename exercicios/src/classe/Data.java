package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // this só pode ser utilizado assim dentro de um construtor
		
		// byte, short, int, long -> o valor padrão é o 0
		// float, double -> o valor padrão e o 0.0
		// boolean ->  o valor padrão é o false
		// char -> '\u0000'
		
		// Objetos -> o valor padrão é null(nulo)
		// String s = null;
		
		// Uma Constante precisa ser definida até que o objeto ter sido criado 
		// e ele não vai dá o valor padrão.
		// Você de forma explicita deve inicializar uma constante
		// ou na sua declaração dentro do construtor
		
				
	}
	
    Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
    
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
	
	
}

package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicinam um elemento na fila
		// Diferen�a � o compartamento quando a fila est� cheia!
		fila.add("Ana");// retorna falso
		fila.offer("Bia"); // Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Guilherme");
		
		// Peek e Element -> Obter o proximo elemento na fila (sem remover)
		// Diferen�a � o compartaento quando a fila est� vazia
		System.out.println(fila.peek()); // retorna nulo
		System.out.println(fila.peek()); // lan�a uma exce��o
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		// Poll e Remove -> Obter o pr�ximo elemente da fila(remove)
		// Diferen�a � quando a fila est� vazia
		System.out.println(fila.poll()); // retorna nulo
		System.out.println(fila.remove()); // lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
		
	}
	
}

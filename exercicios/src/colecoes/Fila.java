package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicinam um elemento na fila
		// Diferença é o compartamento quando a fila está cheia!
		fila.add("Ana");// retorna falso
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Guilherme");
		
		// Peek e Element -> Obter o proximo elemento na fila (sem remover)
		// Diferença é o compartaento quando a fila está vazia
		System.out.println(fila.peek()); // retorna nulo
		System.out.println(fila.peek()); // lança uma exceção
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		// Poll e Remove -> Obter o próximo elemente da fila(remove)
		// Diferença é quando a fila está vazia
		System.out.println(fila.poll()); // retorna nulo
		System.out.println(fila.remove()); // lança uma exceção
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

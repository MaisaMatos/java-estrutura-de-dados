package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Ao contrário das classes "ArrayList" (vetor) e "Stack" (pilha), não existe uma classe "Queue" (fila).
 * Isso porque "Queue" é uma Interface do Java, e não uma classe.
 * Para usar essa interface, devemos usar qualquer uma das classes que implementam a interface "Queue".
 * Uma delas é a classe "LinkedList", que representa Listas Encadeadas.
 * Então implementamos a interface "Queue" e instanciamos a classe "LinkedList", que dessa forma
 * irá representar uma fila.
 * Importante mencionar que a classe "LinkedList" possui métodos próprios, mas ao declarar a interface
 * "Queue", somente os métodos declarados na inteface "Queue" ficarão disponíveis, garantindo o FIFO.
 * Ou seja, isso garantirá que a instância de "LinkedList" se comporte como uma fila, que usa o FIFO.
 * 
 * 
 */

public class Aula23 {
	
	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(1); //só inserimos no final. Também conhecido como "enqueue"
		fila.add(2);
		
		System.out.println(fila);
		
		System.out.println(fila.peek());
		
		fila.remove(1);
		
		System.out.println(fila);
	}

}

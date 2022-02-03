package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Ao contr�rio das classes "ArrayList" (vetor) e "Stack" (pilha), n�o existe uma classe "Queue" (fila).
 * Isso porque "Queue" � uma Interface do Java, e n�o uma classe.
 * Para usar essa interface, devemos usar qualquer uma das classes que implementam a interface "Queue".
 * Uma delas � a classe "LinkedList", que representa Listas Encadeadas.
 * Ent�o implementamos a interface "Queue" e instanciamos a classe "LinkedList", que dessa forma
 * ir� representar uma fila.
 * Importante mencionar que a classe "LinkedList" possui m�todos pr�prios, mas ao declarar a interface
 * "Queue", somente os m�todos declarados na inteface "Queue" ficar�o dispon�veis, garantindo o FIFO.
 * Ou seja, isso garantir� que a inst�ncia de "LinkedList" se comporte como uma fila, que usa o FIFO.
 * 
 * 
 */

public class Aula23 {
	
	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(1); //s� inserimos no final. Tamb�m conhecido como "enqueue"
		fila.add(2);
		
		System.out.println(fila);
		
		System.out.println(fila.peek());
		
		fila.remove(1);
		
		System.out.println(fila);
	}

}

package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula19 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		Fila<String> fila1 = new Fila<String>();
		
		System.out.println(fila);
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(5);
		
		System.out.println(fila.tamanho());
		
		System.out.println(fila);
		
		System.out.println(fila.estaVazia());
		
		System.out.println(fila.espiar());
		
		fila.desenfileira();
		
		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
		
		fila1.enfileira("A");
		fila1.enfileira("B");
		fila1.enfileira("C");
		fila1.enfileira("D");
		fila1.enfileira("E");
		
		System.out.println(fila1);
		
		System.out.println(fila1.espiar());
		
		fila1.desenfileira();
		
		System.out.println(fila1);
		
		fila1.desenfileira();
		
		System.out.println(fila1);
		
		fila1.desenfileira();
		
		System.out.println(fila1);
		
		fila1.desenfileira();
		
		System.out.println(fila1);
		
		fila1.desenfileira();
		
		System.out.println(fila1);
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(5);
		
		System.out.println(fila);
		
		fila.desenfileira1();
		
		System.out.println(fila);
		
		fila.desenfileira1();
		
		System.out.println(fila);
		
		fila.desenfileira1();
		
		System.out.println(fila);
		
		


	}

}

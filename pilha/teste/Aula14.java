package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		//ao alterar de 10 para 11, a pilha aumentará de tamanho para 20 e irá até o elemento 20
		for(int i=1; i <= 10; i++) {
			pilha.empilha(i);
		}
		System.out.println(pilha); // elementos do 1 ao 10
		System.out.println(pilha.tamanho()); // tamanho 10
		
	}

}

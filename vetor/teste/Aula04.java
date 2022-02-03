package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		System.out.println(vetor.tamanho()); //imprime 3
		
		System.out.println(vetor);
		
		//teste da DIO sobre precedencia de operadores
		int i = 3;
		int a = 10;
		int b = 5;
		int c = 2;
		int d = a - b * c + --i;
		//10 - 5 * 2 + 2
		//10 - (10) + 2
		//2
		System.out.println(d);
		

	}

}

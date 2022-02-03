package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("E");
		vetor.adicionar("F");
		vetor.adicionar("G");
		
		System.out.println(vetor);
		
		vetor.adicionar(0, "A");
		
		System.out.println(vetor);
		
		vetor.adicionar(3, "D");
		
		System.out.println(vetor);

	}

}

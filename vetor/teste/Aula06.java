package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		
		System.out.println(vetor.busca("elemento 1")); //traz posição 0
		System.out.println(vetor.busca("Elemento 1")); //traz posição -1, já que não existe elemento com "E"
		
		
	}

}

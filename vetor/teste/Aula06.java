package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		
		System.out.println(vetor.busca("elemento 1")); //traz posi��o 0
		System.out.println(vetor.busca("Elemento 1")); //traz posi��o -1, j� que n�o existe elemento com "E"
		
		
	}

}

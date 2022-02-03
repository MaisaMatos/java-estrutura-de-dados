package com.loiane.estruturadados.vetor.exercicios;

public class TesteEx02 {

	public static void main(String[] args) {
		
		VetorListaEx02<String> vetor = new VetorListaEx02<String>(5);
		
		vetor.adicionar("A");
		vetor.adicionar("B");
		vetor.adicionar("A");
		vetor.adicionar("A");
		vetor.adicionar("A");

		
		System.out.println(vetor);
		
		System.out.println(vetor.tamanho());	
		
		System.out.println(vetor.contem("Z"));
		
		System.out.println(vetor.ultimoIndice("Z"));

	}

}

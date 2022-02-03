package com.loiane.estruturadados.vetor.exercicios;

public class TesteEx01 {

	public static void main(String[] args) {
		
		VetorListaEx01<String> vetor = new VetorListaEx01<String>(2);
		
		vetor.adicionar("A");
		vetor.adicionar("B");
		vetor.adicionar("C");
		
		System.out.println(vetor);
		
		System.out.println(vetor.contem("B"));
		
		System.out.println(vetor.contem1("C"));
		
		System.out.println(vetor.contem2("D"));

	}

}

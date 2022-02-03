package com.loiane.estruturadados.vetor.exercicios;

public class TesteEx03 {

	public static void main(String[] args) {
		
		VetorListaEx03<String> vetor = new VetorListaEx03<String>(5);
		
		vetor.adicionar("A");
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("D");
		vetor.adicionar("E");

		
		System.out.println(vetor);
		
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.contem("D"));
		System.out.println(vetor.contem1("D"));
		System.out.println(vetor.contem2("D"));
		
		System.out.println(vetor.ultimoIndice("B"));
		
		System.out.println(vetor);
		
		/*
		 * ESTE É O MEU MÉTODO, QUE DEU CERTO MAIS FICOU MAIS EXTENSO
		vetor.remove1("A");
		System.out.println(vetor);
		
		vetor.remove1("E");
		System.out.println(vetor);
		*/
		
		//METODO LOIANE
		vetor.remove("A");
		System.out.println(vetor);
		
		vetor.remove("E");
		System.out.println(vetor);
		
		vetor.remove("C");
		System.out.println(vetor);
	}

}

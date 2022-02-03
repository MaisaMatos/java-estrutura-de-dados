package com.loiane.estruturadados.vetor.exercicios;

public class TesteEx05 {

	public static void main(String[] args) {
		
		VetorListaEx05<String> vetor = new VetorListaEx05<String>(5);
		
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
		
		System.out.println(vetor.busca(0));
		
		System.out.println(vetor.obtem(0));
		
		System.out.println(vetor);
		
		vetor.adicionar(0, "A");
		
		vetor.adicionar(2, "C");
		
		System.out.println(vetor);
		
		//vetor.limpar();
		//vetor.limpar2();
		vetor.limpar3();
		
		System.out.println(vetor);
		
		
		
		
	}

}

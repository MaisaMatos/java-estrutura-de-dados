package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorGeneralizadoComObject;

public class Aula10Contato {

	public static void main(String[] args) {
		
		VetorGeneralizadoComObject vetor = new VetorGeneralizadoComObject(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@contato.com");
		Contato c2 = new Contato("Contato 2", "1234-5679", "contato2@contato.com");
		Contato c3 = new Contato("Contato 3", "1234-5670", "contato3@contato.com");
		
		Contato c4 = new Contato("Contato 3", "1234-5670", "contato3@contato.com");//não existe no vetor
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if(pos >-1) {//se o elemento não existir, retorna -1
			System.out.println("Elemento existe no vetor.");
		} else {
			System.out.println("Elemento não existe no vetor.");
		}
		
		System.out.println(vetor);
		
		
		
		
		System.out.println(vetor);
	}

}

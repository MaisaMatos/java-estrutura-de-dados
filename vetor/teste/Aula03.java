package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		
		/*
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		//comentei o metodo de cima para poder testar o booleano
		//o resultado deste é igual ao do método anterior
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		System.out.println(vetor.toString());

	}

}

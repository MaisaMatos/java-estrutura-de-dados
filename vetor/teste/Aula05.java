package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		//ao buscar uma posição que não existe no vetor, ele lançará a exceção e dará a msg
		//de posição inválida
		System.out.println(vetor.busca(12));
		
			

	}

}

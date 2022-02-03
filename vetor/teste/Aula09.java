package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adicionar("B");
		vetor.adicionar("G");
		vetor.adicionar("D");
		vetor.adicionar("E");
		vetor.adicionar("F");
			
		System.out.println(vetor);
		
		vetor.remove(1);//remove posição 1
		
		System.out.println(vetor);
		//obs: tem um "f" sobrando, pois empurramos para traz e o que não foi sobrescrito, ficou
		//porém, estamos imprimindo o tamanho real do array e ele está sendo ignorado
		
		
		//faremos um exemplo informando o elemento a ser removido, e não a posição conf metodo "remove".
		//vamos aliar o metodo "busca", que traz o índice através do elemento, com o método "remove"
		System.out.println("Remover o elemento E");
		int pos = vetor.busca("E");
		if(pos >-1) {//se o elemento não existir, retorna -1
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor.");
		}
		
		System.out.println(vetor);
	}

}

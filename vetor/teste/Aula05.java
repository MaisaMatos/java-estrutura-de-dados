package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		//ao buscar uma posi��o que n�o existe no vetor, ele lan�ar� a exce��o e dar� a msg
		//de posi��o inv�lida
		System.out.println(vetor.busca(12));
		
			

	}

}

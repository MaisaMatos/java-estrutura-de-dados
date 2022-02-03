package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorGeneralizadoComObject;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorGeneralizadoComObject vetor = new VetorGeneralizadoComObject(3);
		
		vetor.adicionar(3);//autoboxing, transformando um tipo primitivo num objeto
		vetor.adicionar(4);
		vetor.adicionar("5");//veja, misturando os tipos!
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		System.out.println(vetor);
	}

}

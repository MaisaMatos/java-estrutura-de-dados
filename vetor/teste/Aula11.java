package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorGeneralizadoComObject;

public class Aula11 {

	public static void main(String[] args) {
		
		VetorGeneralizadoComObject vetor = new VetorGeneralizadoComObject(2);
		
		//conseguimos adicionar dois tipos diferentes no vetor: um int e um String
		//isso quebrou o conceito da estrutura de dados, na qual um vetor só pode ter dados do mesmo tipo
		//só foi possível no Java porque declaramos Object
		vetor.adicionar(1);
		vetor.adicionar("Elemento do tipo String");
		
		System.out.println(vetor);

	}

}

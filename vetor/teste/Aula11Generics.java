package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorLista;

public class Aula11Generics {

	public static void main(String[] args) {
		
		VetorLista<String> vetor = new VetorLista<String>(1);//o 1 � a capacidade
		
		vetor.adicionar("elemento");
		//vetor.adicionar(1); n�o consigo mais misturar tipos, como em Aula11!
		//vetor.adicionar(new Contato()); tb n�o consigo instanciar classe, s� consigo String
		
		
	}

}

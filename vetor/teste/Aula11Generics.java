package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorLista;

public class Aula11Generics {

	public static void main(String[] args) {
		
		VetorLista<String> vetor = new VetorLista<String>(1);//o 1 é a capacidade
		
		vetor.adicionar("elemento");
		//vetor.adicionar(1); não consigo mais misturar tipos, como em Aula11!
		//vetor.adicionar(new Contato()); tb não consigo instanciar classe, só consigo String
		
		
	}

}

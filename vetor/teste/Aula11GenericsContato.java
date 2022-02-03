package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorLista;

public class Aula11GenericsContato {

	public static void main(String[] args) {
		
		//agora ao invés de tipo String, vou passar a classe Contato
		VetorLista<Contato> vetor = new VetorLista<Contato>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@contato.com");
		Contato c2 = new Contato("Contato 2", "1234-5679", "contato2@contato.com");
		Contato c3 = new Contato("Contato 3", "1234-5670", "contato3@contato.com");
		
		
		//verificar que ao digitar "vetor.", ele já mostra que o parametro só pode ser um contato
		//assim como em "Aula11Generics", onde usamos String, ao digitar o "." o parametro só pode ser String
		vetor.adicionar(c1);
		
		System.out.println(vetor);
		
		

	}

}

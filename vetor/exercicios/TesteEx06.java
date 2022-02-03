package com.loiane.estruturadados.vetor.exercicios;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.teste.Contato;

public class TesteEx06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		VetorListaEx06<ContatoEx06> vetor = new VetorListaEx06<ContatoEx06>(2);
		
		/*
		for(int i=0; i< vetor.mostraCapacidade(); i++) {	
			ContatoEx06 c = new ContatoEx06();
			System.out.println("Insira os dados do contato " + (i+1) + ":");
			System.out.println("nome: ");
			c.setNome(scan.next());
			System.out.println("telefone: ");
			c.setTelefone(scan.next());
			System.out.println("email: ");
			c.setEmail(scan.next());;
			vetor.adicionar(i, c);
		}*/
		
		while(vetor.tamanho() < 4) {
			ContatoEx06 c = new ContatoEx06();
			//System.out.println("Insira os dados do contato " + (i+1) + ":");
			System.out.println("nome: ");
			c.setNome(scan.next());
			System.out.println("telefone: ");
			c.setTelefone(scan.next());
			System.out.println("email: ");
			c.setEmail(scan.next());;
			//vetor.adicionar(i, c);
			try {
				vetor.adiciona(c);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(vetor);		
		
		System.out.println(vetor.busca(5));
		
		System.out.println(vetor.contem1(null));
		
		System.out.println(vetor.ultimoIndice(null));
		
		System.out.println(vetor.obtem(15));
		
		vetor.remove(0);
		
		System.out.println(vetor);
		
		vetor.limpar2();
		
		System.out.println(vetor);
		
		//System.out.println(vetor.remove("nome=1, telefone=1, email=1");
		
		
		
		scan.close();
		
	}

}

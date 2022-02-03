package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio03Loiane {

	public static void main(String[] args) {
		
		Pilha<Livro> pilha = new Pilha<Livro>(20);
		
		Livro livro1 = new Livro();
		livro1.setNome("À espera de um milagre");
		livro1.setIsbn("85-7479-640-9");
		livro1.setAnoLancamento(2004);
		livro1.setAutor("Stephen King");

		Livro livro2 = new Livro("Próxima parada: Marte", 
				"978-85-65530-25-5", 2013, "Mary Roach");
		
		Livro livro3 = new Livro("Harry Potter e a pedra filosofal", 
				"85-325-1101-5", 2000, "J.K.Rowling");
		
		Livro livro4 = new Livro("1808", "978-85-250-5751-8", 2007, "Laurentino Gomes");
		
		Livro livro5 = new Livro("1889", "978-85-250-5446-3", 2013, "Laurentino Gomes");
		
		Livro livro6 = new Livro("Mettalica", "978-85-250-5341-1", 2012, "Mick Wall");
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Empilhando livros na pilha:");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);
		
		System.out.println(pilha.tamanho() + " livros foram empilhados.");
		
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Espiando o topo da pilha: " + pilha.topo());
		
		System.out.println("Desempilhando livros da pilha:");
		
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando livro " + pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados. Pilha vazia: " + pilha.estaVazia());
	}

}

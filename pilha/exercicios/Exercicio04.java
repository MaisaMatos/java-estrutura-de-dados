package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

/* repita o mesmo processo do exercicio anterior, porém usando a classe Stack da API Java*/

public class Exercicio04 {	
	
	public static void main(String[] args) {
		
		Stack<Livro> stack = new Stack<Livro>();
		
		Livro livro1 = new Livro();
		livro1.setNome("Harry Potter e a pedra filosofal");
		livro1.setIsbn("85-325-1101-5");
		livro1.setAnoLancamento(2000);
		livro1.setAutor("J.K.Rowling");
		
		Livro livro2 = new Livro();
		livro2.setNome("1808");
		livro2.setIsbn("978-85-250-5751-8");
		livro2.setAnoLancamento(2007);
		livro2.setAutor("Laurentino Gomes");
		
		Livro livro3 = new Livro();
		livro3.setNome("1889");
		livro3.setIsbn("978-85-250-5446-3");
		livro3.setAnoLancamento(2013);
		livro3.setAutor("Laurentino Gomes");
		
		Livro livro4 = new Livro();
		livro4.setNome("Mettalica");
		livro4.setIsbn("978-85-250-5341-1");
		livro4.setAnoLancamento(2012);
		livro4.setAutor("Mick Wall");
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + stack.isEmpty());
		
		System.out.println("Empilhando livros na pilha:");
		
		stack.push(livro1);
		stack.push(livro2);
		stack.push(livro3);
		stack.push(livro4);
		
		System.out.println(stack.size() + " livros foram empilhados.");
		
		System.out.println(stack);
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + stack.isEmpty());
		
		System.out.println("Espiando o topo da pilha: " + stack.peek());
		
		System.out.println(stack.firstElement());
		
		System.out.println("Desempilhando livros da pilha:");
		
		while(!stack.isEmpty()) {
			System.out.println("Desempilhando livro " + stack.pop());
		}
		
		System.out.println("Todos os livros foram desempilhados. Pilha vazia: " + stack.isEmpty());
	
		
	


	}

}

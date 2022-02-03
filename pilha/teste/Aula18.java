package com.loiane.estruturadados.pilha.teste;

import java.util.Stack;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//pilha está vazia
		System.out.println(stack.isEmpty());

		//empilhando
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		
		//tamanho
		System.out.println(stack.size());
		
		//toString
		System.out.println(stack);
		
		//espiar o topo da pilha
		System.out.println(stack.peek());
		
		//removendo o ultimo elemento
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
	}

}

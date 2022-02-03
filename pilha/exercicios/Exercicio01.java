package com.loiane.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

/* Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com
 * as regras a seguir: 
 * 1) se o número for par, empilhe na pilha
 * 2) se o número for ímpar, desempilhe um número da pilha. Caso a pilha esteja vazia, mostre uma msg
 * 3) se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos, imprimindo-os
 *  na tela
 */

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<Integer>(10);		
		
		System.out.println(pilha);
		
		for(int i=0; i < 10; i++) {
			System.out.println("Entre com o " + (i+1) + "º número de 10: ");
			int num = scan.nextInt();
			if(num % 2 == 0) {
				System.out.println("Empilhando o número " + num);
				pilha.empilha(num);
				System.out.println(pilha);
			} else {
				
				/* SOLUÇÃO MAISA 
				if(pilha.estaVazia()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Número ímpar, desempilhando um elemento da pilha: " + pilha.desempilha());
					System.out.println(pilha);
				}
				*/
				
				Integer desempilhado = pilha.desempilha();
				if(desempilhado == null) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Número ímpar, desempilhando "
							+ "um elemento da pilha: " + desempilhado);
				}
				
			}
			
		}
		
		/*SOLUÇÃO MAISA
		//o problema de usar o for contanto até 10 é que qdo tudo já estiver desempilhado,
		//o código continuará rodando e dará null
		if(!pilha.estaVazia()) {
			for(int i=0; i < 10; i++) {
				System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
				System.out.println(pilha);
			}			
			System.out.println("Todos os elementos foram desempilhados.");
		} else{
			System.out.println("A pilha está vazia.");
		
		}
		*/
		
		System.out.println("Todos os números foram lidos, desempilhando os números da pilha.");
		
		while(!pilha.estaVazia()) {
			
			System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
			
		}
		
		System.out.println("Todos os elementos foram desempilhados.");
		
		scan.close();
		

	

	}
	
}	

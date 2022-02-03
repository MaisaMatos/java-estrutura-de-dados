package com.loiane.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

/* Escreva um programa que leia 10 n�meros. Para cada n�mero lido, verifique e codifique de acordo com
 * as regras a seguir: 
 * 1) se o n�mero for par, empilhe na pilha
 * 2) se o n�mero for �mpar, desempilhe um n�mero da pilha. Caso a pilha esteja vazia, mostre uma msg
 * 3) se ao final do programa a pilha n�o estiver vazia, desempilhe todos os elementos, imprimindo-os
 *  na tela
 */

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<Integer>(10);		
		
		System.out.println(pilha);
		
		for(int i=0; i < 10; i++) {
			System.out.println("Entre com o " + (i+1) + "� n�mero de 10: ");
			int num = scan.nextInt();
			if(num % 2 == 0) {
				System.out.println("Empilhando o n�mero " + num);
				pilha.empilha(num);
				System.out.println(pilha);
			} else {
				
				/* SOLU��O MAISA 
				if(pilha.estaVazia()) {
					System.out.println("A pilha est� vazia!");
				} else {
					System.out.println("N�mero �mpar, desempilhando um elemento da pilha: " + pilha.desempilha());
					System.out.println(pilha);
				}
				*/
				
				Integer desempilhado = pilha.desempilha();
				if(desempilhado == null) {
					System.out.println("A pilha est� vazia!");
				} else {
					System.out.println("N�mero �mpar, desempilhando "
							+ "um elemento da pilha: " + desempilhado);
				}
				
			}
			
		}
		
		/*SOLU��O MAISA
		//o problema de usar o for contanto at� 10 � que qdo tudo j� estiver desempilhado,
		//o c�digo continuar� rodando e dar� null
		if(!pilha.estaVazia()) {
			for(int i=0; i < 10; i++) {
				System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
				System.out.println(pilha);
			}			
			System.out.println("Todos os elementos foram desempilhados.");
		} else{
			System.out.println("A pilha est� vazia.");
		
		}
		*/
		
		System.out.println("Todos os n�meros foram lidos, desempilhando os n�meros da pilha.");
		
		while(!pilha.estaVazia()) {
			
			System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
			
		}
		
		System.out.println("Todos os elementos foram desempilhados.");
		
		scan.close();
		

	

	}
	
}	

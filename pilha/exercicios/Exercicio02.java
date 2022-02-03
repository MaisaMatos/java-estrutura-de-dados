package com.loiane.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

/* Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique conforme
 * as regras a seguir:
 * 1) se o número for par, empilhe na pilha chamada "par"
 * 2) se o número for ímpar, empilhe na pilha chamada "ímpar"
 * 3) se o número for zero, desempilhe um elemento de cada pilha. Caso alguma pilha esteja vazia, 
 * mostre uma msg de erro na tela.
 * Ao final do programa, desempilhe todos os elementos das duas pilhas, imprimindo-os na tela.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();
		
		/*SOLUÇÃO MAISA*/
		for(int i=0; i < 10; i++) {
			System.out.println("Informe o " + (i+1) + "º número de 10: ");
			int num = scan.nextInt();
			
			if(num % 2 == 0 && num != 0) {
				System.out.println("Empilhando o número par na pilha 'par'");
				par.empilha(num);
			}  else if(num % 2 != 0) {
				System.out.println("Empilhando o número ímpar na pilha 'ímpar'");
				impar.empilha(num);
			} else if(num == 0) {				
				if(!(par.estaVazia() && impar.estaVazia())) {
					System.out.println("Desempilhando um elemento da pilha par: " + par.desempilha());
					System.out.println("Desempilhando um elemento da pilha ímpar: " + impar.desempilha());
				} else if(par.estaVazia()) {
					System.out.println("A pilha par está vazia.");
				} else if(impar.estaVazia()) {
					System.out.println("A pilha ímpar está vazia.");
				}				
			}			
		}
		
		/*SOLUÇÃO LOIANE
		for(int i=1; i <= 10; i++) {
			
			int num = scan.nextInt();
			
			if(num == 0) {
				//pilha par
				Integer desempilhado = par.desempilha();					
				if(desempilhado == null) {
					System.out.println("Pilha par vazia.");
				} else {
					System.out.println("Desempilhando da pilha par" + desempilhado);
				}		
				//pilha ímpar
				desempilhado = impar.desempilha();					
				if(desempilhado == null) {
					System.out.println("Pilha ímpar vazia.");
				} else {
					System.out.println("Desempilhando da pilha ímpar" + desempilhado);
				}		
								
			} else if(num % 2 == 0) {
				System.out.println("Empilhando o número par na pilha 'par'");
				par.empilha(num);
			} else {
				System.out.println("Empilhando o número ímpar na pilha 'ímpar'");
				impar.empilha(num);
			}
		}
		*/
			
		
		System.out.println("Todos os números foram lidos, desempilhando os números das pilhas.");
		
		while(!(par.estaVazia() && impar.estaVazia())) {
			
			System.out.println("Desempilhando um elemento da pilha par: " + par.desempilha());
			System.out.println("Desempilhando um elemento da pilha ímpar: " + impar.desempilha());
			
		}
		
		System.out.println("Todos os elementos foram desempilhados.");
		
		
		
		scan.close();
		
		

	}

}

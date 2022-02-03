package com.loiane.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio03 {
	
	/*Utilize a classe Pilha e desenvolva os seguintes itens:
	 * 1) crie uma pilha com capacidade para 20 livros
	 * 2) Insira 6 livros na pilha. Cada livro contém nome, isbn, ano de lançamento e autor
	 * 3) crie um exemplo para utilizar cada método da classe pilha
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Pilha<String> pilha = new Pilha<String>(20);
		
		for(int i=0; i < 6; i++) {
			System.out.println("Insira os dados do " + (i+1) + "º livro: ");
			System.out.println("Nome do livro, ISBN, ano de lançamento e autor: ");
			String dadosLivro = scan.nextLine();
			pilha.empilha(dadosLivro);
		}
		System.out.println(pilha);
		
		System.out.println(pilha.estaVazia());
		
		System.out.println(pilha.tamanho());
		
		pilha.desempilha();
		
		System.out.println(pilha.topo());
		
		

	}

}

package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

/*Usando a classe Pilha ou Stack, desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi
 * a torre é composta de 5 discos empilhados do maior para o menor
 * existem 3 bases de torre: A, B e C, sendo que os discos começam 
 * empilhados na A e as demais estão vazias.
 * O objetivo é passar os discos da torre A para a B e da B para a C, mas não se pode empilhar
 * um disco maior sobre um disco menor, o menor sempre deve estar acima do maior.
 * Então, pode-se usar as duas torres vazias para movimentar os discos, de forma que seja possível
 * empilha-los em outra torre na ordem correta
 */ 
 

public class Exercicio08 {

	public static void main(String[] args) {
		
		Stack<Integer> original = new Stack<Integer>();
		Stack<Integer> destino = new Stack<Integer>();
		Stack<Integer> auxiliar = new Stack<Integer>();

		//ao empilhar, notar que o 1, que é o menor, fica por cima dos demais
		//original.push(4);
		original.push(3);
		original.push(2);
		original.push(1);
		
		torreDeHanoi(original.size(), original, destino, auxiliar);
		
	}

	//n é com quantos discos estamos trabalhando
	//n deve ser maior que zero
	//este será um algoritmo recursivo, que chama ele mesmo
	//em algoritmos recursivos, precisamos de um ponto de parada, que aqui será o "n < 0"
	public static void torreDeHanoi(int n, Stack<Integer> original, 
			Stack<Integer> destino, Stack<Integer> auxiliar) {
		
		if(n > 0) {
			//eis a recursividade, está chamando o próprio metodo
			//ao movimentar o primeiro disco, o "n" será "n-1" (tirou um disco da torre, ficou -1 disco!)
			//que sai da original e vai para a auxiliar e desta para o destino
			torreDeHanoi(n-1, original, auxiliar, destino);
			destino.push(original.pop());
			System.out.println("----------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + destino);
			System.out.println("Auxiliar: " + auxiliar);
			
			//agora onde era original está a auxiliar, e as outras também mudam de posição
			torreDeHanoi(n-1, auxiliar, destino, original);
			
		}
		
	}
	
	
}

package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

/*Usando a classe Pilha ou Stack, desenvolva um algoritmo que resolva o quebra cabe�a Torre de Hanoi
 * a torre � composta de 5 discos empilhados do maior para o menor
 * existem 3 bases de torre: A, B e C, sendo que os discos come�am 
 * empilhados na A e as demais est�o vazias.
 * O objetivo � passar os discos da torre A para a B e da B para a C, mas n�o se pode empilhar
 * um disco maior sobre um disco menor, o menor sempre deve estar acima do maior.
 * Ent�o, pode-se usar as duas torres vazias para movimentar os discos, de forma que seja poss�vel
 * empilha-los em outra torre na ordem correta
 */ 
 

public class Exercicio08 {

	public static void main(String[] args) {
		
		Stack<Integer> original = new Stack<Integer>();
		Stack<Integer> destino = new Stack<Integer>();
		Stack<Integer> auxiliar = new Stack<Integer>();

		//ao empilhar, notar que o 1, que � o menor, fica por cima dos demais
		//original.push(4);
		original.push(3);
		original.push(2);
		original.push(1);
		
		torreDeHanoi(original.size(), original, destino, auxiliar);
		
	}

	//n � com quantos discos estamos trabalhando
	//n deve ser maior que zero
	//este ser� um algoritmo recursivo, que chama ele mesmo
	//em algoritmos recursivos, precisamos de um ponto de parada, que aqui ser� o "n < 0"
	public static void torreDeHanoi(int n, Stack<Integer> original, 
			Stack<Integer> destino, Stack<Integer> auxiliar) {
		
		if(n > 0) {
			//eis a recursividade, est� chamando o pr�prio metodo
			//ao movimentar o primeiro disco, o "n" ser� "n-1" (tirou um disco da torre, ficou -1 disco!)
			//que sai da original e vai para a auxiliar e desta para o destino
			torreDeHanoi(n-1, original, auxiliar, destino);
			destino.push(original.pop());
			System.out.println("----------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + destino);
			System.out.println("Auxiliar: " + auxiliar);
			
			//agora onde era original est� a auxiliar, e as outras tamb�m mudam de posi��o
			torreDeHanoi(n-1, auxiliar, destino, original);
			
		}
		
	}
	
	
}

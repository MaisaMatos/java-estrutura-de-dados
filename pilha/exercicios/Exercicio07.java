package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

/*Usando a classe Pilha ou Stack, desenvolva um algor�tmo que fa�a a convers�o de n�meros decimais
 * para bin�rios.
 * Ao pesquisar como converter um n�mero decimal para bin�rio, verifica-se que:
 * 1) divide-se o n�mero por dois at� que o resultado d� zero, mas deve-se armazenar os restos
 * 2) os restos formar�o o n�mero bin�rio, mas devem ser lidos de tras para frente
 * 3) por isso a pilha d� bem certo nesse exerc�cio, pois ao desempilhar, os n�meros estar�o assim
 */

public class Exercicio07 {

	public static void main(String[] args) {
		
		imprimeResultado(2);
		imprimeResultado(4);
		imprimeResultado(10);
		imprimeResultado(25);
		imprimeResultado(10035);
		
		imprimeResultadoQualquerBase(25, 16);
		imprimeResultadoQualquerBase(10035, 8);
		imprimeResultadoQualquerBase(10035, 16);

	}
	
	
	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em bin�rio �: " + decimalBinario(numero));
	}
	
	
	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " + base	 + " �: " + decimalQualquerBase(numero, base));
	}
	
		
	public static String decimalBinario(int numero) {
		
		Stack<Integer> pilha = new Stack<Integer>();
		String numBinario = "";
		int resto;
		
		//enquanto o numero passado for maior que zero, faremos as divisoes
		while(numero > 0) {
			resto = numero % 2;
			//empilhando o resto
			pilha.push(resto);
			numero /= 2;
		}
		
		while(!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}	
		
		return numBinario;
	}
	
	
	public static String decimalQualquerBase(int numero, int base) {
		
		if(base > 16) {
			throw new IllegalArgumentException();
		}
		
		
		Stack<Integer> pilha = new Stack<Integer>();
		String numBase = "";
		int resto;
		//os numeros vao de 0 a 9 e at� o 16, s�o usadas as letras; o 10� elemento come�a com o alfabeto.
		//ent�o o 10� elemento seria o A
		String bases = "0123456789ABCDEF";
		
		//enquanto o numero passado for maior que zero, faremos as divisoes
		while(numero > 0) {
			resto = numero % base;
			//empilhando o resto
			pilha.push(resto);
			numero /= base;
		}
		
		while(!pilha.isEmpty()) {
			//com isso, pegamos o caractere do n�mero correspondente
			//exemplo: se queremos o 10� n�mero, pegaremos o char A
			//ou seja, na tabela o A representa o 10
			numBase += bases.charAt(pilha.pop());
		}	
		
		return numBase;
	}


}

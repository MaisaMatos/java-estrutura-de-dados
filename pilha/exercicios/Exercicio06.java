package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

/*Desafio dos símbolos balanceados
 * Escreva um programa para verificar se uma expressão matemática tem os parênteses agrupados de forma
 * correta; isto é:
 * 1) se os números de parênteses à esquerda e à direita são iguais e;
 * 2) se todo parêntese aberto é seguido posteriormente por um fechamento de parêntese.
 * Alguns exemplos:
 * - As expressões ((A+B) ou A+B( violam a condição 1
 * - As expressões )A+B(-C ou (A+B))-(C+D violam a condição 2
 * - A expressão ((A+B)+D) está ok.
 * NOTA DA RESOLUÇÃO DE EXERCÍCIO DA LOIANE:
 * Na expressão A + B + (D + C), por exemplo, não estamos interessados no sinal de mais, nem nos espaços,
 * nem nas letras. O que interessa são somente os símbolos de abertura e fechamento.
 * Vamos empilhar na pilha toda vez que houver uma abertura ou fechameto de parenteses, colchetes ou chaves
 * ignoraremos outros caracteres
 * depois iremos desempihar a pilha e comparar o desempilhado com o topo para ver se há o balanceamento
 */

public class Exercicio06 {

	public static void main(String[] args) {
		
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");
	}
	
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceado? " + verificaSimbolosBalanceados(expressao));
	}
	
		
	//criação de uma constante
	final static String ABRE = "([{";
	
	final static String FECHA = ")]{";
	
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
		
		Pilha<Character> pilha = new Pilha<Character>();		
		int index = 0;
		char simbolo, topo;
		
		while(index < expressao.length()) {
			simbolo = expressao.charAt(index);
			
			//empilhamento dos caracteres de ABRE
			//qdo símbolo é maior que -1 ou 0, significa que ele existe
			if(ABRE.indexOf(simbolo) > - 1) {
				pilha.empilha(simbolo);		
			
			//se for caracter que fecha, ignoraremos e iremos para a proxima posição
			//se ao tentar fechar a pilha ela estiver vazia, significa expressão desbalanceada
			} else if(FECHA.indexOf(simbolo) > -1) {
				if(pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();
					
					if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}					
				}
			}			
			index++;
		}			
		return true;
	}

}

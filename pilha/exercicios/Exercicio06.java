package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

/*Desafio dos s�mbolos balanceados
 * Escreva um programa para verificar se uma express�o matem�tica tem os par�nteses agrupados de forma
 * correta; isto �:
 * 1) se os n�meros de par�nteses � esquerda e � direita s�o iguais e;
 * 2) se todo par�ntese aberto � seguido posteriormente por um fechamento de par�ntese.
 * Alguns exemplos:
 * - As express�es ((A+B) ou A+B( violam a condi��o 1
 * - As express�es )A+B(-C ou (A+B))-(C+D violam a condi��o 2
 * - A express�o ((A+B)+D) est� ok.
 * NOTA DA RESOLU��O DE EXERC�CIO DA LOIANE:
 * Na express�o A + B + (D + C), por exemplo, n�o estamos interessados no sinal de mais, nem nos espa�os,
 * nem nas letras. O que interessa s�o somente os s�mbolos de abertura e fechamento.
 * Vamos empilhar na pilha toda vez que houver uma abertura ou fechameto de parenteses, colchetes ou chaves
 * ignoraremos outros caracteres
 * depois iremos desempihar a pilha e comparar o desempilhado com o topo para ver se h� o balanceamento
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
		System.out.println(expressao + " est� balanceado? " + verificaSimbolosBalanceados(expressao));
	}
	
		
	//cria��o de uma constante
	final static String ABRE = "([{";
	
	final static String FECHA = ")]{";
	
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
		
		Pilha<Character> pilha = new Pilha<Character>();		
		int index = 0;
		char simbolo, topo;
		
		while(index < expressao.length()) {
			simbolo = expressao.charAt(index);
			
			//empilhamento dos caracteres de ABRE
			//qdo s�mbolo � maior que -1 ou 0, significa que ele existe
			if(ABRE.indexOf(simbolo) > - 1) {
				pilha.empilha(simbolo);		
			
			//se for caracter que fecha, ignoraremos e iremos para a proxima posi��o
			//se ao tentar fechar a pilha ela estiver vazia, significa express�o desbalanceada
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

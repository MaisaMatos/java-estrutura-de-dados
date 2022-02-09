package com.loiane.estruturadados.fila.exercicios;

/* Usando a estrutura de dados Fila, crie uma fila de documentos que precisam ser impressos. 
 * Cada documento é composto por um nome e uma quantidade de folhas a serem impressas.
 * O programa deve:
 * - enfileirar os documentos;
 * - seguindo a ordem, o programa deve imprimir cada documento, desinfeileirando da fila
 * Se desejar, pode usar Threads para esperar a impressão de acordo com o número de folhas
 * a serem impressas.
 */

import java.util.PriorityQueue;
import java.util.Queue;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Exercicio01 {

	public static void main(String[] args) {
		
		FilaComPrioridade<DocsExer01> filaDocs = new FilaComPrioridade<DocsExer01>();
		
		filaDocs.enfileira(new DocsExer01("Doc C", 100));
		filaDocs.enfileira(new DocsExer01("Doc A", 50));
		filaDocs.enfileira(new DocsExer01("Doc B", 150));
		
		System.out.println(filaDocs);
		
		filaDocs.desenfileira1();
		
		System.out.println(filaDocs);
		
		filaDocs.desenfileira1();
		
		System.out.println(filaDocs);
		
	}

}

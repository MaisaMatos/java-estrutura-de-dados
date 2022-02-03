package com.loiane.estruturadados.fila;

/* Interface Comparable
 * implementa o método "compareTo(Object o)"
 * se objeto1 > objeto2, retorna um número > 0 (geralmente 1)
 * se objeto1 < objeto2, retorna um número < 0 (geralmente -1)
 * se objeto1 = objeto2, retorna 0
 */


public class FilaComPrioridade<T> extends Fila<T> {

	//para prioridade, sobrescreveremos o método "enfileira", que adiciona sempre no final do vetor
	
	public void enfileira(T elemento) {
		
		Comparable<T> chave = (Comparable<T>) elemento;
		
		//percorrendo todos os elementos
		int i;
		for(i=0; i < this.tamanho; i++) {
			//comparação chave (queremos adicionar) com o vetor
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;				
			}			
		}
		this.adicionar(i, elemento);
	}
	
	
	
}

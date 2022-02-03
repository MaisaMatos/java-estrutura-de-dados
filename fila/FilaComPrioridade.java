package com.loiane.estruturadados.fila;

/* Interface Comparable
 * implementa o m�todo "compareTo(Object o)"
 * se objeto1 > objeto2, retorna um n�mero > 0 (geralmente 1)
 * se objeto1 < objeto2, retorna um n�mero < 0 (geralmente -1)
 * se objeto1 = objeto2, retorna 0
 */


public class FilaComPrioridade<T> extends Fila<T> {

	//para prioridade, sobrescreveremos o m�todo "enfileira", que adiciona sempre no final do vetor
	
	public void enfileira(T elemento) {
		
		Comparable<T> chave = (Comparable<T>) elemento;
		
		//percorrendo todos os elementos
		int i;
		for(i=0; i < this.tamanho; i++) {
			//compara��o chave (queremos adicionar) com o vetor
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;				
			}			
		}
		this.adicionar(i, elemento);
	}
	
	
	
}

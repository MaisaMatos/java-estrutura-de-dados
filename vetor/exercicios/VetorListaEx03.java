package com.loiane.estruturadados.vetor.exercicios;

import java.lang.reflect.Array;

/*Melhore a classe "VetorLista" e implemente o método "remove(T elemento)", onde será possível
 * remover um elemento da lista passando-o como parâmetro
 */

public class VetorListaEx03<T> {

	private T[] elementos;
	private int tamanho;
	
	
	public VetorListaEx03(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0; 
	}
	
	
	public VetorListaEx03(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0; 
	}
			
	
	public void adiciona(T elemento) throws Exception {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
		}
		
	}
	
	
	//uma segunda opção seria fazer um metodo com booleano	
	public boolean adicionar(T elemento) {
		this.aumentaCapacidade();
		if(tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
		
	}
	
	
	public boolean adicionar(int posicao, T elemento) {
		//verificando se a posição é valida, cod copiado do metodo "busca"
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
			throw new IllegalArgumentException("Posição Inválida.");
		}		
		this.aumentaCapacidade();
		
		//movendo os elementos uma posição adiante
		for(int i=this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		//atribuição do elemento à posição	
		this.elementos[posicao] = elemento;
		//incrementando o tamanho
		this.tamanho++;
		
		return true;
	}
	
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			//aumentaremos declarando um outro vetor
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i=0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;//atribuindo o novo vetor ao atual
		}
	}
	
	
	public T busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
			throw new IllegalArgumentException("Posição Inválida.");
		}
		return this.elementos[posicao];		
	}
	
	
	public int busca(T elemento) {
		for(int i=0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}			
		}
		return -1;				
	}
	
	
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
			throw new IllegalArgumentException("Posição Inválida.");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--; //diminui o tam do vetor de 5 para 4 para não considerar o valor que estava em 5 e que não será usado (ficou BDEF-F) 
		
	}
	
	
	public int tamanho() {
		return this.tamanho;
	}
	
	/* ******************** EXERCICIO 01 ******************** */
	
	public boolean contem(T elemento) {
		for(int i=0; i < elementos.length; i++) {
			if(elementos[i].equals(elemento)) {
				return true;
			}
		}		
		return false;		
	}
	
	//Solução Loiane 1	
	//chamando o método já existente "busca" evita de se fazer manutenção em mais de 1 lugar!
	public boolean contem1(T elemento) {
		return busca(elemento) > -1;		
	}
	
	//Solução Loiane 2
	//chamando o método já existente "busca" evita de se fazer manutenção em mais de 1 lugar!
	public boolean contem2(T elemento) {
		int pos = busca(elemento);
		if(pos > -1) {
			return true;
		}
		return false;
	}	
	
	/* ************************ EXERCICIO 02 ******************** */
	
	public int ultimoIndice(T elemento) {
		for(int i=this.tamanho-1; i>= 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}			
		}
		return -1;				
	}
	
	//Solução Loiane 1
	//igual à minha!!!
	
	
	/* *********************** EXERCICIO 03 ******************** */
	
	public void remove1(T elemento) {
		boolean existe = contem1(elemento);
			if(existe == false) {
				throw new IllegalArgumentException("Posição Inválida.");
			}
			
			int posicao = busca(elemento);
			for(int i=posicao; i<this.tamanho-1; i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			this.tamanho--;
	}
	
	//Solução Loiane: sobrescrever o já existente método remove
	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if(pos > -1) {
			this.remove(pos);
		}
	}
	
	
	
	/* *********************** FIM EXERCICIO 03 ******************** */
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
		}
		
		//acessando até a ultima posição para não dar exceção
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}

}

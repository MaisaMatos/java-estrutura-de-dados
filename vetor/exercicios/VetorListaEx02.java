package com.loiane.estruturadados.vetor.exercicios;

import java.lang.reflect.Array;

/*Melhore a classe "VetorLista" e implemente o m�todo "ultimoIndice", semelhante ao m�todo "lastIndexOf" 
 * da classe ArrayList
 */

public class VetorListaEx02<T> {

	private T[] elementos;
	private int tamanho;
	
	
	public VetorListaEx02(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0; 
	}
	
	
	public VetorListaEx02(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0; 
	}
			
	
	public void adiciona(T elemento) throws Exception {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor j� est� cheio, n�o � poss�vel adicionar mais elementos.");
		}
		
	}
	
	
	//uma segunda op��o seria fazer um metodo com booleano	
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
		//verificando se a posi��o � valida, cod copiado do metodo "busca"
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que n�o deve, d� exce��o
			throw new IllegalArgumentException("Posi��o Inv�lida.");
		}		
		this.aumentaCapacidade();
		
		//movendo os elementos uma posi��o adiante
		for(int i=this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		//atribui��o do elemento � posi��o	
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
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que n�o deve, d� exce��o
			throw new IllegalArgumentException("Posi��o Inv�lida.");
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
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que n�o deve, d� exce��o
			throw new IllegalArgumentException("Posi��o Inv�lida.");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--; //diminui o tam do vetor de 5 para 4 para n�o considerar o valor que estava em 5 e que n�o ser� usado (ficou BDEF-F) 
		
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
	
	//Solu��o Loiane 1	
	//chamando o m�todo j� existente "busca" evita de se fazer manuten��o em mais de 1 lugar!
	public boolean contem1(T elemento) {
		return busca(elemento) > -1;		
	}
	
	//Solu��o Loiane 2
	//chamando o m�todo j� existente "busca" evita de se fazer manuten��o em mais de 1 lugar!
	public boolean contem2(T elemento) {
		int pos = busca(elemento);
		if(pos > -1) {
			return true;
		}
		return false;
	}	
	
	
	
	/* ******************** FIM EXERCICIO 01 ******************** */
	
	/* ************************ EXERCICIO 02 ******************** */
	
	public int ultimoIndice(T elemento) {
		for(int i=this.tamanho-1; i>= 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}			
		}
		return -1;				
	}
	
	//Solu��o Loiane 1
	//igual � minha!!!
	
	
	/* ******************** FIM EXERCICIO 02 ******************** */
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
		}
		
		//acessando at� a ultima posi��o para n�o dar exce��o
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}

}

package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {
	
	protected T[] elementos;
	protected int tamanho;
	
	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0; 
	}

	public EstruturaEstatica() {
		this(10);
	}
	
	
	//aula 15
	public boolean estaVazia() {
		return tamanho == 0; //compara o tamanho com zero e se a comparação for true, a pilha está vazia
	}
	
	
	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;		
	}
	
	
	protected boolean adicionar(int posicao, T elemento) {
		//verificando se a posição é valida, cod copiado do metodo "busca"
		if((posicao < 0 || posicao > tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
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

	
	protected void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			//aumentaremos declarando um outro vetor
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i=0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;//atribuindo o novo vetor ao atual
		}
	}
	
	
	public int tamanho() {
		return this.tamanho;
	}
	
	
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

	protected void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
			throw new IllegalArgumentException("Posição Inválida.");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--; //diminui o tam do vetor de 5 para 4 para não considerar o valor que estava em 5 e que não será usado (ficou BDEF-F) 
		
	}
	
	
}

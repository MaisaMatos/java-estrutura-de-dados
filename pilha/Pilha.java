package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	//aula 13
	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	//aula 14
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T topo(){ //Com o T vai retornar o objeto do tipo da pilha		
		if(this.estaVazia()) {
			return null;
		}		
		return this.elementos[tamanho-1];
	}
	
	public T desempilha() {
		if(this.estaVazia()) {
			return null;
		}
		//simplificando as 3 linhas de cód abaixo na última linha
		/*
		T elemento = this.elementos[tamanho-1];
		tamanho--;
		return elemento;
		*/
		return this.elementos[--tamanho];//primeiro diminuirá 1 do tamanho e depois acessa a posição 
	}
	
	
}

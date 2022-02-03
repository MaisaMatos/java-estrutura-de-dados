package com.loiane.estruturadados.fila;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}
	
	
	public void enfileira(T elemento) {
		super.adiciona(elemento);
	}
	
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	
	
	public T desenfileira() {
		T elemento = null;
		if(this.estaVazia()) {
			return null;
		}
		for(int i=0; i<this.tamanho-1; i++) {
			elemento = this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
		return elemento;		
	}
	
	//método desenfileira by Loiane
	public T desenfileira1() {
		
		final int POS = 0; //constante
		
		if(this.estaVazia()) {
			return null;
		}
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
	}

}

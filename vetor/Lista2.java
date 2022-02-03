package com.loiane.estruturadados.vetor;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {
	
	public Lista2() {
		super();
	}

	public Lista2(int capacidade) {
		super(capacidade);
	}
	
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	
	public boolean adicionar(int posicao, T elemento) {
		return super.adicionar(posicao, elemento);
	}
}

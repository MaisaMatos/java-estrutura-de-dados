package com.loiane.estruturadados.vetor.exercicios;

import java.lang.reflect.Array;

/*Utilize a classe "VetorLista" e classe "Contato" e desenvolva os seguintes itens: 
 * 1) crie um vetor com capacidade para 20 contatos
 * 2) insira 30 contatos no vetor
 * 3) crie um exemplo para usar cada método da classe "VetorLista"
 */

public class VetorListaEx06Loiane<T> {

	private T[] elementos;
	private int tamanho;
	
	
	public VetorListaEx06Loiane(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0; 
	}
	
	
	public VetorListaEx06Loiane(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0; 
	}
			
	public int mostraCapacidade() {
		return elementos.length;		
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
		if(!(posicao >=0 && posicao <= tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
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
	
	
	
	/* ***********************  EXERCICIO 04 ******************** */
	
	public T obtem(int posicao) {
		return busca(posicao);
	}
	
	
	
	
	/* ************************ EXERCICIO 05 ******************** */
	//solução 1: instanciando um novo objeto
	//como o vetor de elemento faz referência para um novo objeto, os elementos que estavam no
	//outro vetor e todas as referencias ficarão livres para que o coletor de lixo possa varrer
	//a memória e limpar todos os aquele objetos da memória
	public void limpar() {
		this.elementos = (T[]) new Object[this.elementos.length];
	}
	
	//solução 2: resetar o tamanho para zero e todos os elementos que estiverem dentro do array
	//ficariam como lixo	
	public void limpar2() {
		this.tamanho = 0;
	}
	
	//solução 3:resetar o valor e atribuir valor nulo a todas as posições do elemento
	//assim, perderemos a ref de todos os valores que estão dentro do array e caso houver algum
	//objeto, ele ficará disponível para o coletor de lixo
	//Loiane prefere esta opção
	public void limpar3() {
		for(int i=0; i<this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	
	/* ******************** FIM EXERCICIO 05 ******************** */
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

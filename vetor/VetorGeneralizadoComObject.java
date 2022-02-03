package com.loiane.estruturadados.vetor;

import java.util.Arrays;

//MUDAREMOS ONDE ANTES ERA VETOR TIPO STRING PARA TIPO OBJECT, QUE É A CLASSE MÃE 

public class VetorGeneralizadoComObject {
	
	private Object[] elementos;
	private int tamanho;//criado com segundo método "adiciona", para controlar o tam real do vetor
	
	//construtor com a capacidade de elementos que queremos criar
	public VetorGeneralizadoComObject(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0; //criado com o segundo método "adiciona"
	}
	
	/*
	public void adiciona(Object elemento) {
		for(int i=0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				//queremos que o cód pare de executar na primeira posição nula que encontrar
				break;
			}
		}
	}*/

	//o problema é que esse método anterior não é muito funcional para casos em que há muitos elementos
	//no vetor, e também caso seja preciso adicionar um elemento na última posição: dai seria
	//preciso iterar o vetor inteiro!
	
	
	public void adiciona(Object elemento) throws Exception {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;//ou seja, onde está tamanho (inicio 0) receberá o elemento
			this.tamanho++;//apos adicionar o elemento no vetor, incrementamos o tamanho (terá sempre o tam real)
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
		}
		
	}
	
	//uma segunda opção seria fazer um metodo com booleano	
	public boolean adicionar(Object elemento) {
		this.aumentaCapacidade();
		if(tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
		
	}
	
	//assunto da aula 7
	//sobrecarregando o método "adicionar"
	//queremos inserir um elemento na primeira posição do vetor, que já tem 5 posições ocupadas e 10 ao todo
	//queremos inserir o A, mas ele já tem B[0], C[1], D[2], E[3], F[5] e G[5]
	//vamos passar cada elemento uma posição adiante, de modo que [0] fique com A
	//o metodo também pode ser "void" para não precisar retornar nada
	public boolean adicionar(int posicao, Object elemento) {
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
	
	
	//assunto da aula 08
	//adicionando capacidade ao vetor
	//como ele será usado apenas internamente pela classe Vetor, ele será "private"
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			//aumentaremos declarando um outro vetor
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for(int i=0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;//atribuindo o novo vetor ao atual
		}
	}
	
	
	
	
	
	
	
	//assunto da aula 5
	//queremos fazer uma busca do elemento por posição
	public Object busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
			throw new IllegalArgumentException("Posição Inválida.");
		}
		return this.elementos[posicao];		
	}
	
	
	//assunto da aula 6
	//usaremos um booleano para identificar se determinado elemento existe ou não na coleção
	//difere do anterior, onde entramos com uma posição e ele mostra o elemento
	//aqui, entramos com o elemento e ele nos retorna se ele existe ou não (boolean) ou ele proprio (int)
	//faremos uma busca sequencial
	/*
	public boolean busca(Object elemento) {
		for(int i=0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return true;
			}			
		}
		return false;				
	}*/
	
	//o código abaixo fica mais elegante do que retornar true or false, pois retorna a propria posição
	public int busca(Object elemento) {
		for(int i=0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}			
		}
		return -1;				
	}
	
	//assunto da aula 09
	//removendo item de qualquer lugar do vetor, empurrando para frente
	//B G D E F => posição a remover é a [1] = G
	//0 1 2 3 4 => 4 posições, mas tamanho é 5
	//vetor[1] = vetor[2]
	//vetor[2] = vetor[3]
	//vetor[3] = vetor[4]
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que não deve, dá exceção
			throw new IllegalArgumentException("Posição Inválida.");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--; //diminui o tam do vetor de 5 para 4 para não considerar o valor que estava em 5 e que não será usado (ficou BDEF-F) 
		
	}
	
	
	
	
	
	
	//aqui, pode-se criar um "get" do tamanho ou criar um método manualmente
	//metodo criado para imprimirmos o tamanho real do vetor, vide Aula04
	public int tamanho() {
		return this.tamanho;
	}
		
	
	
	//método toString apenas para imprimir o vetor na classe Aula03
	//usamos esse mesmo método na classe Aula04, mas o modificamos para que imprima somente
	//os elementos do array, e não todos os elementos, inclusive os nulos
	/*
	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}*/
	
	//Como teremos que iterar o vetor para imprimir somente os elementos não nulos, usaremos a classe
	//StringBuilder para fazer a concatenação
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

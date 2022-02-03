package com.loiane.estruturadados.vetor;

import java.util.Arrays;

//MUDAREMOS ONDE ANTES ERA VETOR TIPO STRING PARA TIPO OBJECT, QUE � A CLASSE M�E 

public class VetorGeneralizadoComObject {
	
	private Object[] elementos;
	private int tamanho;//criado com segundo m�todo "adiciona", para controlar o tam real do vetor
	
	//construtor com a capacidade de elementos que queremos criar
	public VetorGeneralizadoComObject(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0; //criado com o segundo m�todo "adiciona"
	}
	
	/*
	public void adiciona(Object elemento) {
		for(int i=0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				//queremos que o c�d pare de executar na primeira posi��o nula que encontrar
				break;
			}
		}
	}*/

	//o problema � que esse m�todo anterior n�o � muito funcional para casos em que h� muitos elementos
	//no vetor, e tamb�m caso seja preciso adicionar um elemento na �ltima posi��o: dai seria
	//preciso iterar o vetor inteiro!
	
	
	public void adiciona(Object elemento) throws Exception {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;//ou seja, onde est� tamanho (inicio 0) receber� o elemento
			this.tamanho++;//apos adicionar o elemento no vetor, incrementamos o tamanho (ter� sempre o tam real)
		} else {
			throw new Exception("Vetor j� est� cheio, n�o � poss�vel adicionar mais elementos.");
		}
		
	}
	
	//uma segunda op��o seria fazer um metodo com booleano	
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
	//sobrecarregando o m�todo "adicionar"
	//queremos inserir um elemento na primeira posi��o do vetor, que j� tem 5 posi��es ocupadas e 10 ao todo
	//queremos inserir o A, mas ele j� tem B[0], C[1], D[2], E[3], F[5] e G[5]
	//vamos passar cada elemento uma posi��o adiante, de modo que [0] fique com A
	//o metodo tamb�m pode ser "void" para n�o precisar retornar nada
	public boolean adicionar(int posicao, Object elemento) {
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
	
	
	//assunto da aula 08
	//adicionando capacidade ao vetor
	//como ele ser� usado apenas internamente pela classe Vetor, ele ser� "private"
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
	//queremos fazer uma busca do elemento por posi��o
	public Object busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que n�o deve, d� exce��o
			throw new IllegalArgumentException("Posi��o Inv�lida.");
		}
		return this.elementos[posicao];		
	}
	
	
	//assunto da aula 6
	//usaremos um booleano para identificar se determinado elemento existe ou n�o na cole��o
	//difere do anterior, onde entramos com uma posi��o e ele mostra o elemento
	//aqui, entramos com o elemento e ele nos retorna se ele existe ou n�o (boolean) ou ele proprio (int)
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
	
	//o c�digo abaixo fica mais elegante do que retornar true or false, pois retorna a propria posi��o
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
	//B G D E F => posi��o a remover � a [1] = G
	//0 1 2 3 4 => 4 posi��es, mas tamanho � 5
	//vetor[1] = vetor[2]
	//vetor[2] = vetor[3]
	//vetor[3] = vetor[4]
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {//estou negando o que deve acontecer. Se acontecer o que n�o deve, d� exce��o
			throw new IllegalArgumentException("Posi��o Inv�lida.");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--; //diminui o tam do vetor de 5 para 4 para n�o considerar o valor que estava em 5 e que n�o ser� usado (ficou BDEF-F) 
		
	}
	
	
	
	
	
	
	//aqui, pode-se criar um "get" do tamanho ou criar um m�todo manualmente
	//metodo criado para imprimirmos o tamanho real do vetor, vide Aula04
	public int tamanho() {
		return this.tamanho;
	}
		
	
	
	//m�todo toString apenas para imprimir o vetor na classe Aula03
	//usamos esse mesmo m�todo na classe Aula04, mas o modificamos para que imprima somente
	//os elementos do array, e n�o todos os elementos, inclusive os nulos
	/*
	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}*/
	
	//Como teremos que iterar o vetor para imprimir somente os elementos n�o nulos, usaremos a classe
	//StringBuilder para fazer a concatena��o
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

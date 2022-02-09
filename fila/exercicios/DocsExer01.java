package com.loiane.estruturadados.fila.exercicios;

import com.loiane.estruturadados.fila.FilaComPrioridade;
import com.loiane.estruturadados.fila.teste.Paciente;

public class DocsExer01<T> extends FilaComPrioridade<T> implements Comparable<DocsExer01> {

	private String nome;
	private int qtdFolhas;
	
	
	public DocsExer01(String nome, int qtdFolhas) {
		super();
		this.nome = nome;
		this.qtdFolhas = qtdFolhas;
	}


	public DocsExer01() {
		super();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQtdFolhas() {
		return qtdFolhas;
	}


	public void setQtdFolhas(int qtdFolhas) {
		this.qtdFolhas = qtdFolhas;
	}


	@Override
	public String toString() {
		return "DocumentosExercicio01 [nome=" + nome + ", qtdFolhas=" + qtdFolhas + "]";
	}


	@Override
	public int compareTo(DocsExer01 o) {
		
		//aqui diz que se prioridade do paciente 1 > prioridade paciente 2, retorna 1
		if(this.qtdFolhas > o.getQtdFolhas()) {//aqui deveria haver casting, evitamos lá em cima com <>
			return 1;
		//se prioridade do paciente 1 < prioridade paciente 2, retorna -1
		} else if(this.qtdFolhas < o.getQtdFolhas()) {
			return -1;
		}		
		//se forem iguais, retorna 0
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
}

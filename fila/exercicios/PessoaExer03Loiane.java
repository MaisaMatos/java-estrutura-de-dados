package com.loiane.estruturadados.fila.exercicios;

public class PessoaExer03Loiane implements Comparable<PessoaExer03Loiane> {
	
	private String nome;
	private int prioridade;
	
	
	public PessoaExer03Loiane() {
		super();
	}

	public PessoaExer03Loiane(String nome, int prioridade) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	//esse método fará a comparação dos novos pacientes para priorizar na fila
	@Override
	public int compareTo(PessoaExer03Loiane o) {
		
		if(prioridade > o.prioridade) {
			return 1;
		} else if(prioridade < o.prioridade) {
			return -1;
		}		
		return 0;
	}

	@Override
	public String toString() {
		return "PessoaExer03Loiane [nome=" + nome + ", prioridade=" + prioridade + "]";
	}
	
	
	
	
	
	

}

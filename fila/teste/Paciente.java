package com.loiane.estruturadados.fila.teste;

public class Paciente implements Comparable<Paciente> {//colocar diamante com o tipo aqui evita casting
	
	private String nome;
	private int prioridade;
		
	public Paciente(String nome, int prioridade) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	
	public Paciente() {
		super();
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

	
	/* Interface Comparable
	 * implementa o método "compareTo(Object o)"
	 * se objeto1 > objeto2, retorna um número > 0 (geralmente 1)
	 * se objeto1 < objeto2, retorna um número < 0 (geralmente -1)
	 * se objeto1 = objeto2, retorna 0
	 */


	@Override
	public int compareTo(Paciente o) {
		
		//aqui diz que se prioridade do paciente 1 > prioridade paciente 2, retorna 1
		if(this.prioridade > o.getPrioridade()) {//aqui deveria haver casting, evitamos lá em cima com <>
			return 1;
		//se prioridade do paciente 1 < prioridade paciente 2, retorna -1
		} else if(this.prioridade < o.getPrioridade()) {
			return -1;
		}		
		//se forem iguais, retorna 0
		return 0;
	}


	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", prioridade=" + prioridade + "]";
	}
	
	
	

}

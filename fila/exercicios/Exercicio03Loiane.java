package com.loiane.estruturadados.fila.exercicios;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Exercicio03Loiane {

	//aqui, pode-se criar um Enum ou Constante, como foi o caso abaixo
	public static final int VERDE = 2;
	public static final int AMARELO = 1;
	public static final int VERMELHO = 0;

	public static void main(String[] args) {
		
		FilaComPrioridade<PessoaExer03Loiane> fila = new FilaComPrioridade<>();
		
		//aqui, o método "enfileira" já faz a prioridade, pois usamos a classe FilaComPrioridade,
		//que tem esse método.
		fila.enfileira(new PessoaExer03Loiane("1", VERDE));
		fila.enfileira(new PessoaExer03Loiane("2", AMARELO));
		fila.enfileira(new PessoaExer03Loiane("3", VERMELHO));
		fila.enfileira(new PessoaExer03Loiane("4", VERDE));
		fila.enfileira(new PessoaExer03Loiane("5", VERDE));
		fila.enfileira(new PessoaExer03Loiane("6", VERMELHO));
		
		//instanciando a classe PSAtendimento para iniciar o atendimento das pessoas da fila acima		
		ProntoSocAtendExer03Loiane atendimento = new ProntoSocAtendExer03Loiane(fila);
		
		//instanciando a classe PSNovosPacientes para iniciar o atendimento dos aleatórios
		ProntoSocNovosPaciExer03Loiane pacientes = new ProntoSocNovosPaciExer03Loiane(fila);
		
		//o atendimento das pessoas enfileiradas lá em cimamserá feito com intervalo de
		//5 segundos entre cada um (vide classe PSAtendimento)		
		Thread t1 = new Thread(atendimento);
		
		//atendimento das pessoas com senhas aleatórias (novos pacientes)
		//8 segundos de intervalo 
		Thread t2 = new Thread(pacientes);
		
		//com o código abaixo, dá-se início ao atendimento dos pacientes enfileirados e dos novos
		t1.start();
		t2.start();

	}

}

package com.loiane.estruturadados.fila.exercicios;

import java.util.Random;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class ProntoSocNovosPaciExer03Loiane implements Runnable {
	
	private FilaComPrioridade<PessoaExer03Loiane> fila;
	private int cont = 7; //terminamos atendimento pronto socorro com 6 pacientes, inicia aqui com 7
						  //precisamos de um contador para os 8 novos pacientes
						  //começa no 7 e vai até 14
	private Random prioridade = new Random(); //para fazer a prioridade aleatória
	
	
	public ProntoSocNovosPaciExer03Loiane(FilaComPrioridade<PessoaExer03Loiane> fila) {
		super();
		this.fila = fila;
	}
	

	@Override
	public void run() {
		//para limitar a qtd de pessoas q serem adicionadas na fila, colocaremos um numero aleatorio: 8
		for(int i=0; i < 8; i++) {
			try {
				Thread.sleep(8000);
				PessoaExer03Loiane p = new PessoaExer03Loiane("" + cont, prioridade.nextInt(3));
				//esta linha acima com o "p" foi feita somente para conseguirmos imprimir a informação
				fila.enfileira(p); 
				//acima, cód. da prioridade aleatória!
				//como queremos os números 0, 1 ou 2, usaremos o 3 pq nextInt não inclui o 3
				cont++; //contador para não ultrapassar as 8 pessoas (do 7 ao 14)
				System.out.println(p + " enfileirada.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

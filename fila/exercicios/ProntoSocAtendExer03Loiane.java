package com.loiane.estruturadados.fila.exercicios;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class ProntoSocAtendExer03Loiane implements Runnable {
	
	private FilaComPrioridade<PessoaExer03Loiane> fila;
	
	
	public ProntoSocAtendExer03Loiane(FilaComPrioridade<PessoaExer03Loiane> fila) {
		super();
		this.fila = fila;
	}


	@Override
	public void run() {
		
		while(!fila.estaVazia()) {
			
			try {
				System.out.println(fila.desenfileira1() + " atendida.");
				Thread.sleep(5000); //aguarda 5 segundos entre atender uma pessoa e outra
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Atendimento concluído.");
		
	}
	
	

}

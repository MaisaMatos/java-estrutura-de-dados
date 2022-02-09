package com.loiane.estruturadados.fila.exercicios;

import com.loiane.estruturadados.fila.Fila;

/* Utilize a classe Fila para similar um sistema de senhas de um pronto socorro.
 * Cada pessoa pode ser classificada com 3 códigos: vermelho (prioridade maior), 
 * amarelo (prioridade média) e verde (quando não é grave). O programa deve obedecer o seguinte:
 * - enfileire 6 pessoas na fila inicial;
 * - pessoas com prioridade vermelha devem ser atendidas primeiro;
 * - cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado
 * - a cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatória 
 * (crie um código Java para criar a aleatoriedade)
 */

public class Exercicio03 {

	public static void main(String[] args) {
		
		Fila<String> vermelho = new Fila<>();
		Fila<String> amarelo = new Fila<>();
		Fila<String> verde = new Fila<>();
		
		verde.enfileira("Pessoa 1 verde");
		amarelo.enfileira("Pessoa 1 amarelo");
		vermelho.enfileira("Pessoa 1 vermelho");
		amarelo.enfileira("Pessoa 2 amarelo");
		vermelho.enfileira("Pessoa 2 vermelho");
		verde.enfileira("Pessoa 2 verde");
		
		while(!verde.estaVazia() || !amarelo.estaVazia() || vermelho.estaVazia()) {			
			
			while(!vermelho.estaVazia()) {
				atendePessoa(vermelho);
				
			}
			
			while(!amarelo.estaVazia()) {
				atendePessoa(amarelo);
			}
			
			if(!verde.estaVazia()) {
				atendePessoa(verde);
			}
			
			if(vermelho.estaVazia() && amarelo.estaVazia()) {
				while(!verde.estaVazia()) {
					atendePessoa(verde);
				}
			}
			
		}		

	}

	
	public static void atendePessoa(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileira1();
		System.out.println(pessoaAtendida + " foi atendida.");
	}
	
}

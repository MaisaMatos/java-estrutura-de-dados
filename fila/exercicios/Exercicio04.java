package com.loiane.estruturadados.fila.exercicios;

import java.util.Random;

import com.loiane.estruturadados.fila.Fila;

/*Escreva um programa usando Filas que simule a brincadeira da "Batata Quente". Ela consiste em
 * um grupo de crian�as que fica em c�rculo , sentados ou em p�. Uma crian�a fica fora da roda,
 * de costas ou com os olhos vendados, dizendo a frase: "Batata quente, quente, quente... queimou!"
 * Enquanto isso, os demais v�o passando a bola de m�o em m�o at� ouvirem a palavra "queimou". 
 * Quem estiver com a bola nesse momento, sai da roda. Ganha o �ltimo que sobrar.
 */

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		//qtd de crian�as: 10
		for(int i=0; i < 10; i++) {
			fila.enfileira(i);
		}
				
		Random aleatorio = new Random();
		
		int num = 0;
		
		while(num == 0) {
			num = aleatorio.nextInt(10);
		}
		
		System.out.println("O n�mero no qual caiu a batata quente �: " + num);
		
		while(fila.tamanho() > 1) {
			for(int i=0; i < num; i++) {
				//passou a bola pra frente, desenfileirou a pessoa
				//estamos fazendo uma fila circular: sai do in�cio e volta pro final da fila
				fila.enfileira(fila.desenfileira1());
			}
			System.out.println("Eliminado: " + fila.desenfileira1());
			
		}
		
		System.out.println("Ganhador: " + fila.desenfileira1());
	}
	
	/*pessoas na fila
	 * 0 1 2 3 4 5 6 7 8 9
	 * Caiu a batata no 5
	 * 6 7 8 9 0 1 2 3 4 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 1
	 * 2 3 4 6 7 8 9 0 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 8
	 * 9 0 2 3 4 6 7 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 6
	 * 7 9 0 2 3 4 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 4
	 * 7 9 0 2 3 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 7
	 * 9 0 2 3 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 0
	 * 2 3 9 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 9
	 * 2 3 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 * Caiu o n�mero 3
	 * 2 os numeros antes do dele vieram para o fim da fila e ele foi eliminado
	 */
	
	
}

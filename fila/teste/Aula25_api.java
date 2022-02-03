package com.loiane.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25_api {

	public static void main(String[] args) {
		
		Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();
		
		filaComPrioridade.add(2);
		filaComPrioridade.add(1);
		filaComPrioridade.add(4);
		filaComPrioridade.add(3);
		
		//ao inserir o numero 3, não está funcionando a prioridade!!!
		
		System.out.println(filaComPrioridade);
		
		Queue<Paciente> filaComPrioridade1 = new PriorityQueue<>(
				new Comparator<Paciente>() {

					@Override
					public int compare(Paciente p1, Paciente p2) {
						//outra forma de fazer o compareTo difefente da que está em "Paciente"
						return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
					}
					
				}
		);
		
		filaComPrioridade1.add(new Paciente("C", 3));
		filaComPrioridade1.add(new Paciente("A", 2));
		filaComPrioridade1.add(new Paciente("B", 1));
		
		
		System.out.println(filaComPrioridade1);

	}

}

package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<Integer>();
		
	
		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(2);
		fila.enfileira(5);
		fila.enfileira(7);
		fila.enfileira(9);
		fila.enfileira(4);
		fila.enfileira(8);
		fila.enfileira(10);
		fila.enfileira(6);
		
		System.out.println(fila);//enumeramos fora de ordem, mas mesmo assim imprime ordenado devido ao método

		
		FilaComPrioridade<Paciente> fila1 = new FilaComPrioridade<Paciente>();
		
		fila1.enfileira(new Paciente("A",2));//paciente A com prioridade 2
		fila1.enfileira(new Paciente("C",1));
		fila1.enfileira(new Paciente("B",3));
		
		System.out.println(fila1);
		
		fila1.desenfileira();
		
		System.out.println(fila1);
	}

}

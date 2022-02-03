package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12ArrayList {

	public static void main(String[] args) {
		
		//os parenteses ao final, onde antes colocamos a capacidade do vetor, aqui pode até ficar vazio
		//porque o ArrayList aumenta de tamanho conforme necessidade
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		//agora queremos adicionar o elemento "B" no index 1
		//isso é similar ao método "adicionar" que criamos nas aulas anteriores
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//metodo de busca é o contains
		//similar ao método de busca das aulas anteriores, mas o que traz true or false
		boolean existe = arrayList.contains("A");//veja na doc que ele retorna true or false
		if(existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		//esse é similar ao busca que traz o índice
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		//busca por posição é através do método "get"
		System.out.println(arrayList.get(2)); //saída elemento C, se não existe dá uma exceção
		
		//metodo remove
		//pode ser por índice ou por objeto
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);//imprime só o C, que foi o que restou
		
		//metodo que imprime tamanho
		System.out.println(arrayList.size());//vai sair 1 porque só tem o C
		
		arrayList.add(0, "A");
		arrayList.add(1, "B");
		System.out.println(arrayList);
		
		System.out.println(arrayList.lastIndexOf("D"));
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
	}

}

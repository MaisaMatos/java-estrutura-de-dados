package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12ArrayList {

	public static void main(String[] args) {
		
		//os parenteses ao final, onde antes colocamos a capacidade do vetor, aqui pode at� ficar vazio
		//porque o ArrayList aumenta de tamanho conforme necessidade
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		//agora queremos adicionar o elemento "B" no index 1
		//isso � similar ao m�todo "adicionar" que criamos nas aulas anteriores
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//metodo de busca � o contains
		//similar ao m�todo de busca das aulas anteriores, mas o que traz true or false
		boolean existe = arrayList.contains("A");//veja na doc que ele retorna true or false
		if(existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento n�o existe no array");
		}
		
		//esse � similar ao busca que traz o �ndice
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento n�o existe no array");
		}
		
		//busca por posi��o � atrav�s do m�todo "get"
		System.out.println(arrayList.get(2)); //sa�da elemento C, se n�o existe d� uma exce��o
		
		//metodo remove
		//pode ser por �ndice ou por objeto
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);//imprime s� o C, que foi o que restou
		
		//metodo que imprime tamanho
		System.out.println(arrayList.size());//vai sair 1 porque s� tem o C
		
		arrayList.add(0, "A");
		arrayList.add(1, "B");
		System.out.println(arrayList);
		
		System.out.println(arrayList.lastIndexOf("D"));
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
	}

}

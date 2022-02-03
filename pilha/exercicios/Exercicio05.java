package com.loiane.estruturadados.pilha.exercicios;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import com.loiane.estruturadados.pilha.Pilha;

/*Escreva um programa que testa se uma sequ�ncia de caracteres fornecida pelo usu�rio � um pal�ndromo,
 * ou seja, � uma palavra cuja primeira metade 	� sim�trica � segunda metade. Exemplos:
 * AABCCBAA = pal�ndromo
 * ADDFDDA = pal�ndromo
 * ABFFBB = n�o � pal�ndromo
 */

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma palavra ou sequ�ncia de caracteres para ver se � um pal�ndromo: ");
		String palavra = scan.next();
		
		imprimeResultado(palavra);		
		
		scan.close();		

	}
	
	
	public static void imprimeResultado(String palavra) {
		
		System.out.println(palavra + " � pal�ndromo? " + testaPalindromo(palavra));
		
	}
	
	
	public static boolean testaPalindromo(String palavra) {
		
		Pilha<Character> pilha = new Pilha<Character>();
		
		for(int i=0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));			
		}
		System.out.println(palavra);
		
		String palavraInversa  = "";
		
		while(!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}
		System.out.println(palavraInversa);
		
		if(palavraInversa.equalsIgnoreCase(palavra)){
			return true;
		}
		
		return false;
	}

}

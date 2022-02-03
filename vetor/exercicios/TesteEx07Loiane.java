package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.loiane.estruturadados.vetor.exercicios.ContatoEx06;

public class TesteEx07Loiane extends TesteEx06Loiane {

	public static void main(String[] args) {	
		
		
		//criação das variáveis
		Scanner scan = new Scanner(System.in);
		
		//criar vetor com capacidade para 20 elementos
		ArrayList<ContatoEx06> lista = new ArrayList<ContatoEx06>(20);
		
		//criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);
		
		//criar um menu para que o usuário escolha a opção
		int opcao = 1;
		
		while(opcao != 0) {
			
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);;
				break;
			case 4:
				obtemContato(scan, lista);;
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimeTamanhoArrayList(lista);
				break;
			case 10:
				limparArrayList(lista);
				break;
			case 11:
				imprimirArrayList(lista);
				break;


			default:
				break;
			}
			
			
			
		}
		
		System.out.println("Usuário digitou 0, programa finalizado.");
		
		
		
		
		scan.close();
		
	}
	
	//o "static" é porque chamaremos esses métodos dentro do "main", que é estático
		
	private static void imprimirArrayList(ArrayList<ContatoEx06> lista) {		
				
		System.out.println(lista);
	}
	
	
	private static void limparArrayList(ArrayList<ContatoEx06> lista) {		
		lista.clear();;		
		System.out.println("Todos os contatos da lista foram excluídos");
	}
	
	
	private static void imprimeTamanhoArrayList(ArrayList<ContatoEx06> lista) {
		System.out.println("Tamanho da lista é de: " + lista.size());
	}
	
	
	private static void excluirContato(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser removida", scan);
		
		try {
			
			ContatoEx06 contato = lista.get(pos);
			lista.remove(contato);	
			System.out.println("Contato excluído.");
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}


	private static void excluirPorPosicao(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser removida", scan);
		
		try {
			
			lista.remove(pos);
			System.out.println("Contato excluído.");
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	
	private static void pesquisarContatoExiste(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser pesquisada", scan);
		
		try {
			
			ContatoEx06 contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			boolean existe = lista.contains(contato);
			if(existe) {
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe.");
			}
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	
	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com o último índice a ser pesquisado", scan);
		
		try {
			
			ContatoEx06 contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
			pos = lista.lastIndexOf(contato);
			
			System.out.println("Contato encontrado na posição " + pos);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	
	private static void obtemContato(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser pesquisada", scan);
		
		try {
			
			ContatoEx06 contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = lista.indexOf(contato);
			
			System.out.println("Contato encontrado na posição " + pos);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	
	private static void obtemContatoPosicao(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
		
		try {
			
			ContatoEx06 contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	
	private static void adicionarContatoFinal(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = leInformacao("Entre com o nome:" , scan);
		String telefone = leInformacao("Entre com o telefone: ", scan);
		String email = leInformacao("Entre com o email", scan);
		
		ContatoEx06 contato = new ContatoEx06(nome, telefone, email);
		
		lista.add(contato);
		
		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);
	}
	
	
	private static void adicionarContatoPosicao(Scanner scan, ArrayList<ContatoEx06> lista) {
		
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = leInformacao("Entre com o nome:" , scan);
		String telefone = leInformacao("Entre com o telefone: ", scan);
		String email = leInformacao("Entre com o email", scan);
		
		ContatoEx06 contato = new ContatoEx06(nome, telefone, email);
		
		int pos = leInformacaoInt("Entre com a posição da lista a adiconar o contato", scan);
		
		try {
			lista.add(contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
			
			
		} catch (Exception e) {
			System.out.println("Não adicionado.");
		}	
		
	}
	
		
	//este método cria a quantidade de contatos que você quiser!
	private static void criarContatosDinamicamente(int quantidade, ArrayList<ContatoEx06> lista) {
		
		ContatoEx06 contato;
		
		for(int i=1; i <= quantidade; i++) {
			
			contato = new ContatoEx06();
			contato.setNome("contato" + i);
			contato.setTelefone("1111-111" + i);
			contato.setEmail("contato"+i+"@email.com");
			
			lista.add(contato);;
			
		}
	}

}

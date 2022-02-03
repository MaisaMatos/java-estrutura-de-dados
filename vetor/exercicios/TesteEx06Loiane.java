package com.loiane.estruturadados.vetor.exercicios;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.teste.Contato;

public class TesteEx06Loiane {

	public static void main(String[] args) {
		
		
		
		//criação das variáveis
		Scanner scan = new Scanner(System.in);
		
		//criar vetor com capacidade para 20 elementos
		VetorListaEx06Loiane<ContatoEx06> lista = new VetorListaEx06Loiane<ContatoEx06>(20);
		
		//criar e adicionar 30 contatos
		//criarContatosDinamicamente(5, lista);
		
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
				imprimeTamanhoLista(lista);
				break;
			case 10:
				limparLista(lista);
				break;
			case 11:
				imprimirLista(lista);
				break;


			default:
				break;
			}
			
			
			
		}
		
		System.out.println("Usuário digitou 0, programa finalizado.");
		
		
		
		
		scan.close();
		
	}
	
	//o "static" é porque chamaremos esses métodos dentro do "main", que é estático
		
	private static void imprimirLista(VetorListaEx06Loiane<ContatoEx06> lista) {		
				
		System.out.println(lista);
	}
	
	
	private static void limparLista(VetorListaEx06Loiane<ContatoEx06> lista) {		
		lista.limpar2();		
		System.out.println("Todos os contatos da lista foram excluídos");
	}
	
	
	private static void imprimeTamanhoLista(VetorListaEx06Loiane<ContatoEx06> lista) {
		System.out.println("Tamanho da lista é de: " + lista.tamanho());
	}
	
	
	private static void excluirContato(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser removida", scan);
		
		try {
			
			ContatoEx06 contato = lista.busca(pos);
			lista.remove(contato);	
			System.out.println("Contato excluído.");
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}


	private static void excluirPorPosicao(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser removida", scan);
		
		try {
			
			lista.remove(pos);
			System.out.println("Contato excluído.");
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	
	private static void pesquisarContatoExiste(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser pesquisada", scan);
		
		try {
			
			ContatoEx06 contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			boolean existe = lista.contem1(contato);
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

	
	private static void pesquisarUltimoIndice(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com o último índice a ser pesquisado", scan);
		
		try {
			
			ContatoEx06 contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
			pos = lista.ultimoIndice(contato);
			
			System.out.println("Contato encontrado na posição " + pos);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	
	private static void obtemContato(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a informação a ser pesquisada", scan);
		
		try {
			
			ContatoEx06 contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = lista.busca(contato);
			
			System.out.println("Contato encontrado na posição " + pos);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	
	private static void obtemContatoPosicao(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
		
		try {
			
			ContatoEx06 contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	
	private static void adicionarContatoFinal(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = leInformacao("Entre com o nome:" , scan);
		String telefone = leInformacao("Entre com o telefone: ", scan);
		String email = leInformacao("Entre com o email", scan);
		
		ContatoEx06 contato = new ContatoEx06(nome, telefone, email);
		
		lista.adicionar(contato);
		
		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);
	}
	
	
	private static void adicionarContatoPosicao(Scanner scan, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = leInformacao("Entre com o nome:" , scan);
		String telefone = leInformacao("Entre com o telefone: ", scan);
		String email = leInformacao("Entre com o email", scan);
		
		ContatoEx06 contato = new ContatoEx06(nome, telefone, email);
		
		int pos = leInformacaoInt("Entre com a posição da lista a adiconar o contato", scan);
		
		try {
			lista.adicionar(contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
			
			
		} catch (Exception e) {
			System.out.println("Não adicionado.");
		}	
		
	}
	
	
	protected static String leInformacao(String msg, Scanner scan) {
		
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	
	protected static int leInformacaoInt(String msg, Scanner scan) {
		
		boolean entradaValida = false;
		int num = 0;
		
		while(!entradaValida) {
			
			try {
				System.out.println(msg);
				String entrada = scan.nextLine();
				
				num = Integer.parseInt(entrada);
				
				entradaValida = true;
				
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente.");
			}
			
		}		
		
		return num;
	}
	
	
	protected static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		
		int opcao = 0;
		
		String entrada;
		
		while(!entradaValida) {
			
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: adiciona contato ao final da lista");
			System.out.println("2: adiciona contato em uma posição específica da lista");
			System.out.println("3: busca contato de uma posição específica da lista");
			System.out.println("4: consulta contato");
			System.out.println("5: consulta último índice do contato");
			System.out.println("6: verifica se contato existe");
			System.out.println("7: remove por posição na lista");
			System.out.println("8: excluir contato");
			System.out.println("9: verifica tamanho da lista");
			System.out.println("10: excluir todos os contatos da lista");
			System.out.println("11: imprime lista");
			System.out.println("0: sair");	
			
			try {
				
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao >= 1 && opcao <= 11) {
					entradaValida = true;					
				} else {
					throw new Exception();
				}
				
			} catch (Exception e) {
				
				System.out.println("Entrada inválida, digite novamente.\n\n");
				
			}
			
		}
		
		return opcao;		
		
	}
	
	//este método cria a quantidade de contatos que você quiser!
	protected static void criarContatosDinamicamente(int quantidade, VetorListaEx06Loiane<ContatoEx06> lista) {
		
		ContatoEx06 contato;
		
		for(int i=1; i <= quantidade; i++) {
			
			contato = new ContatoEx06();
			contato.setNome("contato" + i);
			contato.setTelefone("1111-111" + i);
			contato.setEmail("contato"+i+"@email.com");
			
			lista.adicionar(contato);;
			
		}
	}

}

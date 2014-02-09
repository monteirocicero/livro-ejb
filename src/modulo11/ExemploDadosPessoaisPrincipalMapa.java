package modulo11;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExemploDadosPessoaisPrincipalMapa {
	
	private Map<String, ExemploDadosPessoais> mapaOrdenado = new TreeMap<String, ExemploDadosPessoais>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploDadosPessoaisPrincipalMapa obj = new ExemploDadosPessoaisPrincipalMapa();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Cadastrar.");
			System.out.println("2 - Listar vetor");
			System.out.println("9 - Sair.");
			System.out.println("Entre com uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				obj.cadastrar();
				break;
			case 2:
				obj.listar();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}
	
	private void cadastrar() {
		try {
			ExemploDadosPessoais obj = new ExemploDadosPessoais();
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre com nome:");
			String nome = sc.nextLine();
			System.out.println("Entre com o telefone:");
			String telefone = sc.nextLine();
			System.out.println("Entre com a idade");
			int idade = sc.nextInt();
			obj.setIdade(idade);
			obj.setNome(nome);
			obj.setTelefone(telefone);
			mapaOrdenado.put(nome, obj);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage() + "\n");
		}
	}

	private void listar() {
		Iterator<String> it = mapaOrdenado.keySet().iterator();
		if (it.hasNext() == false) {
			System.out.println("Nenhuma informação cadastrada.");
		} else {
			System.out.println("\nDados Cadastrados");
			while (it.hasNext()) {
				ExemploDadosPessoais obj = mapaOrdenado.get(it.next());
				System.out.println("\n***************************");
				System.out.println("Nome: " + obj.getNome());
				System.out.println("Idade: " + obj.getIdade());
				System.out.println("Telefone: " + obj.getTelefone());
				System.out.println("****************************");
			}
		}
	}

}

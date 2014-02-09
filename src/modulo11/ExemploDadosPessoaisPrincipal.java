package modulo11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploDadosPessoaisPrincipal {
	
	private SortedSet<ExemploDadosPessoais> conjOrdenado = new TreeSet<ExemploDadosPessoais>();
	private ExemploDadosPessoais obj = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploDadosPessoaisPrincipal obj = new ExemploDadosPessoaisPrincipal();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar dados");
			System.out.println("9 - Sair");
			System.out.print("Entre com uma opção: ");
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
				System.out.println("Opção inválida");
			}
		}
	}
	
	private void cadastrar() {
		try {
			obj = new ExemploDadosPessoais();
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre com nome:");
			String nome = sc.nextLine();
			System.out.println("Entre com o telefone:");
			String telefone = sc.nextLine();
			System.out.println("Entre com a idade:");
			int idade = sc.nextInt();
			obj.setIdade(idade);
			obj.setNome(nome);
			obj.setTelefone(telefone);
			conjOrdenado.add(obj);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage() + "\n");
		}
		
	}

	private void listar() {
		Iterator<ExemploDadosPessoais> it = conjOrdenado.iterator();
		if (it.hasNext() == false) {
			System.out.println("Nenhuma informação cadastrada.");
		} else {
			System.out.println("\nDados Cadastrados");
			while (it.hasNext()) {
				ExemploDadosPessoais obj = it.next();
				System.out.println("***********************");
				System.out.println("Nome: " + obj.getNome());
				System.out.println("Idade: " + obj.getIdade());
				System.out.println("Telefone: " + obj.getTelefone());
				System.out.println("***********************");
			}
		}
	}


}

package modulo11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploCarroPrincipal {
	
	SortedSet<ExemploCarro> setCarro = new TreeSet<ExemploCarro>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploCarroPrincipal obj = new ExemploCarroPrincipal();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Cadastrar Carro");
			System.out.println("2 - Imprimir Carro");
			System.out.println("9 - Fim");
			System.out.println("Entre com uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				obj.cadastrar();
				break;
			case 2:
				obj.imprimir();
				break;
			case 9: System.exit(0);
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	private void cadastrar() {
		ExemploCarro carro = new ExemploCarro();
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		System.out.print("Entre com o número do chassi (numérico): ");
		carro.setChassi(sc.nextInt());
		String dtFabricacao;
		do {
			do {
				System.out.println("Entre com a data de fabricação (AAAA/MM/DD): ");
				dtFabricacao = sc.next();
			} while (dtFabricacao.length() != 10);
		} while ((dtFabricacao.toCharArray())[4] != '/' || (dtFabricacao.toCharArray())[7] != '/');
		carro.setDtFabricacao(dtFabricacao);
		System.out.println("Entre com o nome do fabricante: ");
		carro.setFabricante(sc.next());
		System.out.println("Entre com marca do carro: ");
		carro.setMarca(sc.next());
		setCarro.add(carro);
	}

	private void imprimir() {
		Iterator<ExemploCarro> it = setCarro.iterator();
		while (it.hasNext()) {
			ExemploCarro carro = it.next();
			System.out.println("\n**************************************");
			System.out.println("Chassi: " + carro.getChassi());
			System.out.println("Marca: " + carro.getMarca());
			System.out.println("Fabricante: " + carro.getFabricante());
			String[] data = (carro.getDtFabricacao()).split("/");
			System.out.println("Data Fabricação: (DD/MM/AAAA): ");
			System.out.print(data[2] + "/");
			System.out.print(data[1] + "/");
			System.out.println(data[0]);
			System.out.println("****************************************");
			
		}
	}

}

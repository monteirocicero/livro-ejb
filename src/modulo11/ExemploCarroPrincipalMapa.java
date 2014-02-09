package modulo11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ExemploCarroPrincipalMapa {
	
	private Map<Integer, ExemploCarro> mapaCarro = new HashMap<Integer, ExemploCarro>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploCarroPrincipalMapa obj = new ExemploCarroPrincipalMapa();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Cadastar Carro");
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
			case 9:
				System.exit(0);
			default:
					System.out.println("Opção inválida.");
			}
		}
	}

	private void cadastrar() {
		ExemploCarro carro = new ExemploCarro();
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		System.out.print("Entre com o número do chassi (númerico): ");
		carro.setChassi(sc.nextInt());
		String dtFabricacao;
		do {
			do {
				System.out.print("Entre com a data de fabricação (AAAA/MM/DD): ");
				dtFabricacao = sc.next();
			} while (dtFabricacao.length() != 10);
		} while ((dtFabricacao.toCharArray())[4] != '/' || (dtFabricacao.toCharArray())[7] != '/');
		carro.setDtFabricacao(dtFabricacao);
		System.out.println("Entre com o nome do fabricante: ");
		carro.setFabricante(sc.next());
		System.out.println("Entre com marca do carro: ");
		carro.setMarca(sc.next());
		mapaCarro.put(carro.getChassi(), carro);
	}

	private void imprimir() {
		Iterator<Integer> it = mapaCarro.keySet().iterator();
		while (it.hasNext()) {
			ExemploCarro carro = mapaCarro.get(it.next());
			System.out.println("\n*********************************");
			System.out.println("Chassi: " + carro.getChassi());
			System.out.println("Marca: " + carro.getMarca());
			System.out.println("Fabricante: " + carro.getFabricante());
			String[] data = (carro.getDtFabricacao()).split("/");
			System.out.print("Data Fabricaçao (DD/MM/AAAA): ");
			System.out.print(data[2] + "/");
			System.out.print(data[1] + "/");
			System.out.println(data[0]);
			System.out.println("**********************************");
		}
	}

}

package modulo11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class ExemploProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploProperties x = new ExemploProperties();
		String arquivo = "dadosautor.properties";
		Properties prop = x.carregarPropriedade(arquivo);
		int opcao = 0;
		while (opcao != 9) {
			System.out.println("Entre com a opção desejada");
			System.out.println("1 - Imprimir Properties");
			System.out.println("2 - Adicionar elemento");
			System.out.println("3 - Remover elemento");
			System.out.println("9 - Fim");
			System.out.println("Opção : ");
			Scanner scan = new Scanner(System.in);
			opcao = scan.nextInt();
			try {
				switch (opcao) {
				case 1:
					x.imprimir(prop);
					break;
				case 2:
					System.out.println();
					System.out.println("Digite a chave: ");
					scan = new Scanner(System.in);
					String chave = scan.nextLine();
					System.out.println("Digite o valor");
					String valor = scan.nextLine();
					x.incluirPropriedade(chave, valor, prop);
					x.salvar(prop, arquivo);
					break;
				case 3:
					System.out.println();
					scan = new Scanner(System.in);
					System.out.println("Digite a chave: ");
					chave = scan.nextLine();
					x.removerPropriedade(chave, prop);
					x.salvar(prop, arquivo);
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("Opção inválida. Reentre.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private Properties carregarPropriedade(String arq) {
		Properties prop = null;
		try {
			prop = new Properties();
			FileInputStream arqConf = new FileInputStream(arq);
			prop.load(arqConf);
		} catch (Exception e) {
			System.out.println("Arquivo inexistente.");
			try {
				new FileOutputStream(arq);
				System.out.println("Arquivo criado com sucesso.");
			} catch (FileNotFoundException e2) {
				System.out.println("Não foi possível criar o arquivo.");
			}
		}
		return prop;
	}
	
	private void imprimir(Properties prop) {
		Enumeration<?> e = prop.propertyNames();
		if (e.hasMoreElements() == false) {
			System.out.println("\nNenhuma propriedade cadastrada.\n");
		} else {
			System.out.println("\nPropriedades cadastradas:");
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String value = prop.getProperty(name);
				System.out.println(name + ": " + value);
			}
			System.out.println();
		}
	}
	
	private Properties incluirPropriedade(String chave, String valor, Properties prop) {
		prop.setProperty(chave, valor);
		return prop;
	}

	private Properties removerPropriedade(String chave, Properties prop) {
		prop.remove(chave);
		return prop;
	}

	private void salvar(Map prop, String destino) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(destino);
			Set<String> valores = prop.keySet();
			for (String valor : valores) {
				fw.write(valor + "=" + prop.get(valor) + System.getProperty("line.separator"));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Exceção do tipo: FileNotFoundException");
			System.out.println("Mensagem: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exceção do tipo: IOException");
			System.out.println("Mensagem: " + e.getMessage());
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e2) {
				System.out.println("Exceção do tipo: IOException");
				System.out.println("Mensagem: " +  e2.getMessage());
			}
		}
	}

}




package modulo13;

import java.lang.annotation.Annotation;
import java.util.Scanner;

public class FullValueProcessar {
	
	public static String processarAnotacoes(FullValueAbstractItem objeto) {
		StringBuffer valorDeRetorno = new StringBuffer();
		FullValueAnnotationSuper tabelaSuper;
		FullValueAnnotationSub tabelaSub;
		for (Annotation anotacao : objeto.getClass().getAnnotations()) {
			if (anotacao instanceof FullValueAnnotationSuper) {
				tabelaSuper = (FullValueAnnotationSuper) anotacao;
				valorDeRetorno.append("A classe ");
				valorDeRetorno.append(objeto.getClass().getGenericSuperclass().toString());
				valorDeRetorno.append(" sera mapeada para a tabela ");
				valorDeRetorno.append(tabelaSuper.nomeTabela());
				valorDeRetorno.append(" com as seguintes colunas:\n");
				for (String coluna : tabelaSuper.colunas()) {
					valorDeRetorno.append("| ");
					valorDeRetorno.append(coluna);
					valorDeRetorno.append(" |");
					valorDeRetorno.append("\n");
				}
			}
			if (anotacao instanceof FullValueAnnotationSub) {
				tabelaSub = (FullValueAnnotationSub) anotacao;
				valorDeRetorno.append("A classe ");
				valorDeRetorno.append(objeto.getClass().getName());
				valorDeRetorno.append(" sera mapeada para a tabela ");
				valorDeRetorno.append(tabelaSub.nomeTabela());
				valorDeRetorno.append(" com as seguintes colunas:\n");
				for (String coluna : tabelaSub.colunas()) {
					valorDeRetorno.append("| ");
					valorDeRetorno.append(coluna);
					valorDeRetorno.append(" |");
					valorDeRetorno.append("\n");
				}
			}
		}
		return valorDeRetorno.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcao;
		FullValueAbstractItem item = null;
		while (true) {
			try {
				System.out.println("Entre com a opção desejada");
				System.out.println("1 - Fita");
				System.out.println("2 - Livro");
				System.out.println("9 - Fim");
				System.out.println("Opção: ");
				Scanner scan = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
				opcao = scan.nextInt();
				switch (opcao) {
				case 1:
					item = new FullValueFita();
					break;
				case 2:
					item = new FullValueLivro();
					break;
				case 9:
					System.exit(0);
				}
				System.out.println(processarAnotacoes(item));
			} catch (NullPointerException e) {
				System.out.println("Opção invalida");
			}
		}
		
	}

}

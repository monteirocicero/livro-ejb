package modulo12;

public class ExemploListaGenericaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ExemploListaGenericaPrincipal().processar();
	}

	private void processar() {
		ExemploListaGenerica<String> obj = new ExemploListaGenerica<String>();
		montarListaStrings(obj);
		if (obj.verificarConteudo("Livro de Java")) {
			System.out.println("A string pesquisada esta contida na lista.");
		} else {
			System.out.println("String não encontrada.");
		}
		ExemploListaGenerica<Integer> obj1 = new ExemploListaGenerica<Integer>();
		montarListaInteger(obj1);
		if (obj1.verificarConteudo(27091974)) {
			System.out.println("O Integer pesquisado esta contido na lista.");
		} else {
			System.out.println("Número não encontado.");
		}
		System.out.println();
	}

	private void montarListaInteger(ExemploListaGenerica<Integer> obj) {
		obj.add(27091974);
		obj.add(12042004);
		obj.add(20112009);
	}

	private void montarListaStrings(ExemploListaGenerica<String> obj) {
		obj.add("Programaçaõ Java com Ênfase em Orientação a Objetos");
		obj.add("Redes de Computadores - Teoria e Prática");
		obj.add("Programação Java com Ênfase em Cliente Servidor");
		obj.add("Desde a Análise ao Código");
		obj.add("Design OO");
	}

}

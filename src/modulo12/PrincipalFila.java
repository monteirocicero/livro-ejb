package modulo12;

public class PrincipalFila {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int qdade = 0;
		Fila<Integer> intFila = new Fila<Integer>();
		System.out.println("Alimentando a fila com inteiros.");
		for (int i = 0; i < 10; i++) {
			intFila.adicionar(i + 100);
		}
		qdade = intFila.getItens().size();
		System.out.println("Consumindo os elementos da fila de inteiros.");
		for (int i = 0; i < qdade; i++) {
			System.out.println("Elemento: " + i + ":" + intFila.remover());
		}
		Fila<String> strFila = new Fila<String>();
		System.out.println("Alimentado a fila com strings");
		strFila.adicionar("Armindo");
		strFila.adicionar("Rafael");
		strFila.adicionar("Tombosi");
		qdade = strFila.getItens().size();
		System.out.println("Consumindo os elementos da fila de strings.");
		for (int i = 0; i < qdade; i++) {
			System.out.println("Elemento: " + i + ":" + strFila.remover());
		}
				
	}

}

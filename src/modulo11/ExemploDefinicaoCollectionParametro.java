package modulo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ExemploDefinicaoCollectionParametro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> obj = new ArrayList<String>();
		alteraCollection(obj, "Livro de Programação Java com Ênfase em OO");
		Collection<String> obj1 = new HashSet<String>();
		alteraCollection(obj1, "Redes de Computadores - Teoria e Prática");
		listaCollection(obj);
		listaCollection(obj1);

	}
	
	/* O método alteraCollection() recebe ora um objeto do tipo da classe
	 * ArrayList ora um objeto do tipo da classe HashSet. Por fim realiza
	 * a adição do objeto recebido com parâmetro em obj que é do tipo da
	 * interface Collection. */
	private static void alteraCollection(Collection<String> obj, String str) {
		obj.add(str);
	}

	private static void listaCollection(Collection<String> obj) {
		Iterator<String> it = obj.iterator();
		while (it.hasNext()) {
			System.out.println("Recuperando: " + it.next());
		}
	}


}

package modulo12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExemploWildcard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploWildcard obj = new ExemploWildcard();
		List<String> l = new ArrayList<String>();
		l.add("Douglas Mendes");
		l.add("Pedro Mendes");
		l.add("Davi Mendes");
		obj.imprimirCollectionGenerica(l);
		obj.imprimirListaGenerica(l);
	}

	private void imprimirListaGenerica(List<?> obj) {
		Iterator<?> i = obj.iterator();
		for (int k = 0; k < obj.size(); k++) {
			System.out.println(i.next());
		}
	}

	private void imprimirCollectionGenerica(Collection<?> obj) {
		Iterator<?> i = obj.iterator();
		for (int k = 0; k < obj.size(); k++) {
			System.out.println(i.next());
		}
	}

}

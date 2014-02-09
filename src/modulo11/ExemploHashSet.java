package modulo11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("C ++");
		set.add("Smalltalk");
		// Por ser repetido não será inserido no conjunto.
		set.add("Java");
		set.add("Delphi");
		set.add("PHP");
		// Imprimindo todos os objetos do conjunto. A impressão ocorrerá sem ordem.
		System.out.println("Imprimindo todos os objetos de uma única vez: " + set);
		/* Para recuperar os objetos de um conjunto individualmente devemos utilizar um iterator. */
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println("***************************************************");
			System.out.println(val.toString());
		}

	}

}

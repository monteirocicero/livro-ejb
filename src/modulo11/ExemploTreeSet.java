package modulo11;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedSet<String> setVar = new TreeSet<String>();
		setVar.add("Java");
		setVar.add("C ++");
		setVar.add("Smalltalk");
		// Por ser repetido não será inserido no conjunto.
		setVar.add("Java");
		setVar.add("Delphi");
		setVar.add("PHP");
		// Imprimindo todos os objetos do conjunto. A impressão ocorrerá ordenada.
		System.out.println("Imprimindo todos os objetos de uma única vez: " + setVar);
		/* Para recuperar os objetos de um conjunto individualmente devemos utilizar um iterator. */
		Iterator<String> it = setVar.iterator();
		System.out.println("Imprimindo cada objeto do conjunto.");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println("*****************************************************");
			System.out.println(val.toString());
		}

	}

}

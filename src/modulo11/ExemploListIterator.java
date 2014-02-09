package modulo11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExemploListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(27);
		l.add(9);
		l.add(1974);
		l.add(2008);
		ListIterator<Integer> lit = l.listIterator();
		System.out.println("Análise crescente: ");
		while (lit.hasNext()) {
			System.out.println(lit.nextIndex() + " - " + lit.next());
		}
		System.out.println("Análise decrescente: ");
		while (lit.hasPrevious()) {
			System.out.println(lit.previousIndex() + " - " + lit.previous());
		}
	}

}

package modulo11;

import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(27);
		l.add(9);
		l.add(1974);
		l.add(2008);
		System.out.println("Objetos: " + l);
		System.out.println("Quantidade de elementos do vetor: " + l.size());
		for (int i = 0; i < l.size(); i++) {
			System.out.println("Elemento: " + i + " : " + l.get(i));
		}

	}

}

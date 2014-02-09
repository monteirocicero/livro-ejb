package modulo11;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Capacidade inicial de 200 elementos
		List<Integer> l = new ArrayList<Integer>(200);
		l.add(2008);
		l.add(27);
		l.add(9);
		l.add(1974);
		System.out.println(l);
		System.out.println("Quantidade de elementos do vetor: " + l.size());

	}

}

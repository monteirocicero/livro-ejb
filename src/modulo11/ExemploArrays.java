package modulo11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] a = new String[] {"a", "b", "c", "d", "e", "f", "g"};
		List<String> list = Arrays.asList(a);
		Collections.shuffle(list);
		Iterator<String> i = list.iterator();
		System.out.println("\nImprimindo o vetor embaralhado depois de ser convertido em uma lista com o método asList()");
		while (i.hasNext()) {
			System.out.print(" " + i.next());
		}
		System.out.println("\nImprimindo o vetor ordenado com método sort().");
		String[] b = new String[]{"J", "A", "C", "A", "R", "E", "O"};
		Arrays.sort(b);
		for (int j = 0; j < b.length; j++) {
			System.out.print(" " + b[j]);
		}
	}

}

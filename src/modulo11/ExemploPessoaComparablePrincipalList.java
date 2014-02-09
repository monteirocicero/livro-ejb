package modulo11;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploPessoaComparablePrincipalList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<ExemploPessoaComparable> q = new LinkedList<ExemploPessoaComparable>();
		q.add(new ExemploPessoaComparable("Rocha", 26985875));
		q.add(new ExemploPessoaComparable("Douglas", 85255985));
		q.add(new ExemploPessoaComparable("Pedro", 26985875));
		q.add(new ExemploPessoaComparable("Mendes", 567989058));
		q.add(new ExemploPessoaComparable("Davi", 1234258));
		q.add(new ExemploPessoaComparable("Cássio", 5566798));
		q.add(new ExemploPessoaComparable("Rúbio", 1234258));
		q.add(new ExemploPessoaComparable("Melissa", 26985875));
		Collections.sort(q);
		imprimir(q);
		
	}

	private static void imprimir(Collection<ExemploPessoaComparable> list) {
		Iterator<ExemploPessoaComparable> it = list.iterator();
		int count = 1;
		System.out.println("Imprimindo um a um ordeandos pelo nome");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println(count + " " + val);
			count++;
		}
	}

}

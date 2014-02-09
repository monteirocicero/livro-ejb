package modulo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploPessoaFisicaComparatorPrincipalList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<ExemploPessoa> q = new ArrayList<ExemploPessoa>();
		q.add(new ExemploPessoaFisica("Douglas", 85255985,123));
		q.add(new ExemploPessoa("Rocha", 26985875));
		q.add(new ExemploPessoaFisica("Pedro", 12345545, 122));
		q.add(new ExemploPessoa("Mendes", 58963258));
		q.add(new ExemploPessoa("Neves", 58963258));
		Collections.sort(q, new ExemploPessoaRGComparator());
		imprimir(q);
	}

	private static void imprimir(Collection<ExemploPessoa> list) {
		Iterator<ExemploPessoa> it = list.iterator();
		int cont = 1;
		System.out.println("Imprimindo um a um ordenados pelo RG");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println(cont + " - " + val);
			cont++;
		}
	}

}

package modulo11;

import java.util.Comparator;

public class ExemploPessoaRGComparator implements Comparator<ExemploPessoa> {

	@Override
	public int compare(ExemploPessoa p, ExemploPessoa q) {
		if (p.getRg() < q.getRg()) {
			return -1;
		} else if (p.getRg() == q.getRg()) {
			return 0;
		} else {
			return 1;
		}
	}

}

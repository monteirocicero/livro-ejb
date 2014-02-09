package modulo11;

public class ExemploPessoaComparable implements Comparable<ExemploPessoaComparable> {
	
	private String nome;
	private int rg;

	public ExemploPessoaComparable(String nome, int rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return "(" + rg + ", " + nome + ")";
	}
	
	@Override
	public int compareTo(ExemploPessoaComparable outraPessoa) {
		String outroString = outraPessoa.getNome();
		if (getNome().compareTo(outroString) > 0) {
			return 1;
		} else {
			if (getNome().compareTo(outroString) < 0) {
				return -1;
			}
		}
		return 0;
	}
	
	/*
	@Override
	public int compareTo(ExemploPessoaComparable outraPessoa) {
		int outroRg = outraPessoa.getRg();
		if (getRg() > outroRg) {
			return 1;
		} else {
			if (getRg() < outroRg) {
				return -1;
			}
		}
		return 0;
	}*/

}

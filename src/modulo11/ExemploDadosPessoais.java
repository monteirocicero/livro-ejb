package modulo11;

public class ExemploDadosPessoais implements Comparable<ExemploDadosPessoais> {
	
	private String nome;
	private String telefone;
	private int idade;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		if ((idade <= 0) || (idade > 110)) {
			throw new IllegalArgumentException("Idade não compatível.");
		} else {
			this.idade = idade;
		}
	}

	@Override
	public int compareTo(ExemploDadosPessoais outraConta) {
		String outroValor = outraConta.getNome();
		if (getNome().compareTo(outroValor) > 0) {
			return 1;
		} else {
			if (getNome().compareTo(outroValor) < 0) {
				return -1;
			}
		}
		return 0;
	}

}

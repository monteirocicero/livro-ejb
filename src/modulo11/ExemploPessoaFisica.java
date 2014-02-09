package modulo11;

public class ExemploPessoaFisica extends ExemploPessoa {
	
	private int cpf;
	
	public ExemploPessoaFisica() {}

	public ExemploPessoaFisica(String nome, int rg, int cpf) {
		super(nome, rg);
		this.cpf = cpf;
	}

}

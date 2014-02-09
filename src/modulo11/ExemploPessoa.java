package modulo11;

public class ExemploPessoa {
	
	private String nome;
	private int rg;
	
	public ExemploPessoa(String nome, int rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}
	
	public ExemploPessoa() {}

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
	

}

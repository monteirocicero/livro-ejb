package modulo11;

public class ExemploUsuario {
	
	private long rg;
	private long cpf;
	private String nome;
		
	public ExemploUsuario(long rg, long cpf, String nome) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.nome = nome;
	}

	public long getRg() {
		return rg;
	}
	
	public void setRg(long rg) {
		this.rg = rg;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExemploUsuario other = (ExemploUsuario) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}
		
}

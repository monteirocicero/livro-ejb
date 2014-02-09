package modulo11;

public class ContaCorrenteComparable implements Comparable<ContaCorrenteComparable> {
	
	private int conta;
	private int agencia;
	private double saldo;
	private String nome;
	
	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(ContaCorrenteComparable outraConta) {
		int outroValor = outraConta.getConta();
		if (getConta() > outroValor) {
			return 1;
		} else {
			if (getConta() < outroValor) {
				return -1;
			}
		}
		return 0;
	}

	/* Necessário para garantir que objetos com mesma conta não sejam inseridos no conjunto. */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + conta;
		return result;
	}

	/* Necessário para garantir que objetos com mesma conta não sejma inseridos no conjunto. */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrenteComparable other = (ContaCorrenteComparable) obj;
		if (conta != other.conta)
			return false;
		return true;
	}
	
}

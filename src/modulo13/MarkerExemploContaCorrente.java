package modulo13;

public class MarkerExemploContaCorrente {
	
	@MarkerObrigatorio private int agencia;
	@MarkerObrigatorio private int conta;
	@MarkerObrigatorio private double saldo;
	@MarkerObrigatorio private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

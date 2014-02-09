package modulo13;


public class ContaCorrente {
	
	private int conta;
	private int agencia;
	private double saldo;
	private String nome;
	
	@Documentado(responsavel = "Silva Sauro",
			     criadoPor = "Isabel Sauro",
			     ultimaAlteracao = "20101231")
	public void efetuarSaque(double saque) {
		this.saldo -= saque;
	}
	
	@Documentado(criadoPor = "Isabel Sauro", ultimaAlteracao = "20101231")
	public void efetuarDeposito(double deposito) {
		this.saldo += deposito;
	}
	
	@Documentado(ultimaAlteracao = "20100518")
	public void imprimirSaldo() {
		System.out.println(saldo);
	}

}

package modulo13;

import util.MyClassException;

public class MarkerPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MarkerExemploContaCorrente cc = new MarkerExemploContaCorrente();
			cc.setNome("Douglas Rocha Mendes");
			cc.setAgencia(10);
			MarkerValidatorContaCorrente validador = new MarkerValidatorContaCorrente();
			validador.validar(cc);
		} catch (MyClassException e) {
			System.out.println("Classe: " + e.getClasse());
			System.out.println("Minha Mensagem: " + e.getMensagem());
			System.out.println("Mensagem do gerador do erro: " + e.getMensagem());
			System.out.println("Método: " + e.getMetodo());
			System.out.println("Pacote: " + e.getPacote());
		}
	}

}

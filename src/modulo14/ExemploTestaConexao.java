package modulo14;

import java.sql.Connection;

import util.MyClassException;

public class ExemploTestaConexao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinhaConexao mc = new MinhaConexao();
		try {
			Connection con = mc.getConexao();
			if (con != null) {
				System.out.println("Conexão OK.");
			} else {
				System.out.println("Falha na conexão.");
			}
		} catch (MyClassException e) {
			System.out.println("Mensagem: " + e.getMensagem());
			System.out.println("Mensagem Original: " + e.getMessage());
			System.out.println("Classe: " + e.getClasse());
			System.out.println("Método: " + e.getMetodo());
		}
	}

}

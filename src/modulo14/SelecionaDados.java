package modulo14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.MyClassException;

public class SelecionaDados {
	
	public void selecionarAgenda() throws MyClassException {
		MinhaConexao mCon = new MinhaConexao();
		Connection con = mCon.getConexao();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id, nome, endereco, cidade, telefone" + " FROM agenda");
			while (rs.next()) {
				System.out.println("***********************************");
				System.out.println("ID: " + rs.getString("id"));
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Endereço: " + rs.getString("endereco"));
				System.out.println("Cidade: " + rs.getString("cidade"));
				System.out.println("Telefone: " + rs.getString("telefone"));
			}
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error Code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMensagem("inserirAgenda");
			m.setCodigo(e.getErrorCode());
			throw m;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new SelecionaDados().selecionarAgenda();
		} catch (MyClassException e) {
			System.out.println("Mensagem: " + e.getMensagem());
			System.out.println("Mensagem Original: " + e.getMessage());
			System.out.println("Classe: " + e.getClasse());
			System.out.println("Método: " + e.getMetodo());
		}
	}

}

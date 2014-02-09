package modulo14;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import util.MyClassException;

public class InsereDados {
	
	public boolean inserirAgenda() throws MyClassException {
		try {
			Scanner sc = new Scanner(System.in);
			MinhaConexao mCon = new MinhaConexao();
			Connection con = mCon.getConexao();
			Statement stmt = con.createStatement();
			System.out.println("Entre com um ID: ");
			int id = sc.nextInt();
			stmt.executeUpdate("INSERT INTO agenda(id, nome, endereco, cidade, telefone)" +
					"VALUES(" + id + ", 'Douglas Rocha Mendes', 'Rua de tal', 'Curitiba', '99998877')");
			stmt.close();
			return true;
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
			InsereDados obj = new InsereDados();
			boolean ret = obj.inserirAgenda();
			if (ret == true) {
				System.out.println("Dados inseridos com sucesso.");
			}
		} catch (MyClassException e) {
			System.out.println("Mensagem: " + e.getMensagem());
			System.out.println("Mensagem Original: " + e.getMessage());
			System.out.println("Classe: " + e.getClasse());
			System.out.println("Método: " + e.getMetodo());
		}
	}

}

package modulo14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.MyClassException;

public class TabelaJDBC {
	
	public MinhaConexao mCon = null;
	public Connection con = null;
	
	public TabelaJDBC() throws MyClassException {
		mCon = new MinhaConexao();
		con = mCon.getConexao();
	}
	
	public void executarDDL(String createString) throws MyClassException {
		Statement stmt;
		MinhaConexao mCon = new MinhaConexao();
		Connection con = mCon.getConexao();
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(createString);
			System.out.println("\nOperaçao concluída com sucesso.\n");
			stmt.close();
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error Code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMensagem("executarDDL");
			m.setCodigo(e.getErrorCode());
			throw m;
		}
	}
	
	public ResultSet executarQuery(String createString) throws MyClassException {
		MinhaConexao mCon = new MinhaConexao();
		Connection con = mCon.getConexao();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(createString);
			return rs;
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error Code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMensagem("executarDDL");
			m.setCodigo(e.getErrorCode());
			throw m;
		}
		
	}

}

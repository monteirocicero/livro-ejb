package modulo14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.MyClassException;

public class MinhaConexao {

	public Connection getConexao() throws MyClassException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:mysql://localhost:3306/curso?createDatabaseIfNotExist=true";
			//String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url, "root", "root");
			return con;
		} catch (ClassNotFoundException e) {
			MyClassException obj = new MyClassException("Erro em ClassNotFoundException");
			obj.setClasse(getClass().getName());
			obj.setMensagem(e.getMessage());
			obj.setMensagem("getConexao");
			throw obj;
		} catch (SQLException e) {
			MyClassException obj = new MyClassException("Erro em ClassNotFoundException");
			obj.setClasse(getClass().getName());
			obj.setMensagem(e.getMessage());
			obj.setMetodo("getConexao");
			throw obj;
		}
	}

}

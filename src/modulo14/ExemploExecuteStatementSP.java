package modulo14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import util.MyClassException;

public class ExemploExecuteStatementSP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploExecuteStatementSP obj = new ExemploExecuteStatementSP();
		Scanner var = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		String nome = null;
		while (true) {
			try {
				System.out.println("OBS.: Caso a tabela agenda não exista excutar a classe ExemploCriaTabela");
				System.out.println("1 - Criar stored procedure.");
				System.out.println("2 - Atualizar dados.");
				System.out.println("3 - Selecionar dados.");
				System.out.println("9 - Fim.");
				System.out.print("Entre com a opção: ");
				int op = var.nextInt();
				switch (op) {
				case 1:
					obj.criarSPExecute();
					break;
				case 2:
					System.out.println("Digite o novo nome para alteração: ");
					nome = var.next();
				case 3:
					System.out.println("Entre com o ID: ");
					int id = var.nextInt();
					obj.executarStoredProcedure(op, id, nome);
					break;
				case 9:
					System.exit(0);
				}
			} catch (MyClassException e) {
				if (e.getCodigo() == 1304) {
					System.out.println("\n\nStored Procedure sp_execute já existe.\n");
				} else if (e.getCodigo() == 1305) {
					System.out.println("Stored Procedure não existe.");
				} else if (e.getCodigo() == 1146) {
					System.out.println("\n\nTabela não existe. Executar a classe ExemploCriaTabela.\n");
				} else {
					System.out.println("Mensagem do objeto: " + e.getMensagem());
					System.out.println("Classe: " + e.getClasse());
					System.out.println("Método: " + e.getMetodo());
					System.out.println("Mensagem original: " + e.getMensagem());
				}
			}
		}
	}

	private void executarStoredProcedure(int op, int id, String nome) throws MyClassException {
		try {
			MinhaConexao mCon = new MinhaConexao();
			Connection con = mCon.getConexao();
			Statement cs = con.createStatement();
			boolean ret = cs.execute("{call sp_execute (" + op + ", " + id + ", '" + nome + "')}");
			if (ret == true) {
				ResultSet rs = cs.getResultSet();
				System.out.println("\nRegistro selecionado: ");
				while (rs.next()) {
					System.out.println("ID: " + rs.getInt("id"));
					System.out.println("Nome: " + rs.getString("nome"));
					System.out.println("Endereço: " + rs.getString("endereco"));
					System.out.println("Cidade: " + rs.getString("cidade"));
					System.out.println("Telefone: " + rs.getString("telefone"));
					System.out.println("\n");
				}
			} else {
				int res = cs.getUpdateCount();
				System.out.println("Foram atualizada(s) " + res + " linhas(s).");
				System.out.println("A coluna nome do registro " + id + " foi atualizada para: " + nome);
			}
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error Code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMetodo("executarStoredProcedure");
			m.setPacote(getClass().getPackage().toString());
			m.setCodigo(e.getErrorCode());
			throw m;
		}
	}

	private void criarSPExecute() throws MyClassException {
		String createString = "CREATE DEFINER = `root`@`localhost` PROCEDURE `sp_execute`(p integer, pid integer, pnome VARCHAR(20))"
				+ "BEGIN"
				+ "   IF (p = 2) THEN"
				+ "      UPDATE agenda SET nome = pnome WHERE id = pid;"
				+ "   ELSE"
				+ "      SELECT * FROM agenda WHERE id = pid;"
				+ "   END IF;" 
				+ "END";
		ExemploCriaTabela ex = new ExemploCriaTabela();
		ex.executarDDL(createString);
	}

}

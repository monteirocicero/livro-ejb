package modulo14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import util.MyClassException;

public class ExemploPreparedStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploPreparedStatement dmlObj = new ExemploPreparedStatement();
		Scanner var = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("1 - Criar tabela venda.");
				System.out.println("2 - Inserir dados da venda.");
				System.out
						.println("3 - Selecionar dados da venda por período.");
				System.out.println("9 - Fim");
				System.out.println("Entre com uma opção: ");
				int opcao = var.nextInt();
				if (opcao == 9) {
					break;
				}
				switch (opcao) {
				case 1:
					dmlObj.criarTabelaVenda();
					break;
				case 2:
					dmlObj.inserirVenda();
					break;
				case 3:
					dmlObj.selecionarVendas();
					break;
				default:
				}

			} catch (MyClassException e) {
				if (e.getCodigo() == 1050) {
					System.out.println("\n\nTabela venda já existe.\n");
				} else if (e.getCodigo() == 1064) {
					System.out.println("\nNenuma data foi digitada.\n");
				} else if (e.getCodigo() == 1062) {
					System.out.println("\nAtenção: Registro duplicado.\n");
				} else if (e.getCodigo() == 1146) {
					System.out.println("\nAtenção: Criar a tabela venda.\n");
				} else {
					System.out.println("Mensagem do objeto: " + e.getMessage());
					System.out.println("Classe: " + e.getClasse());
					System.out.println("Método: " + e.getMetodo());
					System.out.println("Mensagem original: " + e.getMensagem());
					System.out.println("___________________________________________\n");
				}
			}
		}
	}

	private void selecionarVendas() throws MyClassException {
		String dtIni = null;
		String dtFim = null;
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		System.out.println("Digite a data inicial(DD/MM/AAAA): ");
		dtIni = sc.next();
		System.out.println("Digite a data final(DD/MM/AAAA): ");
		dtFim = sc.next();
		try {
			StringBuffer sql = new StringBuffer("SELECT matricula, nome_vendedor, data FROM venda");
			if (!dtIni.equals("") || !dtFim.equals("")) {
				sql.append(" WHERE ");
			}
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			java.sql.Date dataIni = null;
			if (!dtIni.equals("")) {
				sql.append(" data >= ? ");
				dataIni = new java.sql.Date(format.parse(dtIni).getTime());
			}
			java.sql.Date dataFim = null;
			if (!dtFim.equals("")) {
				if (!dtIni.equals("")) {
					sql.append(" AND ");
				}
				sql.append(" data <= ? ");
				dataFim = new java.sql.Date(format.parse(dtFim).getTime());
			}
			MinhaConexao mCon = new MinhaConexao();
			Connection con = mCon.getConexao();
			PreparedStatement stmt = con.prepareStatement(sql.toString());
			if (dataIni != null) {
				stmt.setDate(1, dataIni);
			}
			if (dataFim != null) {
				if (dataIni == null) {
					stmt.setDate(1, dataFim);
				} else {
					stmt.setDate(2, dataFim);
				}
			}
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("***************************");
				System.out.println("Matricula: " + rs.getInt(1));
				System.out.println("Nome Vendedor: " + rs.getString(2));
				System.out.println("Data Venda: " + rs.getDate(3));
				System.out.println();
			}
			stmt.close();
			con.close();
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error Code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMetodo("selecionarVendas");
			m.setPacote(getClass().getPackage().toString());
			m.setCodigo(e.getErrorCode());
			throw m;
		} catch (ParseException e1) {
			MyClassException m = new MyClassException("Erro em ParseException. Digiter a data no formato DD/MM/AAAA, caso contrário dará erro.");
			m.setClasse(getClass().getName());
			m.setMensagem(e1.getMessage());
			m.setMetodo("selecionarVendas");
			m.setPacote(getClass().getPackage().toString());
			throw m;
		}
		
	}

	private void inserirVenda() throws MyClassException {
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		System.out.println("Digite o nome do vendedor: ");
		String nome = sc.next();
		System.out.println("Digite a matrícula (OBS.: chave primária): ");
		int matricula = sc.nextInt();
		try {
			MinhaConexao mCon = new MinhaConexao();
			Connection con = mCon.getConexao();
			String sql = "INSERT INTO venda(matricula, nome_vendedor, data) VALUES (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, matricula);
			stmt.setString(2, nome);
			Date dUtil = new Date();
			stmt.setDate(3, new java.sql.Date(dUtil.getTime()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error Code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMetodo("inserirVenda");
			m.setPacote(getClass().getPackage().toString());
			m.setCodigo(e.getErrorCode());
			throw m;
		}
	}

	private void criarTabelaVenda() throws MyClassException {
		String createString = "CREATE TABLE venda(data DATE, nome_vendedor VARCHAR(32), matricula INT, PRIMARY KEY(matricula))";
		ExemploCriaTabela ex = new ExemploCriaTabela();
		ex.executarDDL(createString);
	}

}

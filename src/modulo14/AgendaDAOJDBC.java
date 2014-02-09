package modulo14;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.MyClassException;

public class AgendaDAOJDBC extends TabelaJDBC implements AgendaDAO {

	public AgendaDAOJDBC() throws MyClassException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void criarTabelaAgenda() throws MyClassException {
		String createString = "CREATE TABLE agenda" + "(id INT, "
				+ " nome VARCHAR(30), "   + " endereco VARCHAR(50), "
				+ " cidade VARCHAR(15), " + " telefone VARCHAR(15), "
				+ " PRIMARY KEY(id)"      + ")";
		executarDDL(createString);
	}

	@Override
	public void removerTabelaAgenda() throws MyClassException {
		String createString = "DROP TABLE agenda";
		executarDDL(createString);
	}

	@Override
	public void atualizarAgenda(AgendaVO vo) throws MyClassException {
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE agenda SET nome = '" + vo.getNome() + "' WHERE id = " + vo.getId());
			int ret = stmt.executeUpdate();
			if (ret == 0) {
				throw new MyClassException("Agenda informada não existe.");
			}
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error Code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMetodo("atualizarAgenda");
			m.setPacote(getClass().getPackage().toString());
			m.setCodigo(e.getErrorCode());
			throw m;
		}
	}

	@Override
	public void inserirAgenda(AgendaVO vo) throws MyClassException {
		int proximoId = 0;
		try {
			ResultSet rs = executarQuery("SELECT max(id) FROM agenda");
			while (rs.next()) {
				proximoId = rs.getInt(1) + 1;
			}
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMensagem("inserirAgenda");
			m.setCodigo(e.getErrorCode());
			throw m;
		}
		executarDDL("INSERT INTO agenda(id, nome, endereco, cidade, telefone)"
				+ "VALUES (" + proximoId + ",'" + vo.getNome() + "','"
								+ vo.getEndereco() + "'," + "'" + vo.getCidade() + "','"
								+ vo.getTelefone() + "')");
	}

	@Override
	public void removerAgenda(AgendaVO vo) throws MyClassException {
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("DELETE FROM agenda WHERE id = " + vo.getId());
			int ret = stmt.executeUpdate();
			if (ret == 0) {
				throw new MyClassException("Agenda informada não existe.");
			}
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMensagem("removerAgenda");
			m.setCodigo(e.getErrorCode());
			throw m;
		}
	}

	@Override
	public List<AgendaVO> selecionarAgendaTodos() throws MyClassException {
		List<AgendaVO> l = new ArrayList<AgendaVO>();
		try {
			ResultSet rs = executarQuery("SELECT * FROM agenda");
			while (rs.next()) {
				AgendaVO ag = new AgendaVO();
				ag.setId(rs.getInt("id"));
				ag.setNome(rs.getString("nome"));
				ag.setCidade(rs.getString("cidade"));
				ag.setEndereco(rs.getString("telefone"));
				l.add(ag);
			}
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMensagem("selecionarAgendaTodos");
			m.setCodigo(e.getErrorCode());
			throw m;
		}
		return null;
	}

	@Override
	public AgendaVO selecionarAgendaporID(AgendaVO vo) throws MyClassException {
		AgendaVO ag = null;
		try {
			ResultSet rs = executarQuery("SELECT * FROM agenda WHERE id = " + vo.getId());
			while (rs.next()) {
				ag = new AgendaVO();
				ag.setId(rs.getInt("id"));
				ag.setNome(rs.getString("nome"));
				ag.setCidade(rs.getString("cidade"));
				ag.setEndereco(rs.getString("endereco"));
				ag.setTelefone(rs.getString("telefone"));
			}
		} catch (SQLException e) {
			MyClassException m = new MyClassException("Erro em SQLException. Error code: " + e.getErrorCode());
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMensagem("selecionarAgendaporID");
			m.setCodigo(e.getErrorCode());
			throw m;
		}
		return ag;
	}

}

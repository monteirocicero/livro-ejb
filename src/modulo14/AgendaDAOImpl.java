package modulo14;

import java.util.List;

import util.MyClassException;

public class AgendaDAOImpl implements AgendaDAO {
	
	AgendaDAO impl = new AgendaDAOJDBC();
	
	public AgendaDAOImpl() throws MyClassException {
		super();
	}

	@Override
	public void criarTabelaAgenda() throws MyClassException {
		impl.criarTabelaAgenda();
	}

	@Override
	public void removerTabelaAgenda() throws MyClassException {
		impl.removerTabelaAgenda();
	}

	@Override
	public void atualizarAgenda(AgendaVO vo) throws MyClassException {
		impl.atualizarAgenda(vo);
	}

	@Override
	public void inserirAgenda(AgendaVO vo) throws MyClassException {
		impl.inserirAgenda(vo);
	}

	@Override
	public void removerAgenda(AgendaVO vo) throws MyClassException {
		impl.removerAgenda(vo);
	}

	@Override
	public List<AgendaVO> selecionarAgendaTodos() throws MyClassException {
		return impl.selecionarAgendaTodos();
	}

	@Override
	public AgendaVO selecionarAgendaporID(AgendaVO vo) throws MyClassException {
		return impl.selecionarAgendaporID(vo);
	}
	
	public static AgendaDAOImpl getObjeto() throws MyClassException {
		return new AgendaDAOImpl();
	}

}

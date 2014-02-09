package modulo14;

import java.util.List;

import util.MyClassException;

public interface AgendaDAO {
	void criarTabelaAgenda() throws MyClassException;
	void removerTabelaAgenda() throws MyClassException;
	void atualizarAgenda(AgendaVO vo) throws MyClassException;
	void inserirAgenda(AgendaVO vo) throws MyClassException;
	void removerAgenda(AgendaVO vo) throws MyClassException;
	List<AgendaVO> selecionarAgendaTodos() throws MyClassException;
	AgendaVO selecionarAgendaporID(AgendaVO vo) throws MyClassException;
}

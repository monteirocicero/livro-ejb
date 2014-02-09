package modulo13;

import java.util.ArrayList;
import java.util.List;

@FullValueAnnotationSuper(colunas = {
		"isbn",
		"titulo",
		"nome_responsavel",
		"data_lancamento",
		"data_devolucao",
		"situacao_item",
}, nomeTabela = "item_emprestimo")
public class FullValueAbstractItem {
	
	protected int ISBN;
	protected String titulo;
	protected String nomeResp;
	protected int dtLancamento;
	protected int dtEmprestimo;
	protected int dtDevolucao;
	protected String situacaoItem; // e - emprestado, l - livre
	List<String> leitura = new ArrayList<String>();

}

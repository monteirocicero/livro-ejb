package modulo13;

@FullValueAnnotationSub(colunas = {
		"isbn",
		"dt_vencimento_fita",
		"descricao_fabricante"
}, nomeTabela = "fita")
public class FullValueFita extends FullValueAbstractItem {
	
	private int dtVencFita;
	private int nivelEmprestimo;
	private String descFabricante;

}

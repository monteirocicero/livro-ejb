package modulo13;

@FullValueAnnotationSub(colunas = {
		"isbn",
		"status_bloqueio"
}, nomeTabela = "livro")
public class FullValueLivro extends FullValueAbstractItem {
	
	private String statusBloqueio; // valores válidos: b - bloqueado, l - livre

}

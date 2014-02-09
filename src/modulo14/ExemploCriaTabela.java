package modulo14;

import util.MyClassException;

public class ExemploCriaTabela extends TabelaJDBC {

	public ExemploCriaTabela() throws MyClassException {
		super();
	}
	
	public void criarTabelaAgenda() throws MyClassException {
		String createString = "CREATE TABLE agenda" + "(id INT," 
				+ " nome VARCHAR(30), "   + " endereco VARCHAR(50), "
				+ " cidade VARCHAR(15), " + " telefone VARCHAR(15), "
				+ " PRIMARY KEY(id)"      + ")";
		executarDDL(createString);
	}
	
	public void removerTabelaAgenda() throws MyClassException {
		String createString = "DROP TABLE agenda";
		executarDDL(createString);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploCriaTabela ect = null;
		try {
			ect = new ExemploCriaTabela();
			ect.criarTabelaAgenda();
			System.out.println("\nTabela agenda criada com sucesso.\n");
		} catch (MyClassException e) {
			if (e.getCodigo() == 1050) {
				try {
					System.out.println("\nTabela agenda já existe. Removendo.");
					ect.removerTabelaAgenda();
					System.out.println("\nExecutar novamente para realizar a criação.\n");
				} catch (MyClassException er) {
					System.out.println("Mensagem: " + er.getMensagem());
					System.out.println("Mensagem Original: " + er.getMessage());
					System.out.println("Classe: " + er.getClasse());
					System.out.println("Método: " + er.getMetodo());
				}
			} else {
				System.out.println("Mensagem: " + e.getMensagem());
				System.out.println("Mensagem Original: " + e.getMessage());
				System.out.println("Classe: " + e.getClasse());
				System.out.println("Método: " + e.getMetodo());
			}
		}
	}

}

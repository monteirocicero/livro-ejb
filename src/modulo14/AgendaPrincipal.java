package modulo14;

import java.util.List;
import java.util.Scanner;

import util.MyClassException;

public class AgendaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		AgendaVO vo = new AgendaVO();
		while (true) {
			try {
				AgendaDAOImpl dmlObj = AgendaDAOImpl.getObjeto();
				System.out.println("1 - Inserir dados");
				System.out.println("2 - Atualizar dados");
				System.out.println("3 - Remover dados");
				System.out.println("4 - Selecionar todos os dados");
				System.out.println("5 - Criar tabela agenda");
				System.out.println("6 - Remover tabela agenda");
				System.out.println("9 - Fim");
				System.out.println("Entre com uma opção: ");
				int opcao = var.nextInt();
				if (opcao == 9) {
					break;
				}
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome: ");
					vo.setNome(var.next());
					System.out.println("Digite o endereço: ");
					vo.setEndereco(var.next());
					System.out.println("Digite a cidade: ");
					vo.setCidade(var.next());
					System.out.println("Digite o telefone: ");
					vo.setTelefone(var.next());
					dmlObj.inserirAgenda(vo);
					System.out.println("\nDados inseridos com sucesso.\n");
					break;
				case 2:
					System.out.println("Digite o índice para ser alterado: ");
					vo.setId(var.nextInt());
					System.out.println("Digite o novo nome: ");
					vo.setNome(var.next());
					dmlObj.atualizarAgenda(vo);
					System.out.println("\nRegistro removido com sucesso.\n");
					break;
				case 3:
					System.out.println("Digite o índice para ser removido: ");
					vo.setId(var.nextInt());
					dmlObj.removerAgenda(vo);
					System.out.println("\nRegistro removido com sucesso.\n");
					break;
				case 4:
					List<AgendaVO> lista = dmlObj.selecionarAgendaTodos();
					System.out.println("\nRegistros selecionados");
					for (int i = 0; i < lista.size(); i++) {
						AgendaVO ag = lista.get(i);
						System.out.println("*********************************");
						System.out.println("ID: " + ag.getId());
						System.out.println("Nome: " + ag.getNome());
						System.out.println("Cidade: " + ag.getCidade());
						System.out.println("Endereço: " + ag.getEndereco());
						System.out.println("Telefone: " + ag.getTelefone());
					}
					System.out.println("\n");
					break;
				case 5:
					dmlObj.criarTabelaAgenda();
					break;
				case 6:
					dmlObj.removerTabelaAgenda();
					break;
				default:
					System.out.println("Opção inválida");
				}
				
			} catch (MyClassException e) {
				if (e.getCodigo() == 1050) {
					System.out.println("\n\nTabela agenda já existe");
				} else if (e.getCodigo() == 1146) {
					System.out.println("\nAtenção: Criar a tabela.\n");
				} else {
					System.out.println("Mensagem do objeto: " + e.getMensagem());
					System.out.println("Classe: " + e.getClasse());
					System.out.println("Método: " + e.getMetodo());
					System.out.println("Mensagem original: " + e.getMensagem());
					System.out.println("\n\n");
				}
			}
		}
	}

}

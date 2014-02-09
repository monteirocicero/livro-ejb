package modulo12;

public class PilhaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int TAMANHO = 10;
		PilhaGenerica pInt = new PilhaGenerica(Integer.class, TAMANHO);
		pInt.adicionar(new Integer(27));
		pInt.adicionar(new Integer(9));
		pInt.adicionar(new Integer(1974));
		pInt.adicionar(new Integer(12));
		while (pInt.verificarTamanho() > 0) {
			System.out.println(pInt.remover());
		}
		PilhaGenerica<String> pStr = new PilhaGenerica<String>(String.class, TAMANHO);
		pStr.adicionar(new String("Douglas"));
		pStr.adicionar(new String("Rocha"));
		pStr.adicionar(new String("Mendes"));
		while (pStr.verificarTamanho() > 0) {
			System.out.println(pStr.remover());
		}
	}

}

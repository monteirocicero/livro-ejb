package modulo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExemploDefinicaoCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> obj = new ArrayList<String>();
		obj.add("Programação Java com ênfase em Orientação a Objetos.");
		/* Esta próxima linha gera erro de compilação.
		 * O tipo definido da coleção só permite adicinar Strings.*/
		//obj.add(100);
		System.out.println("Acessando objeto: " + ((List<String>) obj).get(0));

	}

}

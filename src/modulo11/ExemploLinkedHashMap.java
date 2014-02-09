package modulo11;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer> mapa = new LinkedHashMap<Integer, Integer>();
		mapa.put(11, 27);
		mapa.put(12, 9);
		mapa.put(3, 1974);
		mapa.put(4, 2008);
		System.out.println(mapa);
		System.out.println("**************************************");
		System.out.println("Acesso aos elementos do mapa usando a chave e o método get().");
		System.out.println("Primeiro elemento do mapa: " + mapa.get(11));
		System.out.println("Segundo elemento do mapa: " + mapa.get(12));
		System.out.println("Tamanho do mapa: " + mapa.size());
	}

}

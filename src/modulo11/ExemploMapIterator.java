package modulo11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploMapIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> mapa = new LinkedHashMap<Integer, String>();
		mapa.put(11, "Douglas Rocha");
		mapa.put(12, "Márcio Fagner");
		mapa.put(3, "Atalíbio Neves");
		mapa.put(4, "Rodrigo Vieira");
		Iterator<Integer> chaves = mapa.keySet().iterator();
		System.out.println("***********************************************");
		System.out.println("Primeira situação: Acesso as chaves do mapa usando iterator.");
		while (chaves.hasNext()) {
			System.out.println("Chave: " + chaves.next());
		}
		chaves = mapa.keySet().iterator();
		System.out.println("***********************************************");
		System.out.println("Segunda situação: Acesso aos objetos do mapa usando o método get() e a chave obtida pelo iterator.");
		while (chaves.hasNext()) {
			System.out.println("Objeto: " + mapa.get(chaves.next()));
		}
		Iterator<String> conteudo = mapa.values().iterator();
		System.out.println("**********************************************");
		System.out.println("Terceira situação: Acesso aos objetos do mapa sem uso do método get().");
		while (conteudo.hasNext()) {
			System.out.println("Objeto: " + conteudo.next());
		}
		Iterator<Map.Entry<Integer, String>> chavesElemEntry = mapa.entrySet().iterator();
		System.out.println("**********************************************");
		System.out.println("Quarta situação: Acesso aos objetos e chaves ao mesmo tempo.");
		while (chavesElemEntry.hasNext()) {
			System.out.println("Chave+Elemento Entry: " + chavesElemEntry.next());
		}
		
	}

}

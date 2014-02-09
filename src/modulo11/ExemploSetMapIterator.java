package modulo11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploSetMapIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("C ++");
		set.add("Smalltalk");
		set.add("Java");
		set.add("Delphi");
		set.add("PHP");
		System.out.println("Imprimindo todos os objetos do conjunto: " + set);
		imprimirSet(set);
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(1, "Java");
		mapa.put(2, "C ++");
		mapa.put(3, "Smalltalk");
		mapa.put(4, "Java");
		mapa.put(5, "Delphi");
		mapa.put(6, "PHP");
		System.out.println("Imprimindo todos os objetos do mapa: " + mapa);
		imprimirMap(mapa);
	}

	private static void imprimirSet(Set<String> set) {
		Iterator<String> it = set.iterator();
		imprimir(it);
	}
	
	private static void imprimirMap(Map<Integer, String> mapa) {
		Iterator<Map.Entry<Integer, String>> it = mapa.entrySet().iterator();
		imprimir(it);	
	}
	
	private static void imprimir(Iterator<?> it) {
		int cont = 1;
		System.out.println("*********************");
		System.out.println("Imprimindo um a um:");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println(cont + " - " + val);
			cont++;
		}
	}
}

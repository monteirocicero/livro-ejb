package modulo11;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class ExemploTreeMap {
	
	private HashMap<Integer, String> hashMap;
	private SortedMap<Integer, String> treeMap;
	
	public void executar() {
		hashMap = new HashMap<Integer, String>();
		hashMap.put(500, "Jair Pereira");
		hashMap.put(20, "Douglas Rocha");
		hashMap.put(1, "Benfato Pires");
		hashMap.put(150, "Olavo Antunes");
		treeMap = new TreeMap<Integer, String>(hashMap);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploTreeMap map = new ExemploTreeMap();
		map.executar();
		System.out.println("Imprimindo elementos sem ordenação.");
		System.out.println("HashMap: " + map.hashMap);
		System.out.println("Imprimindo elementos com ordenação.");
		System.out.println("TreeMap: " + map.treeMap);
	}

}

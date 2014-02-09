package modulo12;

import java.util.ArrayList;
import java.util.List;

public class ExemploWildcardAddGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploWildcardAddGet obj = new ExemploWildcardAddGet();
		List<String> l = new ArrayList<String>();
		l.add("Douglas Mendes");
		l.add("Pedro Mendes");
		l.add("Davi Mendes");
		obj.manipListGenerica(l);
		
	}

	private void manipListGenerica(List<?> obj) {
		System.out.println("Usando o método get();");
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		//obj.add("Flávio Mendes");
	}

}

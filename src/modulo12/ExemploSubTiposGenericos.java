package modulo12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExemploSubTiposGenericos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploSubTiposGenericos obj = new ExemploSubTiposGenericos();
		List<String> l = new ArrayList<String>();
		l.add("Douglas Mendes");
		l.add("Pedro Mendes");
		l.add("Davi Mendes");
		//obj.imprimirCollectionGenericaErro(l);
		obj.imprimirCollectionGenericaOK(l);
		obj.imprimirCollectionGenericaCuringa(l);
		
	}

	private void imprimirCollectionGenericaErro(List<Object> c) {
		Iterator<Object> i = c.iterator();
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}
	
	private void imprimirCollectionGenericaOK(List<String> c) {
		Iterator<String> i = c.iterator();
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}
	
	private void imprimirCollectionGenericaCuringa(Collection<?> c) {
		Iterator<?> i = c.iterator();
		System.out.println("\nUsando o curinga");
		for (int k = 0; k < c.size(); k++) {
			System.out.println(i.next());
		}
	}

}

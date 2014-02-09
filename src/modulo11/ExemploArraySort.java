package modulo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] animais = new String[4];
		animais[0] = "pássaros";
		animais[1] = "baleia";
		animais[2] = "macacos";
		animais[3] = "cobra";
		System.out.println("Imprimindo o vetor de strings não ordenado");
		for (int i = 0; i < 4; i++) {
			System.out.println("animal " + i + " : " + animais[i]);
		}
		Arrays.sort(animais);
		System.out.println("Imprimindo o vetor de strings ordenado");
		for (int i = 0; i < 4; i++) {
			System.out.println("animal " + i + " : " + animais[i]);
		}
		List<String> l = new ArrayList<String>();
		l.add(animais[0]);
		l.add(animais[1]);
		l.add(animais[2]);
		l.add(animais[3]);
		Collections.sort(l);
		System.out.println("Imprimindo a lista ordenada");
		for (int i = 0; i < l.size(); i++) {
			System.out.println("animal " + i + " : " + l.get(i));
		}
		
	}

}

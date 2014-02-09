package modulo13;

import java.util.Vector;

public class ExemploDeprecated {
	
	/** @deprecated, representa uma annotation do aplicativo javadoc.exe utilizada dentro de comentários. O método imprimir() não deve ser utilizado
	 * a partir de 2011-06-09. */
	@Deprecated
	public void imprimir(Vector<String> vet) {
		System.out.println("Imprimindo a partir de um método depreciado");
		System.out.println(vet);
	}
	
	public static void main(String[] args) {
		ExemploDeprecated exeDeprecated = new ExemploDeprecated();
		Vector<String> list = new Vector();
		list.add("Java");
		list.add("PHP");
		list.add(".net");
				
		exeDeprecated.imprimir(list);
	}

}

package modulo11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploUsuarioPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<ExemploUsuario> set = new HashSet<ExemploUsuario>();
		ExemploUsuario usu = null;
		usu = new ExemploUsuario(12042004, 27091974, "Douglas");
		set.add(usu);
		usu = new ExemploUsuario(25081982, 101010, "Davi");
		set.add(usu);
		usu = new ExemploUsuario(20112009, 202020, "Pedro");
		set.add(usu);
		/* Não será adicionado ao conjunto, pois já existe um objeto com mesmo CPF(202020). */
		usu = new ExemploUsuario(30303030, 202020, "Letícia");
		set.add(usu);
		Iterator<ExemploUsuario> it = set.iterator();
		System.out.println("Imprimindo cada objeto do conjunto.");
		while (it.hasNext()) {
			ExemploUsuario val = it.next();
			System.out.println("*******************************************");
			System.out.println("CPF: " + val.getCpf());
			System.out.println("RG: " + val.getRg());
			System.out.println("Nome: " + val.getNome());
		}

	}

}

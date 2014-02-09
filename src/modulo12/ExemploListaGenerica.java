package modulo12;

import java.util.LinkedList;

public class ExemploListaGenerica<E> extends LinkedList<E> implements InterfaceGenerica<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean verificarConteudo(E objetoRequerido) {
		return contains(objetoRequerido);
	}

}

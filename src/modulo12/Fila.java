package modulo12;

import java.util.LinkedList;

public class Fila<T> {
	
	private LinkedList<T> itens = new LinkedList<T>();
	
	public void adicionar(T item) {
		itens.addLast(item);
	}
	
	public T remover() {
		return itens.removeFirst();
	}
	
	public boolean verificar() {
		return itens.size() == 0;
	}
	
	public LinkedList<T> getItens() {
		return itens;
	}
}

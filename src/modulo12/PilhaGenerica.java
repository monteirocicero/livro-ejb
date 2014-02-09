package modulo12;

import java.lang.reflect.Array;

public class PilhaGenerica<T> {
	
	private T[] elementos;
	private int topo = -1;
	private int maximo;
	private int capacidade;
	
	@SuppressWarnings("unchecked")
	public PilhaGenerica(Class<T> classe, int capacidade) {
		elementos = (T[]) Array.newInstance(classe, capacidade);
		this.capacidade = capacidade;
	}
	
	public void adicionar(T elemento) {
		if (maximo <= capacidade) {
			elementos[++topo] = elemento;
			maximo++;
		} else {
			System.out.println("Pilha atingiu seu limite para inserir o elemento.");
		}
	}
	
	public T remover() {
		if (topo != -1) {
			return elementos[topo--];
		} else {
			return null;
		}
	}
	
	public int verificarTamanho() {
		return topo + 1;
	}
		
}

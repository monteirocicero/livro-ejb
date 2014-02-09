package modulo11;

import java.util.Stack;

public class ExemploStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Inserindo na pilha: " + pilha.push(i));
		}
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.println("Retirando da pilha: " + pilha.pop());
		}

	}

}

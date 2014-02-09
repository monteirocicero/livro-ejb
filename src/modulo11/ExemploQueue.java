package modulo11;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = time; i >= 0; i--) {
			System.out.println("Adicionando o elemento: " + i + " na fila");
			queue.add(i);
		}
		System.out.println();
		while (!queue.isEmpty()) {
			System.out.println("Removendo o elemento: " + queue.remove() + " da fila");
			Thread.sleep(1000);
		}
 
	}

}

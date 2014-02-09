package modulo11;

import java.util.Vector;

public class ExemploVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> l = new Vector<Integer>(2);
		System.out.println("Capacidade inicial do vetor: " + l.capacity());
		l.add(27);
		l.add(9);
		l.add(1974);
		System.out.println("Capacidade apos a 3ª adição: " + l.capacity());
		l.add(2008);
		l.add(12);
		System.out.println("Capacidade apos a 5ª adição: " + l.capacity());
		l.add(4);
		l.add(2004);
		l.add(25);
		System.out.println("Capacidade apos a 8ª adição: " + l.capacity());
		l.add(12);
		l.add(2008);
		System.out.println("Capacidade apos a 10ª adição: " + l.capacity());
		l.add(1);
		l.add(8);
		System.out.println("Capacidade apos a 12ª adição: " + l.capacity());
		System.out.println("Elementos: " + l);
		System.out.println("Quantidade de elementos do vetor: " + l.size());
		
	

	}

}

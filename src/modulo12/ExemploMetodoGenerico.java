package modulo12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExemploMetodoGenerico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploMetodoGenerico objMain = new ExemploMetodoGenerico();
		System.out.println("Manipulando um vetor de inteiros.");
		System.out.println("__________________________________________________");
		Object[] vetor = {1, 1, 2, 3, 5, 8, 13, 21, 35};
		List<Object> obj = new ArrayList<Object>();
		System.out.println("Converter um vetor de inteiros do tipo Object para uma coleção do tipo List.");
		System.out.println("Executando o método parametrizado para Object.");
		objMain.vetorToCollection(vetor, obj);
		System.out.println("Executando o método parametrizado com curinga.");
		objMain.vetorToCollectionCuringa(vetor, obj);
		System.out.println("Executando o método parametrizado com X - Método genérico.");
		objMain.vetorToCollectionGenerico(vetor, obj);
		System.out.println("\n*************************************\n");
		System.out.println("\nManipulando um vetor de strings.");
		System.out.println("___________________________________________________");
		System.out.println("Converter um vetor de strings para coleção do tipo List.");
		String[] str = {"Doulgas", "Pedro", "Davi", "Leticia"};
		List<String> cs = new ArrayList<String>();
		System.out.println("Executando o método parametrizado com X - Método genérico.");
		objMain.vetorToCollectionGenerico(str, cs);
		System.out.println("*************************************");
		System.out.println("Converter um vetor de inteiros do tipo Integer para uma coleção do tipo Collection.");
		Integer[] inteiro = {1, 1, 2, 3, 5, 8, 13, 21, 35};
		Collection<Number> colNumber = new ArrayList<Number>();
		System.out.println("Executando o método parametrizado com X - Método genérico.");
		objMain.vetorToCollectionGenerico(inteiro, colNumber);
	}

	private void vetorToCollection(Object[] vetor, Collection<Object> col) {
		for (Object o : vetor) {
			col.add(o);
		}
		System.out.println("Nova coleção do tipo Collection: " + col);
	}
	
	private void vetorToCollectionCuringa(Object[] vetor, Collection<?> col) {
		for (Object o : vetor) {
			//col.add(o);
		}
		System.out.println("Não foi possível movimentar os objetos para a coleção.");
		System.out.println("Imprimindo o vetor original: " + col);
	}

	private <X> void vetorToCollectionGenerico(X[] vetor, Collection<X> col) {
		for (X o : vetor) {
			col.add(o);
		}
		System.out.println("Nova coleção do tipo Collection: " + col);
	}


}

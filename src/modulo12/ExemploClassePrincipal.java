package modulo12;

import java.util.ArrayList;
import java.util.List;

public class ExemploClassePrincipal {
	
	public void executarLista(List<? extends ExemploClasseAnimal> p_objAnimal, String desc) {
		System.out.println(desc);
		for (int i = 0; i < p_objAnimal.size(); i++) {
			(p_objAnimal.get(i)).emitirSom();
		}
	}
	
	public void executarLista(List<ExemploClasseAnimal> p_objAnimal) {
		System.out.println("Usando o formato sem curinga limitado");
		for (int i = 0; i < p_objAnimal.size(); i++) {
			p_objAnimal.get(i).emitirSom();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploClassePrincipal pObj = new ExemploClassePrincipal();
		// Etapa 01
		List<ExemploClasseAnimal> objAnimal = new ArrayList<ExemploClasseAnimal>();
		objAnimal.add(new ExemploClasseAnimal());
		objAnimal.add(new ExemploClasseFelinos());
		objAnimal.add(new ExemploClasseCaninos());
		objAnimal.add(new ExemploClasseAves());
		pObj.executarLista(objAnimal);
		pObj.executarLista(objAnimal, "Usando com formato de curinga limitado - ExemploClasseAnimal");
		// Etapa 02
		List<ExemploClasseFelinos> objFelinos = new ArrayList<ExemploClasseFelinos>();
		objFelinos.add(new ExemploClasseTigre());
		objFelinos.add(new ExemploClassePantera());
		pObj.executarLista(objFelinos, "Usando com o formato de curinga limitado - ExemploClasseFelinos");
		//pObj.executarLista(objFelinos);
		// Etapa 03
		List<ExemploClasseAves> objAves = new ArrayList<ExemploClasseAves>();
		objAves.add(new ExemploClassePatos());
		objAves.add(new ExemploClasseCanario());
		pObj.executarLista(objAves, "Usando com o formato de curinga limitado - ExemploClasseAves");
		//pObj.executarLista(objAves);
		
	}

}

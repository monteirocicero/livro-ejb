package modulo13;

import java.util.Vector;

public class SingleValueVetor {

	ExemploDeprecated obj = new ExemploDeprecated();
	
	@SingleValueLogAnnotation(gravarLog = true)
	@SuppressWarnings(value = {"unchecked", "deprecation"})
	public void carregarVetor(Vector vet) {
		vet.add("Autor");
		vet.add("email");
		vet.add("editora");
		obj.imprimir(vet);;
	}
	
	@SingleValueLogAnnotation(gravarLog = true)
	public void dormir() {
		for (long i = 0; i < 1000000000; i++);
	}

}

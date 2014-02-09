package modulo13;

import java.util.Vector;

public class ExemploSuppressWarning {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ExemploDeprecated obj = new ExemploDeprecated();
		Vector<String> vet = new Vector<String>();
		carregarVetor(vet);
		obj.imprimir(vet);
		adicionareImprimirVetor();
	}
	
	@SuppressWarnings("unchecked")
	private static void carregarVetor(Vector vet) {
		vet.add("Autor");
		vet.add("email");
		vet.add("editora");
	}

	@SuppressWarnings({"unchecked", "deprecation"})
	private static void adicionareImprimirVetor() {
		Vector vet = new Vector();
		vet.add("Cidade");
		vet.add("Estado");
		vet.add("Cep");
		ExemploDeprecated obj = new ExemploDeprecated();
		obj.imprimir(vet);
	}

}

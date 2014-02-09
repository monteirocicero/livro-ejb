package modulo12;

import java.util.ArrayList;
import java.util.List;

import modulo11.ExemploPessoa;

public class ExemploUsandoCast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploUsandoCast uc = new ExemploUsandoCast();
		uc.executarComGen();
		uc.executarSemGen();
	}

	private void executarComGen() {
		ExemploPessoa obj = null;
		List<ExemploPessoa> meuVetorGen = new ArrayList<ExemploPessoa>();
		obj = new ExemploPessoa("Douglas Rocha Mendes", 1234);
		meuVetorGen.add(obj);
		obj = new ExemploPessoa("Vanessa Martins", 34567);
		meuVetorGen.add(obj);
		System.out.println("*****************************************");
		System.out.println("Não usando cast");
		System.out.println("Nome: " + meuVetorGen.get(0).getNome());
		System.out.println("RG: " + meuVetorGen.get(0).getRg());
		System.out.println("Nome: " + meuVetorGen.get(1).getNome());
		System.out.println("RG: " + meuVetorGen.get(1).getRg());
	}

	private void executarSemGen() {
		ExemploPessoa obj = null;
		List meuVetorGen = new ArrayList();
		obj = new ExemploPessoa("Pedro Rocha Mendes", 4567);
		meuVetorGen.add(obj);
		obj = new ExemploPessoa("Gleibe Zanetti", 8907);
		meuVetorGen.add(obj);
		System.out.println("*******************************************");
		System.out.println("Usando o cast - Tipo 01");
		System.out.println("Nome: " + ((ExemploPessoa) meuVetorGen.get(0)).getNome());
		System.out.println("RG: " + ((ExemploPessoa) meuVetorGen.get(0)).getRg());
		System.out.println("Nome: " + ((ExemploPessoa) meuVetorGen.get(1)).getNome());
		System.out.println("RG: " + ((ExemploPessoa) meuVetorGen.get(1)).getRg());
		System.out.println("Usando o cast - Tipo 02");
		obj = (ExemploPessoa) meuVetorGen.get(0);
		System.out.println("Nome: " + obj.getNome());
		System.out.println("RG: " + obj.getRg());
		obj = (ExemploPessoa) meuVetorGen.get(1);
		System.out.println("Nome: " + obj.getNome());
		System.out.println("RG: " + obj.getRg());
		
		
	}

}

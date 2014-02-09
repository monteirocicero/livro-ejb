package modulo13;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import util.MyClassException;

public class DocumentoProcessar {
	
	public <T> void gerarDocumentacao(T tipoClasse) throws MyClassException {
		for (Method metodo : tipoClasse.getClass().getMethods()) {
			for (Annotation anotacao : metodo.getAnnotations()) {
				if (anotacao instanceof Documentado) {
					try {
						System.out.println("************************************************");
						System.out.println("Gravando Documentação para o método: " + metodo.getName() + "()");
						System.out.println("Criado por: " + ((Documentado) anotacao).criadoPor());
						System.out.println("Responsável: " + ((Documentado) anotacao).responsavel());
						System.out.println("Data da última alteração: " + ((Documentado) anotacao).ultimaAlteracao());
					} catch (IllegalArgumentException e) {
						MyClassException m = new MyClassException("Exceção capturada: IllegalArgumentException");
						m.setMensagem(e.getMessage());
						throw m;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DocumentoProcessar obj = new DocumentoProcessar();
		try {
			obj.gerarDocumentacao(new ContaCorrente());
		} catch (MyClassException e) {
			System.out.println("Classe: " + e.getClasse());
			System.out.println("Minha Mensagem: " + e.getMensagem());
			System.out.println("Minha do gerador do erro: " + e.getMensagem());
			System.out.println("Métdo: " + e.getMetodo());
			System.out.println("Pacote: " + e.getPacote());
		}
		
	}
	
}

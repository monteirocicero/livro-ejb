package modulo13;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Vector;

import util.MyClassException;

public class SingleValueLogProcessar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			(new SingleValueLogProcessar()).executarMetodos();
		} catch (MyClassException e) {
			System.out.println("Minha mensagem: " + e.getMensagem());
			System.out.println("Mensagem do gerador do erro: " + e.getMensagem());
		}
	}

	public void executarMetodos() throws MyClassException {
		SingleValueVetor obj = new SingleValueVetor();
		for (Method metodo : obj.getClass().getDeclaredMethods()) {
			for (Annotation anotacao : metodo.getAnnotations()) {
				if ((anotacao instanceof SingleValueLogAnnotation) && (((SingleValueLogAnnotation) anotacao).gravarLog() == true)) {
					try {
						System.out.println("Gravando Log do início da execução");
						// metodo processado é o método carregarVetor().
						if (metodo.getName().equals("carregarVetor")) {
							System.out.println("Método carregarVetor()");
							System.out.println(new Date());
							metodo.invoke(obj, new Object[]{new Vector<String>()});
						} else {
							if (metodo.getName().equals("dormir")) {
								System.out.println("Método dormir()");
								System.out.println(new Date());
								metodo.invoke(obj);
							}
						}
						System.out.println(new Date());
						System.out.println("Gravando Log do fim da execução");
						System.out.println();
					} catch (IllegalArgumentException e) {
						MyClassException m = new MyClassException("Exceção capturada: IllegalArgumentException");
						m.setMensagem(e.getMessage());
						throw m;
					} catch (IllegalAccessException e) {
						MyClassException m = new MyClassException(
								"Exceção capturada: IllegalAccessException");
						m.setMensagem(e.getMessage());
						throw m;
					
					} catch (InvocationTargetException e) {
						MyClassException m = new MyClassException(
								"Exceção capturada: InvocationTargetException");
						m.setMensagem(e.getMessage());
						throw m;
					}
				}		
			}
		}
	}

}

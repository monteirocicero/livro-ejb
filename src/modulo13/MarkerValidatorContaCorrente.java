package modulo13;

import java.lang.reflect.Field;

import util.MyClassException;

public class MarkerValidatorContaCorrente {
	
	public void validar(Object obj) throws MyClassException {
		try {
			// recupera os detalhes da annotation.
			Class<?> classe = obj.getClass();
			Field[] fields = classe.getDeclaredFields();
			for (Field field : fields) {
				// verifica se o atributo esta anotado com @MarkerObrigatorio.
				if (field.isAnnotationPresent(MarkerObrigatorio.class)) {
					field.setAccessible(true);
					// valida se o atributo do tipo int tem valor
					if (field.getType().toString().equalsIgnoreCase("int")) {
						if ((Integer) field.get(obj) == 0) {
							System.out.println("Atributo: " + field.getName() + " não preenchido");
						}
					}
					// valida se o atributo do tipo double tem valor.
					if (field.getType().toString().equalsIgnoreCase("double")) {
						if ((Double) field.get(obj) == 0) {
							System.out.println("Atributo: " + field.getName() + " não preenchido");
						}
					}
					//valida se o atributo do tipo String tem valor.
					if (field.get(obj) == null) {
						System.out.println("Atributo: " + field.getName() + " não preenchido");
					}
				}
			}
			System.out.println("Validação OK");
		} catch (IllegalArgumentException e) {
			MyClassException m = new MyClassException("Erro na formatação do número - Exceção capturada: IllegalArgumentException");
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMetodo("validar");
			m.setPacote(getClass().getPackage().toString());
			throw m;
		} catch (IllegalAccessException e) {
			MyClassException m = new MyClassException("Erro na formatação do número - Exceção capturada: IllegalAccessException");
			m.setClasse(getClass().getName());
			m.setMensagem(e.getMessage());
			m.setMetodo("validar");
			m.setPacote(getClass().getPackage().toString());
			throw m;
		}
		
	}

}

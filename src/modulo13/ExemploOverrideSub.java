package modulo13;

public class ExemploOverrideSub extends ExemploOverrideSuper {
	
	String senha;
	
	@Override
	public void imprimir() {		
		System.out.println("Senha: " + senha);
	}
	
//	@Override
//	public void imprimir(int x) {		
//		System.out.println("Senha: " + senha);
//	}

}

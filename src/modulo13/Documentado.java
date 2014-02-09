package modulo13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Documentado {
	String responsavel() default "Douglas Rocha Mendes";
	String criadoPor() default "Davi Zanetti";
	String ultimaAlteracao();
}

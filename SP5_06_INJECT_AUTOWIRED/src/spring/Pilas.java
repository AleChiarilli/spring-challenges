package spring;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("singleton")		// si no indicamos nada, los beans serán singletons.
@Scope("prototype")
public class Pilas {

	@Override
	public String toString() {
		return "Pilas_" + hashCode();
	}
	
}
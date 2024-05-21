package spring;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("AMARILLO")
@Qualifier("TORO")
@Scope("prototype")
public class Lamborgini extends Deportivo {}

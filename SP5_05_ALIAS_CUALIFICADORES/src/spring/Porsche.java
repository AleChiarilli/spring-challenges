package spring;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("AZUL")
@Qualifier("CARRERA")
@Scope("prototype")
public class Porsche extends Deportivo {}

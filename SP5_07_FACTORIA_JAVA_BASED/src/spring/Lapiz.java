package spring;

// CUANDO UTILIZAMOS JAVA-BASED NO ES NECESARIO UTILIZAR LA ANOTACIÓN @Component PUESTO
//		QUE EL BEAN LO GENERARÁ LA FACTORÍA DESIGNADA (FactoriaLapizPapel.class) Y NO LA
//		PROPIA DEL FRAMEWORK SPRING.

// ESTE BEAN NO ESTÁ REGISTRADO EN EL CATÁLOGO DE SPRING (se recuperará mediante JavaBased).
public class Lapiz {}

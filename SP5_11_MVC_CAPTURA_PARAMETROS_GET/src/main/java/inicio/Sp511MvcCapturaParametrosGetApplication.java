package inicio;


import java.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Sp511MvcCapturaParametrosGetApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(Sp511MvcCapturaParametrosGetApplication.class, args);
		
		System.out.println("\n\n\t!!! SE HA INICIADO SPRING !!! " + 
								"\t\t TIME: " + LocalTime.now().withNano(0));
		
	}

}



// FECHAS Y HORAS:

// https://es.stackoverflow.com/questions/108415/c%C3%B3mo-le-saco-los-milisegundos-a-una-fecha-de-tipo-localdatetime

/*

Si trabajas con fechas formateadas y en ningún caso te interesan los nano segundos, debes aplicar el método al objeto antes de aplicar el formato.

Ejemplo:

LocalDateTime now = LocalDateTime.now().withNano(0); //Aquí le quitas los nanos
System.out.println("Antes : " + now);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formatDateTime = now.format(formatter);
System.out.println("Después : " + formatDateTime);

Resultado:

Antes : 2017-10-10T00:19:27
Después : 2017-10-10 00:19:27


*/
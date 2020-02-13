package com.example.sts.demoSTS;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStsApplication.class, args);
		
		/*ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/example/xml/beans.xml");
		Jugador jug = (Jugador) app.getBean("jugador1");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("elija un equipo: 1- Betis 2 Sevilla");
		int equipoEntero = scn.nextInt();
		
		switch (equipoEntero) {
		case 1:
			jug.setEquipo(new Betis());
			break;
		case 2:
			jug.setEquipo(new Sevilla());
			break;

		default:
			break;
		}
		
		System.out.println( jug.getNombre() + " " + jug.getEquipo().mostrar() + " " + jug.getCamiseta().getNumero() + " " + jug.getCamiseta().getMarca().getNombre());
		((ConfigurableApplicationContext) app).close();*/
	}

}

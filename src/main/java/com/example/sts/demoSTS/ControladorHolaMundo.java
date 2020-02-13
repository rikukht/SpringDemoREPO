package com.example.sts.demoSTS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHolaMundo {

	@Autowired
	private Jugador jugador;
	
	public void setJugador(Jugador jugador) {
		this.jugador=jugador;
	}
	
	@RequestMapping("/saludo")
	public String saludo() {
		return jugador.getNombre() + " " + jugador.getEquipo().mostrar() + " " + jugador.getCamiseta().getNumero() + " " + jugador.getCamiseta().getMarca().getNombre();
	}
}

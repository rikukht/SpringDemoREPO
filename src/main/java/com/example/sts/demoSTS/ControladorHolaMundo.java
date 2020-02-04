package com.example.sts.demoSTS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHolaMundo {

	@RequestMapping("/saludo")
	public String saludo() {
		return "Hola Mundo";
	}
}

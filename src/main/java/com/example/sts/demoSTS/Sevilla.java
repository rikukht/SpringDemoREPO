package com.example.sts.demoSTS;

import org.springframework.stereotype.Component;

import com.example.interfaces.IEquipo;

@Component
public class Sevilla implements IEquipo {

	@Override
	public String mostrar() {
		return "Sevilla Futbol Club";
	}

}

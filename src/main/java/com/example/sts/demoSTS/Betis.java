package com.example.sts.demoSTS;

import org.springframework.stereotype.Component;

import com.example.interfaces.IEquipo;

@Component
public class Betis implements IEquipo{

	@Override
	public String mostrar() {
		return "Real Betis Balompie";
		
	}
	

}

package com.example.sts.demoSTS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.interfaces.IEquipo;

@Component
public class Jugador {
	
	@Value ("1")
	private int id;
	@Value("Ricardo")
	private String nombre;
	@Autowired
	@Qualifier("betis")
	private IEquipo equipo;
	@Autowired
	private Camiseta camiseta;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}
	

}

package com.busosmoda.mvc.busosmoda.DAO;

import java.time.LocalDate;


import javax.validation.constraints.NotBlank;

import com.busosmoda.mvc.busosmoda.model.Peticion;


public class PeticionesDAO {
	
	@NotBlank
	private  LocalDate fechaSolicitud;
	@NotBlank
	private int numeroTelefonico;
	@NotBlank
	private String cuidad;
	private String peticion;
	
	public PeticionesDAO(Peticion peticion) {
		
	this.fechaSolicitud = peticion.getFechaSolicitud();
	numeroTelefonico =  peticion.getNumeroTelefonico();
	cuidad = peticion.getCuidad();
	this.peticion = peticion.getPeticion();
		
	}
}

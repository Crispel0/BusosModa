package com.busosmoda.mvc.busosmoda.DAO;

import java.time.LocalDate;

import com.busosmoda.mvc.busosmoda.model.Peticiones;

public class PeticionesDAO {
	
	private  LocalDate fechaSolicitud;
	private int numeroTelefonico;
	private String cuidad;
	private String peticion;
	
	public PeticionesDAO(Peticiones peticion) {
		
	this.fechaSolicitud = peticion.getFechaSolicitud();
	numeroTelefonico =  peticion.getNumeroTelefonico();
	cuidad = peticion.getCuidad();
	this.peticion = peticion.getPeticion();
		
	}
}

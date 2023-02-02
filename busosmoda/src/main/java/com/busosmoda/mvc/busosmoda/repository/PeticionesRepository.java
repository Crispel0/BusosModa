package com.busosmoda.mvc.busosmoda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busosmoda.mvc.busosmoda.model.Pedido;
import com.busosmoda.mvc.busosmoda.model.Peticion;

public interface PeticionesRepository extends JpaRepository<Peticion, Long>{

	List<Peticion> findAll ();
}

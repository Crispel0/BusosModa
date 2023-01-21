package com.busosmoda.mvc.busosmoda.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.busosmoda.mvc.busosmoda.model.Pedido;

//Hace una conexion con la base de datos make the connection with the base of dates
	@PersistenceContext
	
	public class PedidosRepository {
		
		private EntityManager entityManager;
	
	/*Obtiene la query de todos los pedidos y las retorna */
	public List<Pedido> RecuperaPedidos() {
		//Crea una query por el comando MySQL select y especifica que es de la clase Pedidos
		Query query = entityManager.createQuery("select ped from pedido ped", Pedido.class);
		//return a list of the query of type Pedido retorna a lista de una query de tipo pedidos
		return query.getResultList();
	}

}

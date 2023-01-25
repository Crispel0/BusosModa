package com.busosmoda.mvc.busosmoda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busosmoda.mvc.busosmoda.model.Pedido;
import com.busosmoda.mvc.busosmoda.model.StatusPedido;
/**
 * La clase PedidosRepository esta encargada de toda la persistencia de los datos para la base de datos
 * @author Usuario
 */

//Hace una conexion con la base de datos make the connection with the base of dates
	@Repository /*not is necessary implement findAll because in the into them this implement this option 
	no es necesario implementar findAll porque in el interiro de ella esta opcion es autoconfigurada*/
	public interface PedidoRepository extends JpaRepository<Pedido,Long> {

	/*hace un filtrado por status */
	List<Pedido> findBystatus(StatusPedido status);
		
}

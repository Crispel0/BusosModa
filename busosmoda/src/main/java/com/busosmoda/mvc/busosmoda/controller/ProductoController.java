package com.busosmoda.mvc.busosmoda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.busosmoda.mvc.busosmoda.DAO.ProductoRequestDAO;
import com.busosmoda.mvc.busosmoda.model.Pedido;
import com.busosmoda.mvc.busosmoda.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class ProductoController {

	@Autowired
	private PedidoRepository Pedidorepository;
	
	@GetMapping("pedido")
	public String formulario () {
		return "producto/formulario";
	}
	
	@PostMapping("nuevo")
	public  String nuevo(ProductoRequestDAO productoDAO) {
		
	Pedido pedido = productoDAO.toPedido();
	
	//Toma la informacion de ProductoDAO y la convierte a pedido basicamente no envia los datos en crudo se utiliza DataAccessObject
	Pedidorepository.save(pedido);
		return "producto/formulario";
	}
}

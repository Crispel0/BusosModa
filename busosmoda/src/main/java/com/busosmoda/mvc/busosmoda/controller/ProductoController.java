package com.busosmoda.mvc.busosmoda.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	
	@GetMapping("formulario")
	public String formulario(ProductoRequestDAO request) {
		return "pedido/formulario";
	}
	
	@PostMapping("nuevo")
	public String nuevo(@Valid ProductoRequestDAO productoDAO, BindingResult result) {
		
		/* Si la validation contiene un error retornar a formulario*/
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
	Pedido pedido = productoDAO.toPedido();
	
	//Toma la informacion de ProductoDAO y la convierte a pedido basicamente no envia los datos en crudo se utiliza DataAccessObject
	Pedidorepository.save(pedido);
		return "redirect:/home";
	}
}

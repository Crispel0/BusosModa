package com.busosmoda.mvc.busosmoda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.busosmoda.mvc.busosmoda.model.Pedido;
import com.busosmoda.mvc.busosmoda.repository.PedidoRepository;

@Controller
public class homecontroller {
	
	@Autowired
	PedidoRepository repository;

	/*toma todos los pedidos y los guarda en una lista
	de pedidos despues los agrega a el modelo y lo llama pedidos para usarlo en las views*/
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Pedido> pedidos = repository.findAll();
		
		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}


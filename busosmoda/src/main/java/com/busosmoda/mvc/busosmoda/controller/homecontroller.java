package com.busosmoda.mvc.busosmoda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.busosmoda.mvc.busosmoda.model.Pedido;
import com.busosmoda.mvc.busosmoda.model.StatusPedido;
import com.busosmoda.mvc.busosmoda.repository.PedidoRepository;

@Controller
@RequestMapping("/home")
public class homecontroller {
	
	@Autowired
	PedidoRepository repository;

	/*toma todos los pedidos y los guarda en una lista
	de pedidos despues los agrega a el modelo y lo llama pedidos para usarlo en las views*/
	
	@GetMapping
	public String home(Model model) {
		
		List<Pedido> pedidos = repository.findAll();
		model.addAttribute("pedidos",pedidos);
		return "home";
	}
	
	@GetMapping("/esperando")
	public String esperando(Model model) {
		
		List<Pedido> pedidos = repository.findBystatus(StatusPedido.ESPERANDO);
		
		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}


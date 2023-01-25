package com.busosmoda.mvc.busosmoda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.util.ErrorHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	/*Metodo que recibe un status de una peticion dependiendo si es ESPERANDO, APROBADO, TERMINADO*/
	@GetMapping("/{status}")
	//el path variable toma la expression language que esta como ruta hacia la String status 
	public String status(@PathVariable String status, Model model) {
		/*encuentra por status y convierte de tipo String a enum y por ultimo el String de status lo convierte a mayuscula 
		porque los valores del enum estan en mayuscula*/
		
		List<Pedido> pedidos = repository.findBystatus(StatusPedido.valueOf(status.toUpperCase()));
		
		
		model.addAttribute("pedidos", pedidos);
		model.addAttribute("status", status);
		
		return "home";
	}
	
	/*En el momento de escribir cualquier otra direccion URL de las especificadas automaticamente redirige a la home porque
	salta la exception IllegalArgumentExcepion*/
	@ExceptionHandler(IllegalArgumentException.class)
	public String Error() {
		
		return "redirect:/home";
	}
}



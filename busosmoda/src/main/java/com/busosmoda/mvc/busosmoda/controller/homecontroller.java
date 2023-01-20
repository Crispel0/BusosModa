package com.busosmoda.mvc.busosmoda.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.busosmoda.mvc.busosmoda.model.Pedido;

@Controller
public class homecontroller {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		
		pedido.setNombreProducto("Buso OnePiece");
		pedido.setDescripcion("Buso Personalizable Color Naranja");
		pedido.setUrlProducto("https://www.facebook.com/Busos-Moda-972146422836711/photos/pcb.5908917995826171/5908916999159604/");
		pedido.setUrlImagen("https://scontent.fpei3-1.fna.fbcdn.net/v/t39.30808-6/319637435_5684853598288347_31615585272699136_n.jpg?stp=dst-jpg_p600x600&_nc_cat=104&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeGmL8MSlLq77Y47aQrzJSw96ziGruChoTHrOIau4KGhMeoeP6Oxd81-aOdgDgW9vZx3vlFMbnScuNrxUUBttmI0&_nc_ohc=e7UiWTlHJp0AX9piOEQ&_nc_ht=scontent.fpei3-1.fna&oh=00_AfBpqJVatu-lnfGJG5Wz6QO-EWkBYNuQG2FtKsNyXZWWQw&oe=63CDE24A");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}


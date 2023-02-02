package com.busosmoda.mvc.busosmoda.DAO;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.busosmoda.mvc.busosmoda.model.Pedido;
import com.busosmoda.mvc.busosmoda.model.StatusPedido;

public class ProductoRequestDAO {
	
	@NotBlank //I don't allow values in blank and values empty
	private String nombreProducto;
	@NotBlank
	private String urlProducto;
	@NotBlank
	private String imgProducto;
	@NotEmpty(message = "{descripcion.notempty}") //n't allow a message empty afeter of send a acquisition request
	@NotBlank
	private String descripcion;
	
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getUrlProducto() {
		return urlProducto;
	}
	
	public void setUrlProducto(String urlProducto) {
		this.urlProducto = urlProducto;
	}
	public String getImgProducto() {
		return imgProducto;
	}
	public void setImgProducto(String imgProducto) {
		this.imgProducto = imgProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNombreProducto(nombreProducto);
		pedido.setUrlProducto(urlProducto);
		pedido.setUrlImagen(imgProducto);
		pedido.setDescripcion(descripcion);
		/* Automacally when we are register a new consult have a status Esperando*/
		pedido.setStatus(StatusPedido.ESPERANDO);
		System.out.println(pedido);
		return pedido;
	}
	
	

}

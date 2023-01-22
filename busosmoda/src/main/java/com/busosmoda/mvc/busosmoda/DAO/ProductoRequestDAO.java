package com.busosmoda.mvc.busosmoda.DAO;

import com.busosmoda.mvc.busosmoda.model.Pedido;

public class ProductoRequestDAO {
	
	private String nombreProducto;
	private String urlProducto;
	private String imgProducto;
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
		return pedido;
	}
	
	

}

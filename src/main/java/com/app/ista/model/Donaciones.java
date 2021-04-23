package com.app.ista.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Spring create a colection in MongoDB 
@Document(collection = "donaciones")
public class Donaciones {
	@Id
	private int idDonacion;
	private String nombreDonacion;
	private int cantidad;
	private List<String> categoria;
	private Date fechaDonacion;
	private String descripcionDonacion;
	private String cedulaPersona;
	
	public Donaciones(int idDonacion, String nombreDonacion, int cantidad, List<String> categoria, Date fechaDonacion,
			String descripcionDonacion, String cedulaPersona) {
		this.idDonacion = idDonacion;
		this.nombreDonacion = nombreDonacion;
		this.cantidad = cantidad;
		this.categoria = categoria;
		this.fechaDonacion = fechaDonacion;
		this.descripcionDonacion = descripcionDonacion;
		this.cedulaPersona = cedulaPersona;
	}

	public int getIdDonacion() {
		return idDonacion;
	}

	public void setIdDonacion(int idDonacion) {
		this.idDonacion = idDonacion;
	}

	public String getNombreDonacion() {
		return nombreDonacion;
	}

	public void setNombreDonacion(String nombreDonacion) {
		this.nombreDonacion = nombreDonacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<String> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<String> categoria) {
		this.categoria = categoria;
	}

	public Date getFechaDonacion() {
		return fechaDonacion;
	}

	public void setFechaDonacion(Date fechaDonacion) {
		this.fechaDonacion = fechaDonacion;
	}

	public String getDescripcionDonacion() {
		return descripcionDonacion;
	}

	public void setDescripcionDonacion(String descripcionDonacion) {
		this.descripcionDonacion = descripcionDonacion;
	}

	public String getCedulaPersona() {
		return cedulaPersona;
	}

	public void setCedulaPersona(String cedulaPersona) {
		this.cedulaPersona = cedulaPersona;
	}

	
}

package entities;

import java.time.LocalDate;

public class Reparacion {
	
	int idReparacion;
	String descripcion;
	LocalDate date;
	Double coste_estimado;
	String estado;
	
	public Reparacion(int idReparacion, String descripcion, LocalDate date, Double coste_estimado, String estado) {
		
		this.idReparacion = idReparacion;
		this.descripcion = descripcion;
		this.date = date;
		this.coste_estimado = coste_estimado;
		this.estado = estado;
	}

	public int getIdReparacion() {
		return idReparacion;
	}

	public void setIdReparacion(int idReparacion) {
		this.idReparacion = idReparacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getCoste_estimado() {
		return coste_estimado;
	}

	public void setCoste_estimado(Double coste_estimado) {
		this.coste_estimado = coste_estimado;
	}
	
	
	

}

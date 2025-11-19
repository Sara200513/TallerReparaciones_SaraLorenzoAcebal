package entities;

import java.time.LocalDate;

public class Reparacion {
	
	private int idReparacion;
	private String descripcion;
	//Vehiculo id_vehiculo;
	//Usuario id_usuario;
	private LocalDate fechaEntrada;
	private Double coste_estimado;
	private Estado estado;
	private int vehiculo_id;
	private int usuario_id;
	
	public Reparacion(int idReparacion, String descripcion, LocalDate fechaEntrada, Double coste_estimado, Estado estado, int vehiculo_id, int usuario_id) {
		
		this.idReparacion = idReparacion;
		this.descripcion = descripcion;
		this.fechaEntrada = fechaEntrada;
		this.coste_estimado = coste_estimado;
		this.estado = estado;
		this.vehiculo_id = vehiculo_id;
		this.usuario_id = usuario_id;
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
		return fechaEntrada;
	}

	public void setDate(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Double getCoste_estimado() {
		return coste_estimado;
	}

	public void setCoste_estimado(Double coste_estimado) {
		this.coste_estimado = coste_estimado;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getVehiculo_id() {
		return vehiculo_id;
	}

	public void setVehiculo_id(int vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	
	
	
	
	
	

}

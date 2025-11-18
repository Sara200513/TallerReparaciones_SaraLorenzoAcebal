package entities;

public class Vehiculo {
	int idVehiculo;
	String matricula;
	String marca;
	String modelo;
	
	public Vehiculo(int idVehiculo, String marca, String matricula, String modelo) {
		super();
		this.idVehiculo = idVehiculo;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	

}

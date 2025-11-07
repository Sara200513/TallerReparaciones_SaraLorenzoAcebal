package entities;

public class Vehiculo {
	int idVehiculo;
	String matricula;
	String modelo;
	
	public Vehiculo(int idVehiculo, String matricula, String modelo) {
		super();
		this.idVehiculo = idVehiculo;
		this.matricula = matricula;
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
	
	
	

}

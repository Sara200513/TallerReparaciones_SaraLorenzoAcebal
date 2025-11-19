package entities;

public class Vehiculo {
	private int idVehiculo;
	private String matricula;
	private String marca;
	private String modelo;
	private int cliente_id;
	
	public Vehiculo(int idVehiculo, String marca, String matricula, String modelo, int cliente_id) {
		super();
		this.idVehiculo = idVehiculo;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente_id= cliente_id;
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

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	
	
	

}

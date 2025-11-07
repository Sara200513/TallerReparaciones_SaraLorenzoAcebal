package entities;

public class Cliente {
	int idCliente;
	String nombre;
	int telefono;
	String email;
	
	public Cliente(int id_Cliente, String nombre, String email, int telefono) {
		this.idCliente = id_Cliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public int getId_Cliente() {
		return idCliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.idCliente = id_Cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
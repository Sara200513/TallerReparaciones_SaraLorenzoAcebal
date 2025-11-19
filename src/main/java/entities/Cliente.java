package entities;

public class Cliente {
	private int idCliente;
	private String dni;
	private String nombre;
	private String telefono;
	private String email;
	

	public Cliente(String dni, String nombre, String telefono, String email) {
		
		this.dni = dni;
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
	
	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
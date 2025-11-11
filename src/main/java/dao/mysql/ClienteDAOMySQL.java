package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DBConnection;
import dao.Interface.ClienteDAO;
import entities.Cliente;

public class ClienteDAOMySQL implements ClienteDAO{
	private Connection conexion;
	
	public ClienteDAOMySQL() {
		conexion = DBConnection.getInstance().getConnection();
	}
	
	@Override
	public void insert(Cliente c) {
		try {
			String sql = "INSERT INTO cliente (dni, nombre, telefono, email) VALUES(?, ?, ?, ?)";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, c.getDni());
			pst.setString(2, c.getNombre());
			pst.setString(3, c.getTelefono());
			pst.setString(4, c.getEmail());
			
			int resul = pst.executeUpdate();
			System.out.println("Resultado de insercion: " + resul);
		} catch (SQLException e) {
			System.out.println("> NOK : " + e.getMessage());
		}
	}
	
	@Override
	public void update(Cliente c) {
		
		
//		UPDATE empleados
//		SET puesto = 'Supervisor',
//		    salario = 3500.00,
//		    estado = 'activo'
//		WHERE id = 3;
	}
//	void delete(String dni);
//	ArrayList<Cliente> findall();
//	Cleinte findByDni(String dni);
//	

	@Override
	public void delete(String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Cliente> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findByDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

}

package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DBConnection;
import dao.Interface.ClienteDAO;
import entities.Cliente;

public class ClienteDAOMySQL implements ClienteDAO {
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

		try {
			String sql = "UPDATE cliente SET dni = ?, nombre = ?, telefono = ?, email = ? WHERE id_cliente = ?;";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, c.getDni());
			pst.setString(2, c.getNombre());
			pst.setString(3, c.getTelefono());
			pst.setString(4, c.getEmail());
			pst.setInt(5, c.getId_Cliente());

			int filas = pst.executeUpdate();
			if (filas > 0)
				System.out.println("Cliente actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(">Nok: " + e.getMessage());

		}

	}

	@Override
	public void delete(String dni) {
		String sqlDelete = "DELETE FROM cliente WHERE dni = ?;";
		try {
			PreparedStatement pst = conexion.prepareStatement(sqlDelete);
			pst.setString(1, dni);

			int filas = pst.executeUpdate();
			if (filas > 0) {
				System.out.println("Persona con id "+ 1+ " eliminada correctamente");
			} else {
				System.out.println("Persona con id " + 1 + " no se ha encontrado en la base de datos");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	    @Override
	    public ArrayList<Cliente> findAll() {
	        // Aquí iría la lógica para obtener los clientes
	        ArrayList<Cliente> clientes = new ArrayList<>();
	        // Ejemplo: añadir clientes ficticios
	        clientes.add(new Cliente("Juan", "Pérez", null, null));
	        clientes.add(new Cliente("María", "García", null, null));
	        return clientes;
	    }

		
		@Override
		public Cliente findByDni(String dni) {
			try {
				String sql = "SELET id_cliente, nombre, telefono, email FROM cliente WHERE dni = ?; ";
				PreparedStatement pst = conexion.prepareStatement(sql);
	
				pst.setString(1, dni);
				int filas = pst.executeUpdate();
				if (filas > 0) {
					System.out.println("Persona con dni"+ 1 +" eliminada correctamente");
				} else {
					System.out.println("Persona con dni"+  1 +" no se ha encontrado en la base de datos");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		
	}







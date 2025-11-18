package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DBConnection;
import dao.Interface.VehiculoDAO;
import entities.Cliente;
import entities.Vehiculo;

public class VehiculoMySQL implements VehiculoDAO{
	private Connection conexion;
	
	public VehiculoMySQL(){
		conexion = DBConnection.getInstance().getConnection();
	}

	@Override
	public void inser(Vehiculo v, Cliente c) {
		try {
			String sql = "INSERT INTO vehiculo (matricula, marca, modelo, cliente_id) VALUES(?, ?, ?, ?)";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, v.getMatricula());
			pst.setString(2, v.getMarca());
			pst.setString(3, v.getModelo());
			pst.setInt(4, c.getId_Cliente());

			int resul = pst.executeUpdate();
			System.out.println("Resultado de insercion: " + resul);
		} catch (SQLException e) {
			System.out.println("> NOK : " + e.getMessage());
		}
		
	}

	@Override
	public void update(Vehiculo v) {
		try {
			String sql = "UPDATE vehiculo SET matricula = ?, marca = ?, modelo = ? WHERE id_vehiculo = ?;";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, v.getMatricula());
			pst.setString(2, v.getMarca());
			pst.setString(3, v.getModelo());
			pst.setInt(4, v.getIdVehiculo());
			

			int filas = pst.executeUpdate();
			if (filas > 0)
				System.out.println("Vehículo actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(">Nok: " + e.getMessage());

		}
		
	}

	@Override
	public void delete(String matricula) {
		String sqlDelete = "DELETE FROM vehiculo WHERE matricula = ?;";
		try {
			PreparedStatement pst = conexion.prepareStatement(sqlDelete);
			pst.setString(1, matricula);

			int filas = pst.executeUpdate();
			if (filas > 0) {
				System.out.println("Vehiculo con matricula " + 1 + " eliminada correctamente");
			} else {
				System.out.println("Vehiculo con matricula " + 1 + " no se ha encontrado en la base de datos");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Vehiculo findByMatricula(String matricula) {
		try {
			String sql = "SELET id_vehiculo,marca, modelo, cliente_id FROM vehiculo WHERE matricula = ?; ";
			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, matricula);
			int filas = pst.executeUpdate();
			if (filas > 0) {
				System.out.println(""+ 1 +" eliminada correctamente");
			} else {
				System.out.println("Persona con dni"+  1 +" no se ha encontrado en la base de datos");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Vehiculo> findall() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import dao.DBConnection;
import dao.Interface.ReparacionDAO;
import entities.Estado;
import entities.Reparacion;

public class ReparacionDAOMySQL implements ReparacionDAO {
	private Connection conexion;
	
	public ReparacionDAOMySQL() {
		conexion = DBConnection.getInstance().getConnection();
	}

	@Override
	public void insert(Reparacion r) {
		try {
			String sql = "INSERT INTO reparacion (descripcion, fechaEntrada, coste_estimado, estado, vehiculo_id, usuario_id) VALUES (?, ?, ?, ?, ?);";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, r.getDescripcion());
			LocalDate fecha = r.getDate();
			pst.setDate(2, java.sql.Date.valueOf(fecha));
			pst.setDouble(3, r.getCoste_estimado());
			pst.setString(4, r.getEstado().name());
			pst.setInt(5, r.getVehiculo_id());
			pst.setInt(6, r.getUsuario_id());
			int resul = pst.executeUpdate();
			System.out.println("Resulatado de la insercion: " + resul);
		} catch (SQLException e) {
			System.out.println("> NOK: " + e.getMessage());
		}
		
	}

	@Override
	public void update(Reparacion r) {
		try{ 
			String sql = "UPDATE reparacion descripcion = ?, fechaEntrada = ?, coste_estimado = ?, estado = ?, vehiculo_ id = ?, usuario_id = ? WHERE   id_reparacion = ?;"; 
			PreparedStatement pst = conexion.prepareStatement(sql); 
			pst.setString(1, r.getDescripcion());
			LocalDate fecha = r.getDate();
			pst.setDate(2, java.sql.Date.valueOf(fecha)); 
			pst.setDouble(3, r.getCoste_estimado()); 
			pst.setString(4, r.getEstado().name()); 
			pst.setInt(5, r.getVehiculo_id()); 
			pst.setInt(6, r.getUsuario_id()); 
			pst.setInt(7, r.getIdReparacion());
			
			int filas = pst.executeUpdate(); 
			if (filas > 0) { 
				System.out.println("Repareción actualizada correctamente."); 
				} 
			}catch (SQLException e) {
				System.out.println("> NOK: " + e.getMessage()); 
		} 		
	}

	@Override

	public void delete(Reparacion r, Strig matricula) {
		try {
			String sqlV = "SELECT id_vehiculo FROM vehiculo WHERE matricula = ?;";
			PreparedStatement pstV = conexion.prepareStatement(sqlV);
			pstV.setString(1, matricula);
			var rs = pstV.executeQuery();
			
			 if (rs.next()) {
				 int vehiculoId = rs.getInt("id_vehiculo");
		     
				 String sqlD = "DELETE FROM reparacion WHERE vehiculo_id = ?;";
				 PreparedStatement pstD = conexion.prepareStatement(sqlD);
				 pstD.setInt(1, r.getVehiculo_id);
				 
				 int filas = pstD.executeUpdate();
				 System.out.println("Reparaciones eliminadas: " + filas);
			 } else {
				 System.out.println("NO se encontó  a ningún vehículo con la matricula: " + matricula);
			 }
		} catch (SQLException e) {
			System.out.println("> NOK: " + e.getMessage());
		}
	}
		
	}

	@Override
	public Reparacion findByMatricula(Reparacion r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reparacion> findFinalizadas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reparacion> findByVehiculo(Reparacion r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reparacion> findByCliente(Reparacion r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reparacion> findByMecanico(Reparacion r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEstado(Reparacion r, Estado estado) {
		// TODO Auto-generated method stub
		
	}
	

}

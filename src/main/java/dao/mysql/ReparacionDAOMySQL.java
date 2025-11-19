package dao.mysql;

import java.sql.Connection;
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
		
		
	}

	@Override
	public void update(Reparacion r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Reparacion r) {
		// TODO Auto-generated method stub
		
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

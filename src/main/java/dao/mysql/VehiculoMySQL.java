package dao.mysql;

import java.sql.Connection;

import dao.DBConnection;
import dao.Interface.VehiculoDAO;

public class VehiculoMySQL implements VehiculoDAO{
	private Connection conexion;
	
	public VehiculoMySQL(){
		conexion = DBConnection.getInstance().getConnection();
	}
	
	

}

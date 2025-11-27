package dao.Interface;

import java.util.ArrayList;

import entities.Vehiculo;
import entities.Estado;
import entities.Reparacion;


public interface ReparacionDAO {
	void insert(Reparacion r);
	void update(Reparacion r);
	void delete(String matricula);
	Reparacion findByMatricula(Reparacion r);
	ArrayList<Reparacion> findFinalizadas();
	ArrayList<Reparacion> findByVehiculo(Reparacion r);
	ArrayList<Reparacion> findByCliente(Reparacion r);	
	ArrayList<Reparacion> findByMecanico(Reparacion r);
	void updateEstado(Reparacion r, Estado estado); 
	
	

}

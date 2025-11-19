package dao.Interface;

import java.util.ArrayList;

import entities.Vehiculo;

public interface VehiculoDAO {
	void inser(Vehiculo v);
	void update(Vehiculo v);
	void delete(String matricula);
	Vehiculo findByMatricula(String matricula);
	ArrayList<Vehiculo> findall();
	

}

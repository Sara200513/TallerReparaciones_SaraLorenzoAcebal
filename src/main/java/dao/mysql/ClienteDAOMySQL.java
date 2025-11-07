package dao.mysql;

import java.util.ArrayList;

public class ClienteDAOMySQL {
	int insert(Cliente c);
	int update(Cliente c);
	int delete(String dni);
	ArrayList<Cliente c> findall();
	Cleinte findByDni(String dni);
	

}

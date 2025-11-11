package controlador;

import dao.DAOFactory;
import dao.mysql.ClienteDAOMySQL;
import entities.Cliente;

public class ControladorTaller {
	public static void main(String[] args) {
		ClienteDAOMySQL clienteDAO = DAOFactory.getClienteDAO();
		clienteDAO.insert(new Cliente("53777224G", "Sara", "123456789", "sarala19@educastur.es"));
	}
}

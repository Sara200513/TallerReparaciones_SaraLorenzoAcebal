package dao.mysql;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import entities.Cliente;

public class ClienteDAOMySQLTest {

    private ClienteDAOMySQL clienteDAO;

    @BeforeEach
    void setUp() {
        clienteDAO = new ClienteDAOMySQL();
    }

    @Test
    void testInsert() {
        Cliente c = new Cliente("12345678A", "Juan Pérez", "600123456", "juan@test.com");
        assertDoesNotThrow(() -> clienteDAO.insert(c));
        // Aquí podrías comprobar con findAll() si se añadió
    }

    @Test
    void testUpdate() {
        Cliente c = new Cliente("12345678A", "Juan Pérez", "600123456", "juan@test.com");
        c.setId_Cliente(1); // suponiendo que existe en BD
        assertDoesNotThrow(() -> clienteDAO.update(c));
    }

    @Test
    void testDelete() {
        assertDoesNotThrow(() -> clienteDAO.delete("12345678A"));
    }

    @Test
    void testFindAll() {
        ArrayList<Cliente> clientes = clienteDAO.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size() > 0);
    }
}

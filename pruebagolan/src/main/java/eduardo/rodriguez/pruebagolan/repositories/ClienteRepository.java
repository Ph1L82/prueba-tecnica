package eduardo.rodriguez.pruebagolan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eduardo.rodriguez.pruebagolan.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNombre(String nombre);
}

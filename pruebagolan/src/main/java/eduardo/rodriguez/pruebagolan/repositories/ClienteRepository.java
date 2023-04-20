package eduardo.rodriguez.pruebagolan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import eduardo.rodriguez.pruebagolan.models.Cliente;
import eduardo.rodriguez.pruebagolan.models.Prueba;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    @Query(value = "SELECT c.nombre FROM cliente c JOIN sucursal s WHERE c.id = s.id_cliente AND u.nombre=?1", nativeQuery = true)
        Prueba findByNombre(String nombre);
}

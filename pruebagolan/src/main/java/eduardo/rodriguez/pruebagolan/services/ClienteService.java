package eduardo.rodriguez.pruebagolan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eduardo.rodriguez.pruebagolan.models.Cliente;
import eduardo.rodriguez.pruebagolan.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClienteSucursal(String nombre) {
        return clienteRepository.findByNombre(nombre);
    }
}

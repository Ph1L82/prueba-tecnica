package eduardo.rodriguez.pruebagolan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eduardo.rodriguez.pruebagolan.models.Prueba;
import eduardo.rodriguez.pruebagolan.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Prueba getClienteSucursal() {
        return clienteRepository.findByNombre("JOSE TORRES");
    }
}

package eduardo.rodriguez.pruebagolan.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eduardo.rodriguez.pruebagolan.models.Cliente;
import eduardo.rodriguez.pruebagolan.services.ClienteService;

@RestController
@RequestMapping("/golan-api/v1/prueba")
public class ClientesController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    private ResponseEntity<Map<String, String>> prueba() {

        List<Cliente> clientes = clienteService.getClienteSucursal("JOSE TORRES");
        Map<String, String> resultado = new HashMap<>();
        resultado.put("nombre cliente", clientes.get(0).getNombre());
        resultado.put("direccion sucursal", clientes.get(0).getSucursales().get(0).getDireccion());
        return ResponseEntity.ok(resultado);
    }
}

package eduardo.rodriguez.pruebagolan.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eduardo.rodriguez.pruebagolan.models.Prueba;
import eduardo.rodriguez.pruebagolan.services.ClienteService;

@RestController
@RequestMapping("/golan-api/v1/prueba")
public class ClientesController{
    @Autowired
private ClienteService clienteService;

    @GetMapping
    private ResponseEntity<Prueba> prueba() {
        

        return ResponseEntity.ok(clienteService.getClienteSucursal());

    }
}

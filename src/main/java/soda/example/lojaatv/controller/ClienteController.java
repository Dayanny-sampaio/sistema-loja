package soda.example.lojaatv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import soda.example.lojaatv.model.Cliente;
import soda.example.lojaatv.service.ClienteService;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/clientes")
    public ResponseEntity Cadastrar(@RequestBody Cliente cliente){
        try {
            Cliente salvo = clienteService.Cadastrar(cliente);
            return ResponseEntity.ok(salvo);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}

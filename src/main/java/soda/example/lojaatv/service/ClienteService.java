package soda.example.lojaatv.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import soda.example.lojaatv.model.Cliente;
import soda.example.lojaatv.repository.ClienteRepository;

import java.time.LocalDateTime;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente Cadastrar(Cliente cliente) {

        if (cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        if (clienteRepository.existsByEmail(cliente.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        cliente.setAtivo(true);
        cliente.setDataCadastro(LocalDateTime.now());
        return clienteRepository.save(cliente);

    }
}

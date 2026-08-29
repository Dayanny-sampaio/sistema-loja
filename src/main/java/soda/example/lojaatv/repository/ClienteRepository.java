package soda.example.lojaatv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soda.example.lojaatv.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    boolean existsByEmail(String email);
}

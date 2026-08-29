package soda.example.lojaatv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Boolean ativo;
    private LocalDateTime dataCadastro;

}

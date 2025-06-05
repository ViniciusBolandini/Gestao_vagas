package br.com.vinicius.gestao_vagas.modules.candidate.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;
    private String name;
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo username não pode conter espaço")
    private String usarname;
    @Email(message = "O campo (email) deve conter um e-mail válido")
    private String email;
    @Length(min = 3)
    private String password;
    private String description;
    private String curriculum;
}

package br.com.vinicius.gestao_vagas.modules.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.vinicius.gestao_vagas"})
@EntityScan(basePackages = {"br.com.vinicius.gestao_vagas.modules.candidate.entity"})
public class GestaoVagasApplication {
    public static void main(String[] args){
        SpringApplication.run(GestaoVagasApplication.class, args);
    }
}

package br.com.vinicius.gestao_vagas.modules.candidate.controller;

import br.com.vinicius.gestao_vagas.modules.candidate.entity.CandidateEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    @PostMapping("/c")
    public void create(@RequestBody CandidateEntity candidate){
        System.out.println("Candidato:");
        System.out.println(candidate.getEmail());
    }

}

package br.com.seteideias.tratamentodeerrosrest.controller;

import br.com.seteideias.tratamentodeerrosrest.service.InicioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inicio")
public class InicioController {

    private InicioService inicioService;

    public InicioController(InicioService inicioService) {
        this.inicioService = inicioService;
    }


    @GetMapping("/{nomeDaPessoaQueEntra}")
    public String inicio(@PathVariable("nomeDaPessoaQueEntra") String nomeLogado) {

        return inicioService.fazAlgumaCoisa();
    }

    }

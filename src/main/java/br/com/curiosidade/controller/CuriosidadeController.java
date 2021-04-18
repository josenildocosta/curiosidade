package br.com.curiosidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuriosidadeController {
    @GetMapping("/buscar/{duvida}")
    public String buscar(@PathVariable String duvida){
        return "Testando "+duvida;
    }
}

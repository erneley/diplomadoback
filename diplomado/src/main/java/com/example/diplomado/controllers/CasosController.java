package com.example.diplomado.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diplomado.services.CasosService;
import com.example.diplomado.models.Casos;

@RestController
@RequestMapping("/casoss")
public class CasosController {
    private final CasosService casosService;

    public CasosController(CasosService casosService) {
        this.casosService = casosService;
    }

    @PostMapping
    public Casos createCasos(@RequestBody Casos casos) {
        return casosService.createCasos(casos);
    }

    @GetMapping("/{id}")
    public Casos getCasosById(@PathVariable Long id) {
        return casosService.getCasosById(id);
    }

    @GetMapping
    public List<Casos> getAllCasoss() {
        return casosService.getAllCasoss();
    }

    @PutMapping
    public Casos updateCasos(@RequestBody Casos casos) {
        return casosService.updateCasos(casos);
    }

    @DeleteMapping("/{id}")
    public void deleteCasosById(@PathVariable Long id) {
        casosService.deleteCasosById(id);
    }
}
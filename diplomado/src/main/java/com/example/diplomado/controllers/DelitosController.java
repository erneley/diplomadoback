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

import com.example.diplomado.services.DelitosService;
import com.example.diplomado.models.Delitos;

@RestController
@RequestMapping("/delitoss")
public class DelitosController {
    private final DelitosService delitosService;

    public DelitosController(DelitosService delitosService) {
        this.delitosService = delitosService;
    }

    @PostMapping
    public Delitos createDelitos(@RequestBody Delitos delitos) {
        return delitosService.createDelitos(delitos);
    }

    @GetMapping("/{id}")
    public Delitos getDelitosById(@PathVariable Long id) {
        return delitosService.getDelitosById(id);
    }

    @GetMapping
    public List<Delitos> getAllDelitoss() {
        return delitosService.getAllDelitoss();
    }

    @PutMapping
    public Delitos updateDelitos(@RequestBody Delitos delitos) {
        return delitosService.updateDelitos(delitos);
    }

    @DeleteMapping("/{id}")
    public void deleteDelitosById(@PathVariable Long id) {
        delitosService.deleteDelitosById(id);
    }
}
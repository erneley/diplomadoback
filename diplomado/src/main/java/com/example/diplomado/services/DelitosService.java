package com.example.diplomado.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.diplomado.models.Delitos;
import com.example.diplomado.repositories.DelitosRepository;

@Service
public class DelitosService {
    private final DelitosRepository delitosRepository;

    public DelitosService(DelitosRepository delitosRepository) {
        this.delitosRepository = delitosRepository;
    }

    public Delitos createDelitos(Delitos delitos) {
        return delitosRepository.save(delitos);
    }

    public Delitos getDelitosById(Long id) {
        return delitosRepository.findById(id).orElseThrow(() -> new RuntimeException("Delitos not found"));
    }

    public List<Delitos> getAllDelitoss() {
        return delitosRepository.findAll();
    }

    public Delitos updateDelitos(Delitos delitos) {
        return delitosRepository.save(delitos);
    }

    public void deleteDelitosById(Long id) {
        delitosRepository.deleteById(id);
    }
}
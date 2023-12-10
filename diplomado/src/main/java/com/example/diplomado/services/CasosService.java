package com.example.diplomado.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.diplomado.models.Casos;
import com.example.diplomado.repositories.CasosRepository;

@Service
public class CasosService {
    private final CasosRepository casosRepository;

    public CasosService(CasosRepository casosRepository) {
        this.casosRepository = casosRepository;
    }

    public Casos createCasos(Casos casos) {
        return casosRepository.save(casos);
    }

    public Casos getCasosById(Long id) {
        return casosRepository.findById(id).orElseThrow(() -> new RuntimeException("Casos not found"));
    }

    public List<Casos> getAllCasoss() {
        return casosRepository.findAll();
    }

    public Casos updateCasos(Casos casos) {
        return casosRepository.save(casos);
    }

    public void deleteCasosById(Long id) {
        CasosRepository.deleteById(id);
    }
}
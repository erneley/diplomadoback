package com.example.diplomado.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.diplomado.models.Roles;
import com.example.diplomado.repositories.RolesRepository;

@Service
public class RolesService {
    private final RolesRepository rolesRepository;

    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public Roles createRoles(Roles roles) {
        return rolesRepository.save(roles);
    }

    public Roles getrolesById(Long id) {
        return rolesRepository.findById(id).orElseThrow(() -> new RuntimeException("roles not found"));
    }

    public List<Roles> getAllRoless() {
        return rolesRepository.findAll();
    }

    public Roles updateRoles(Roles roles) {
        return rolesRepository.save(casos);
    }

    public void deleteRolesById(Long id) {
        rolesRepository.deleteById(id);
    }
}
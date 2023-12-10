package com.example.diplomado.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diplomado.services.RolesService;
import com.example.diplomado.models.Roles;
import com.example.diplomado.repositories.RolesRepository;

@RestController
// @CrossOrigin(origins = "http://localhost:3000/user")
// @CrossOrigin(origins = "*")
@CrossOrigin(origins = "*")
@RequestMapping("/roles")
public class RolesController {
    private final RolesService rolesService;
    // private final RolesRepository xx;

    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @PostMapping
    public Roles create(@RequestBody Roles roles) {
        return rolesService.createRoles(roles);
        // return xx.save(roles);

    }

    @GetMapping("/{id}")
    public Roles getRolesById(@RequestBody Long id) {
        return rolesService.getrolesById(id);
    }

    @GetMapping
    public List<Roles> getAllRoless() {
        return rolesService.getAllRoless();
    }

    @PutMapping
    public Roles updateRoles(@RequestBody Roles roles) {
        return rolesService.updateRoles(roles);
    }

    @DeleteMapping("/{id}")
    public void deleteRolesById(@PathVariable Long id) {
        rolesService.deleteRolesById(id);
    }
}
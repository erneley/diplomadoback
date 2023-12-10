package com.example.diplomado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.diplomado.models.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}

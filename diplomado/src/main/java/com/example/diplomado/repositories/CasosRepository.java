package com.example.diplomado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.diplomado.models.Casos;

@Repository
public interface CasosRepository extends JpaRepository<Casos, Long> {

}

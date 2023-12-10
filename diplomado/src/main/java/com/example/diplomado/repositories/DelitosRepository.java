package com.example.diplomado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.diplomado.models.Delitos;

@Repository
public interface DelitosRepository extends JpaRepository<Delitos, Long> {

}

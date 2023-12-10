package com.example.diplomado.models;

import java.util.List;

import org.hibernate.grammars.hql.HqlParser.DatetimeFieldContext;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String nombre;
    private String apellido;
    // private String password;
    // private DatetimeFieldContext fecha_nac;
    // private boolean enabled;
    // private String image;
    // private boolean red_social;

    // @OneToMany(cascade = CascadeType.ALL)
    // private List<Vehiculos> vehiculos = new ArrayList<>();

}

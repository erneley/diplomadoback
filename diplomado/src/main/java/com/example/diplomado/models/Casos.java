package com.example.diplomado.models;

import org.hibernate.grammars.hql.HqlParser.DatetimeFieldContext;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Casos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // private DatetimeFieldContext fechahora;
    private float latitud;
    private float longitud;
    private float altitud;
    private boolean is_visisble;
    private String detalle;
    private String url_map;
    private String mi_url;
    private long delitos_id;
    private long usuarios_id;
}

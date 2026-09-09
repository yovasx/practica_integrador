package com.unifranz.proyectointegrador.domain;

import jakarta.persistence.*;

/**
 * @author Paul Rojas Araoz
 */
@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Tu campo de eliminación lógica
    @Column(name = "estado")
    private Boolean estado = true;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
package com.org.demoagenda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Agenda extends IdentifiedId {

    private String nombreCliente;

    private LocalDate fecha;

    private String motivo;

    private String comentarios;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idUsuario",nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Usuario usuario;


}

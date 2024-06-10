package com.org.demoagenda.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Agenda extends IdentifiedId {

    private String nombreCliente;

    private LocalDate fecha;

    private String motivo;

    private String comentarios;

}

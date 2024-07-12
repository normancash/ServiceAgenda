package com.org.demoagenda.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class AgendaDTO {

    private String nombreCliente;

    private LocalDate fecha;

    private String motivo;

    private String comentarios;

    private UUID idUsuario;
}

package com.org.demoagenda.controller;

import com.org.demoagenda.dto.AgendaDTO;
import com.org.demoagenda.model.Agenda;
import com.org.demoagenda.repository.IRepoAgenda;
import com.org.demoagenda.service.IServiceAgenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/agenda")
@CrossOrigin("*")
public class ControllerAgenda {

    @Autowired
    private IServiceAgenda serviceAgenda;

    @Autowired
    private IRepoAgenda repoAgenda;

    @GetMapping("/all")
    public List<Agenda> getAll() {
        return serviceAgenda.getAll();
    }

    @PostMapping("/create")
    public Agenda create(@RequestBody AgendaDTO agendaDTO) {
       return serviceAgenda.create(agendaDTO);
    }

    @GetMapping("/agendaByUsuario")
    public List<Agenda> getAll(@RequestParam("idUsuario")UUID idUsuario) {
        return repoAgenda.getAgendaByUsuario(idUsuario);
    }
}

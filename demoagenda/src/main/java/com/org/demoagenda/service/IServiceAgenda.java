package com.org.demoagenda.service;

import com.org.demoagenda.dto.AgendaDTO;
import com.org.demoagenda.model.Agenda;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceAgenda {

    public List<Agenda> getAll();

    public Agenda create(AgendaDTO agendaDTO);
}

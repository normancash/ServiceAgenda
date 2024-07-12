package com.org.demoagenda.service;

import com.org.demoagenda.dto.AgendaDTO;
import com.org.demoagenda.model.Agenda;
import com.org.demoagenda.model.Usuario;
import com.org.demoagenda.repository.IRepoAgenda;
import com.org.demoagenda.repository.IRepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAgenda implements IServiceAgenda{

    @Autowired
    private IRepoAgenda repoAgenda;

    @Autowired
    private IRepoUsuario repoUsuario;

    @Override
    public List<Agenda> getAll() {
        return repoAgenda.findAll();
    }

    @Override
    public Agenda create(AgendaDTO agendaDTO) {
       Usuario usuario = repoUsuario.findById(agendaDTO.getIdUsuario()).orElse(null);
       if (usuario != null) {
           Agenda agenda = new Agenda();
           agenda.setComentarios(agendaDTO.getComentarios());
           agenda.setMotivo(agendaDTO.getMotivo());
           agenda.setFecha(agendaDTO.getFecha());
           agenda.setNombreCliente(agendaDTO.getNombreCliente());
           agenda.setUsuario(usuario);
           return repoAgenda.save(agenda);
       }
       return null;
    }
}

package com.org.demoagenda.service;

import com.org.demoagenda.model.Agenda;
import com.org.demoagenda.repository.IRepoAgenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAgenda implements IServiceAgenda{

    @Autowired
    private IRepoAgenda repoAgenda;

    @Override
    public List<Agenda> getAll() {
        return repoAgenda.findAll();
    }

    @Override
    public Agenda create(Agenda agenda) {
        return repoAgenda.save(agenda);
    }
}
